package com.flansmod.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockFlansWorkbench extends Block
{
	private IIcon side;
	private IIcon[] top;
	private IIcon invisible;
	// Low bits 1 and 3 mark the table's root and adjacent part; high bits store facing.
	private static final int[] PART_X = {1, 0, -1, 0};
	private static final int[] PART_Z = {0, 1, 0, -1};
	
    public BlockFlansWorkbench(int j, int k)
    {
        super(Material.iron);
        setHardness(3F);
        setResistance(6F);
        setCreativeTab(FlansMod.tabFlanDriveables);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List par3List)
    {
    	if(tab == FlansMod.tabFlanDriveables)
    		par3List.add(new ItemStack(item, 1, 0));
    	else if(tab == FlansMod.tabFlanGuns)
    		par3List.add(new ItemStack(item, 1, 1));
    	else if(tab == FlansMod.tabFlanParts)
    		par3List.add(new ItemStack(item, 1, 2));
    }

    @Override
    public IIcon getIcon(int i, int j)
    {
        j &= 3;
        if (j == 1 || j == 3) {
            return invisible;
        }
        if(i == 1)
        {
            if (j <= 2 && j >= 0) {
                return top[j];
            } else {
                return side;
            }
            
        } else
        {
            return side;
        }
    }

    @Override
    public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9)
    {
		switch(world.getBlockMetadata(i, j, k) & 3)
    	{
    	case 0 : if(world.isRemote) entityplayer.openGui(FlansMod.INSTANCE, 0, world, i, j, k); break;
    	case 1 : if(!world.isRemote) entityplayer.openGui(FlansMod.INSTANCE, 2, world, i, j, k); break; 
        case 3 : if(!world.isRemote) entityplayer.openGui(FlansMod.INSTANCE, 2,
                world, i - partX(world.getBlockMetadata(i, j, k) >> 2), j,
                k - partZ(world.getBlockMetadata(i, j, k) >> 2)); break;
    	}    	
		return true;
    }

    public static int partX(int facing) {
        return PART_X[facing & 3];
    }

    public static int partZ(int facing) {
        return PART_Z[facing & 3];
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block oldBlock, int metadata) {
        int kind = metadata & 3;
        if (kind == 1 || kind == 3) {
            int facing = metadata >> 2;
            int otherX = x + (kind == 1 ? 1 : -1) * partX(facing);
            int otherZ = z + (kind == 1 ? 1 : -1) * partZ(facing);
            int expected = (kind == 1 ? 3 : 1) | facing << 2;
            if (world.getBlock(otherX, y, otherZ) == this
                    && world.getBlockMetadata(otherX, y, otherZ) == expected) {
                world.setBlockToAir(otherX, y, otherZ);
            }
        }
        super.breakBlock(world, x, y, z, oldBlock, metadata);
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getLightOpacity(IBlockAccess world, int x, int y, int z)
    {
        int kind = world.getBlockMetadata(x, y, z) & 3;
        return kind == 1 || kind == 3 ? 0 : 255;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
		invisible = register.registerIcon("FlansMod:gunsmithStationInvisible");
    	top = new IIcon[3];
    	top[0] = register.registerIcon("FlansMod:" + "planeCraftingTableSmall");
    	top[1] = register.registerIcon("FlansMod:" + "planeCraftingTableLarge");
    	top[2] = register.registerIcon("FlansMod:" + "vehicleCraftingTable");
    	side = register.registerIcon("FlansMod:" + "planeCraftingTableSide");
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return (metadata & 3) == 1;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return (metadata & 3) == 1 ? new TileEntityGunsmithStation() : null;
    }
    
    @Override
    public int damageDropped(int par1)
    {
        return (par1 & 3) == 3 ? 1 : par1 & 3;
    }
}
