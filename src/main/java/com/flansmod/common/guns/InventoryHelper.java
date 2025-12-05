package com.flansmod.common.guns;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * 为任意的物品栏添加了对InventoryPlayer堆叠组合方法的访问
 */
public class InventoryHelper {
    /*
     * 用于不合并弹药或需要将物品强制放入上部物品栏的可驾驶实体
     */
    public static boolean addItemStackToInventory(IInventory inventory, ItemStack stack, boolean creative) {
        return addItemStackToInventory(inventory, stack, creative, false, false);
    }

    public static boolean addItemStackToInventory(IInventory inventory, ItemStack stack, boolean creative, boolean combineAmmo, boolean putInUpperInventory) {
        if (stack == null) {
            return false;
        } else if (stack.stackSize == 0) {
            return false;
        } else {
            try {
                int invSlot;

                if (combineAmmo) {
                    // 计算剩余子弹数量（最大耐久 - 已损伤耐久）
                    int numberBulletsLeft = stack.getMaxDamage() - stack.getItemDamage();

                    for (int i = 0; i < inventory.getSizeInventory() - 4; i++) {
                        ItemStack is = inventory.getStackInSlot(i);
                        if (is == null || !is.isItemDamaged() || is.getItem() != stack.getItem()) continue;

                        // 计算与准备放入物品栏的弹匣的损伤耐久差异（如果准备放入物品栏的弹匣剩余量足够填充is）
                        int itemDamageDiff = is.getItemDamage() - numberBulletsLeft;
                        if (itemDamageDiff >= 0) {
                            is.setItemDamage(itemDamageDiff);
                            return true;
                        } else {
                            is.setItemDamage(0);

                            // 尝试将新填充的弹药与已存在的弹药合并
                            for (int j = 0; j < inventory.getSizeInventory() - 4; j++) {
                                ItemStack possibleStackToCombineWith = inventory.getStackInSlot(j);
                                if (possibleStackToCombineWith == null || j == i || possibleStackToCombineWith.isItemDamaged()
                                        || possibleStackToCombineWith.getItem() != is.getItem()) continue;

                                if (possibleStackToCombineWith.getMaxStackSize() - possibleStackToCombineWith.stackSize >= is.stackSize) {
                                    possibleStackToCombineWith.stackSize += is.stackSize;
                                    inventory.setInventorySlotContents(i, null);
                                    break;
                                }
                            }

                            numberBulletsLeft = -itemDamageDiff;
                            stack.setItemDamage(stack.getMaxDamage() - numberBulletsLeft);
                        }
                    }
                }

                // 如果物品仍有耐久损伤，尝试将其放入物品栏
                if (stack.isItemDamaged()) {
                    // 获取第一个空的物品栏位置
                    invSlot = getFirstEmptyStack(inventory, putInUpperInventory);

                    if (invSlot >= 0) {
                        ItemStack stackToAdd = ItemStack.copyItemStack(stack);
                        stackToAdd.animationsToGo = 5;
                        inventory.setInventorySlotContents(invSlot, stackToAdd);
                        stack.stackSize = 0;
                        return true;
                    } else if (creative) {
                        stack.stackSize = 0;
                        return true;
                    }

                    // 如果物品无法放入物品栏，返回false将其丢弃
                    return false;

                } else {
                    do {
                        invSlot = stack.stackSize;
                        stack.stackSize = storePartialItemStack(inventory, stack, putInUpperInventory);
                    } while (stack.stackSize > 0 && stack.stackSize < invSlot);

                    if (stack.stackSize == invSlot && creative) {
                        stack.stackSize = 0;
                        return true;
                    } else {
                        return stack.stackSize < invSlot;
                    }
                }
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                return false;
            }
        }
    }

    public static int storeItemStack(IInventory inventory, ItemStack stack) {

        for (int i = 0; i < inventory.getSizeInventory(); ++i) {
            ItemStack oldStack = inventory.getStackInSlot(i);
            if (oldStack != null
                    && oldStack.getItem() == stack.getItem()
                    && oldStack.isStackable()
                    && oldStack.stackSize < oldStack.getMaxStackSize()
                    && oldStack.stackSize < inventory.getInventoryStackLimit()
                    && (!oldStack.getHasSubtypes() || oldStack.getItemDamage() == stack.getItemDamage())
                    && ItemStack.areItemStackTagsEqual(oldStack, stack)) {
                return i;
            }
        }

        return -1;
    }

    public static int storePartialItemStack(IInventory inventory, ItemStack stack, boolean putInUpperInventory) {

        Item item = stack.getItem();
        int j = stack.stackSize;
        int k;

        // 如果物品不可叠加，只需找到一个空的槽位
        if (stack.getMaxStackSize() == 1) {
            k = getFirstEmptyStack(inventory, putInUpperInventory);
            // 如果找不到，返回
            if (k < 0) {
                return j;
            } else {
                if (inventory.getStackInSlot(k) == null) {
                    inventory.setInventorySlotContents(k, ItemStack.copyItemStack(stack));
                }

                return 0;
            }
        } else {
            k = storeItemStack(inventory, stack);
            if (k < 0) {
                k = getFirstEmptyStack(inventory, putInUpperInventory);
            }

            if (k >= 0) {
                ItemStack oldStack = inventory.getStackInSlot(k);

                if (oldStack == null) {
                    oldStack = new ItemStack(item, 0, stack.getItemDamage());
                    if (stack.hasTagCompound()) {
                        oldStack.setTagCompound((NBTTagCompound) stack.getTagCompound().copy());
                    }
                    inventory.setInventorySlotContents(k, oldStack);
                }

                int l = j;

                if (j > oldStack.getMaxStackSize() - oldStack.stackSize) {
                    l = oldStack.getMaxStackSize() - oldStack.stackSize;
                }

                if (l > inventory.getInventoryStackLimit() - oldStack.stackSize) {
                    l = inventory.getInventoryStackLimit() - oldStack.stackSize;
                }

                if (l != 0) {
                    j -= l;
                    oldStack.stackSize += l;
                    oldStack.animationsToGo = 5;
                }
            }
            return j;
        }
    }

    /** InventoryPlayer中的方法 */
    public static int getFirstEmptyStack(IInventory inventory, boolean putInUpperInventory) {
        // 从物品栏槽位减去4，以防止弹药被放入护甲槽位

        int firstEmpty = -1;

        for (int i = 0; i < (inventory.getSizeInventory() - 4); i++) {
            if (inventory.getStackInSlot(i) == null) {
                if (putInUpperInventory && i < 9) {
                    if (firstEmpty == -1) firstEmpty = i;
                } else
                    return i;
            }
        }

        return firstEmpty;
    }

    public static void dropInventoryItems(World worldIn, int x, int y, int z, IInventory tileentity) {

    }

}
