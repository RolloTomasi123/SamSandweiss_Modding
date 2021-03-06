package sam.sandweiss.MyItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBlasterBolt extends EntityThrowable
{
    private float explosionRadius = 1;
	private Entity shootingEntity;
    
	public EntityBlasterBolt(World par1World)
    {
        super(par1World);
    }
    public EntityBlasterBolt(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    public EntityBlasterBolt(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (!this.worldObj.isRemote)
        {
            if (par1MovingObjectPosition.entityHit != null)
            {
               // if (!par1MovingObjectPosition.entityHit.isImmuneToFire() && par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 5.0F))
               // {
               //     par1MovingObjectPosition.entityHit.setFire(5);
               // }
            }
            else
            {
                int i = par1MovingObjectPosition.blockX;
                int j = par1MovingObjectPosition.blockY;
                int k = par1MovingObjectPosition.blockZ;

                switch (par1MovingObjectPosition.sideHit)
                {
                    case 0:
                        --j;
                        break;
                    case 1:
                        ++j;
                        break;
                    case 2:
                        --k;
                        break;
                    case 3:
                        ++k;
                        break;
                    case 4:
                        --i;
                        break;
                    case 5:
                        ++i;
                }

                if (this.worldObj.isAirBlock(i, j, k))
                {
                    this.worldObj.setBlock(i, j, k, Blocks.fire);
                }
            }

            this.setDead();
        }
    }
    
}