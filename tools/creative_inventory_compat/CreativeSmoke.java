import java.lang.reflect.*;
import java.util.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import sun.misc.Unsafe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraftforge.client.event.GuiOpenEvent;
import com.flansmod.client.PlayerEquipmentClientHandler;

public class CreativeSmoke {
 static Unsafe unsafe;
 static void check(boolean b,String m){if(!b)throw new AssertionError(m);}
 public static class CustomCreative extends GuiContainerCreative {public CustomCreative(){super(null);}}
 static class Definer extends ClassLoader {Definer(){super(CreativeSmoke.class.getClassLoader());} Class<?> make(byte[] b){return defineClass(null,b,0,b.length);}}
 public static void main(String[] args)throws Exception {
  Field uf=Unsafe.class.getDeclaredField("theUnsafe");uf.setAccessible(true);unsafe=(Unsafe)uf.get(null);
  Minecraft mc=(Minecraft)unsafe.allocateInstance(Minecraft.class);
  for(Field f:Minecraft.class.getDeclaredFields()) if(Modifier.isStatic(f.getModifiers())&&f.getType()==Minecraft.class){f.setAccessible(true);f.set(null,mc);}
  PlayerEquipmentClientHandler h=new PlayerEquipmentClientHandler();
  GuiContainerCreative vanilla=(GuiContainerCreative)unsafe.allocateInstance(GuiContainerCreative.class);
  CustomCreative custom=(CustomCreative)unsafe.allocateInstance(CustomCreative.class);
  for(GuiScreen g:new GuiScreen[]{vanilla,custom,new GuiScreen(),null}){
   GuiOpenEvent event=new GuiOpenEvent(g);h.onGuiOpen(event);check(event.gui==g,"FMUR replaced a creative/other GUI");
  }
  // Run the installed NEI predicate with its native creative registration.
  Class<?> nei=Class.forName("codechicken.nei.api.GuiInfo");
  ((Set)nei.getField("customSlotGuis").get(null)).add(GuiContainerCreative.class);
  Method customSlots=nei.getMethod("hasCustomSlots",net.minecraft.client.gui.inventory.GuiContainer.class);
  check((Boolean)customSlots.invoke(null,vanilla),"NEI failed to exclude native creative");
  check(!(Boolean)customSlots.invoke(null,custom),"Expected old NEI subclass fault missing");
  Class<?> inv=Class.forName("invtweaks.InvTweaksObfuscation");
  Method creative=inv.getMethod("isGuiInventoryCreative",Object.class);
  check((Boolean)creative.invoke(null,vanilla),"InvTweaks did not recognize native creative");
  check(!(Boolean)creative.invoke(null,custom),"Expected exact-class InvTweaks behaviour missing");
  // Execute the installed MouseTweaks method, remapping only its obfuscated GUI types.
  ClassNode cn=new ClassNode();
  try(ZipFile zip=new ZipFile(args[0])){new ClassReader(zip.getInputStream(zip.getEntry("yalter/mousetweaks/DeobfuscationLayer.class"))).accept(cn,ClassReader.SKIP_FRAMES);}
  MethodNode found=null;for(Object o:cn.methods){MethodNode m=(MethodNode)o;if(m.name.equals("isValidGuiContainer"))found=m;}
  check(found!=null,"MouseTweaks predicate missing");
  for(AbstractInsnNode n=found.instructions.getFirst();n!=null;n=n.getNext()){
   if(n instanceof LdcInsnNode){LdcInsnNode l=(LdcInsnNode)n;if(l.cst instanceof org.objectweb.asm.Type && ((org.objectweb.asm.Type)l.cst).getInternalName().equals("bfl"))l.cst=org.objectweb.asm.Type.getType(GuiContainerCreative.class);}
  }
  found.access=Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC;found.name="accepts";found.desc="(Lnet/minecraft/client/gui/GuiScreen;)Z";
  ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);
  cw.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"MousePredicate",null,"java/lang/Object",null);found.accept(cw);cw.visitEnd();
  Method mouse=new Definer().make(cw.toByteArray()).getMethod("accepts",GuiScreen.class);
  check(!(Boolean)mouse.invoke(null,vanilla),"MouseTweaks should leave native creative alone");
  check((Boolean)mouse.invoke(null,custom),"Expected old MouseTweaks subclass fault missing");
  // Exercise the unchanged production container and slot validators with real MC classes.
  net.minecraft.client.entity.EntityClientPlayerMP player=(net.minecraft.client.entity.EntityClientPlayerMP)unsafe.allocateInstance(net.minecraft.client.entity.EntityClientPlayerMP.class);
  player.worldObj=(net.minecraft.world.World)unsafe.allocateInstance(net.minecraft.client.multiplayer.WorldClient.class);
  player.worldObj.isRemote=true;
  player.inventory=new net.minecraft.entity.player.InventoryPlayer(player);
  player.capabilities=new net.minecraft.entity.player.PlayerCapabilities();
  Field props=net.minecraft.entity.Entity.class.getDeclaredField("extendedProperties");props.setAccessible(true);props.set(player,new HashMap());
  Constructor<?> equipmentCtor=com.flansmod.common.teams.PlayerEquipmentInventory.class.getDeclaredConstructor(net.minecraft.entity.player.EntityPlayer.class);
  equipmentCtor.setAccessible(true);
  com.flansmod.common.teams.PlayerEquipmentInventory equipment=(com.flansmod.common.teams.PlayerEquipmentInventory)equipmentCtor.newInstance(player);
  ((Map)props.get(player)).put(com.flansmod.common.teams.PlayerEquipmentInventory.PROPERTY_KEY,equipment);
  com.flansmod.common.teams.PlayerEquipmentInventory.EquipmentContainerPlayer container=(com.flansmod.common.teams.PlayerEquipmentInventory.EquipmentContainerPlayer)unsafe.allocateInstance(com.flansmod.common.teams.PlayerEquipmentInventory.EquipmentContainerPlayer.class);
  container.inventorySlots=new ArrayList();container.inventoryItemStacks=new ArrayList();
  net.minecraft.inventory.InventoryBasic padding=new net.minecraft.inventory.InventoryBasic("fixture",false,9);
  for(int j=0;j<45;j++)container.inventorySlots.add(new net.minecraft.inventory.Slot(j<9?padding:player.inventory,j<9?j:(j<36?j:j-36),0,0));
  Class<?> slotType=Class.forName("com.flansmod.common.teams.PlayerEquipmentInventory$EquipmentSlot");
  Constructor<?> slotCtor=slotType.getDeclaredConstructor(com.flansmod.common.teams.PlayerEquipmentInventory.class,int.class,int.class,int.class);slotCtor.setAccessible(true);
  container.inventorySlots.add(slotCtor.newInstance(equipment,0,26,44));container.inventorySlots.add(slotCtor.newInstance(equipment,1,26,62));
  player.inventoryContainer=container;player.openContainer=container;
  com.flansmod.common.teams.ItemNightVisionGoggles goggles=(com.flansmod.common.teams.ItemNightVisionGoggles)unsafe.allocateInstance(com.flansmod.common.teams.ItemNightVisionGoggles.class);goggles.setMaxStackSize(1);
  net.minecraft.item.Item plainItem=(net.minecraft.item.Item)unsafe.allocateInstance(net.minecraft.item.Item.class);plainItem.setMaxStackSize(64);
  net.minecraft.item.ItemArmor ordinaryArmour=(net.minecraft.item.ItemArmor)unsafe.allocateInstance(net.minecraft.item.ItemArmor.class);ordinaryArmour.setMaxStackSize(1);
  Field delegate=net.minecraft.item.Item.class.getField("delegate");delegate.setAccessible(true);
  for(net.minecraft.item.Item item:new net.minecraft.item.Item[]{goggles,plainItem,ordinaryArmour})delegate.set(item,new cpw.mods.fml.common.registry.RegistryDelegate.Delegate<net.minecraft.item.Item>(item,net.minecraft.item.Item.class));
  net.minecraft.item.ItemStack nv=new net.minecraft.item.ItemStack(goggles),plain=new net.minecraft.item.ItemStack(plainItem),boots=new net.minecraft.item.ItemStack(ordinaryArmour);
  check(container.inventorySlots.size()==47,"Equipment slot count changed");
  for(net.minecraft.item.ItemStack item:new net.minecraft.item.ItemStack[]{nv,plain,boots}){
   check(container.getSlot(45).isItemValid(item)==(item==nv),"NV slot accepted wrong item");
   check(container.getSlot(46).isItemValid(item)==false,"Face slot accepted wrong item");
  }
  check(container.getSlot(45).getSlotStackLimit()==1 && container.getSlot(46).getSlotStackLimit()==1,"Equipment limit changed");
  for(boolean creativeMode:new boolean[]{false,true}){
   player.capabilities.isCreativeMode=creativeMode;
   for(int j=0;j<player.inventory.mainInventory.length;j++)player.inventory.mainInventory[j]=null;
   equipment.clear();
   player.inventory.mainInventory[0]=nv.copy();
   container.transferStackInSlot(player,36);
   check(equipment.getStackInSlot(0)!=null && equipment.getStackInSlot(1)==null && player.inventory.mainInventory[0]==null,"NV Shift-equip failed");
   player.inventory.mainInventory[1]=nv.copy();
   check(container.transferStackInSlot(player,37)==null && player.inventory.mainInventory[1]!=null,"Occupied NV target must not move item");
   player.inventory.mainInventory[3]=plain.copy();container.transferStackInSlot(player,39);
   container.transferStackInSlot(player,45);container.transferStackInSlot(player,46);
   check(equipment.getStackInSlot(0)==null && equipment.getStackInSlot(1)==null,"Shift-unequip failed");
   int n=0,t=0;for(net.minecraft.item.ItemStack item:player.inventory.mainInventory)if(item!=null){if(item.getItem()==goggles)n+=item.stackSize;if(item.getItem()==plainItem)t+=item.stackSize;}
   check(n==2 && t==1 && player.inventory.getItemStack()==null,"Shift transfer changed totals/cursor");
  }
  // GUI presentation may reposition only the two equipment views, never stacks.
  vanilla.inventorySlots=container;h.onGuiOpen(new GuiOpenEvent(vanilla));
  h.prepareCreativeEquipment(new net.minecraftforge.client.event.GuiScreenEvent.DrawScreenEvent.Pre(vanilla,0,0,0));
  check(container.getSlot(45).xDisplayPosition==117 && container.getSlot(45).yDisplayPosition==6,"NV view position changed");
  check(container.getSlot(46).xDisplayPosition==117 && container.getSlot(46).yDisplayPosition==33,"Face view position changed");
  for(int j=0;j<45;j++)check(container.getSlot(j).xDisplayPosition==0 && container.getSlot(j).yDisplayPosition==0,"Presentation moved an ordinary slot");
  System.out.println("PASS: real equipment container NV Shift-equip/unequip, occupied targets, rejection of ordinary items/armour, one-item limits and count preservation in creative and survival. Face-slot positive equip requires in-game content loading.");
  System.out.println("PASS: actual FMUR GUI-open handler retains screen identity; installed NEI, InventoryTweaks and MouseTweaks predicates recognize native creative and reproduce subclass mismatch.");
 }
}
