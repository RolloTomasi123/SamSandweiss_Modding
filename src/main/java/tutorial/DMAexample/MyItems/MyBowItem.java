package tutorial.DMAexample.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MyBowItem extends Item{
	public MyBowItem()
	{
	super();
	}
	
    //Load Icons and Textures Properly
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
    @SideOnly(Side.CLIENT) 
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("mycode:" 
        + (this.getUnlocalizedName().substring(5)));
    }
}
