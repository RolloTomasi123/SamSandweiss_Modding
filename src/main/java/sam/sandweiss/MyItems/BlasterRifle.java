package sam.sandweiss.MyItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlasterRifle extends Item {

	private Object worldObj;
	private Entity shootingEntity;

	public BlasterRifle() {
		super();
		setCreativeTab(CreativeTabs.tabCombat);
		setUnlocalizedName("blasterRifle");
	}
	
	  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	  {
	      if (par3EntityPlayer.capabilities.isCreativeMode)
	      {
	          --par1ItemStack.stackSize;
	      }
	      par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	      if (!par2World.isRemote)
	      {
	          par2World.spawnEntityInWorld(new EntitySmallFireball(par2World, par3EntityPlayer, 1, 1, 1));
	      }
	      return par1ItemStack;
	  }
	    
	  
}
