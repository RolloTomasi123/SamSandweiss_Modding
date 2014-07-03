package sam.sandweiss.armor;

import sam.sandweiss.MyCode;
import net.minecraft.item.ItemArmor;

public class SampleArmor extends ItemArmor {

	public SampleArmor(ArmorMaterial material, int id,
			int placement) {
		super(material, id, placement);
		setCreativeTab(MyCode.sampleTab);
		
		if (placement == 0) {//If Armor Piece if the Helmet
			this.setTextureName(MyCode.MOID + ":SampleHelmet");
		}
		else if (placement == 1) {
			this.setTextureName(MyCode.MODID = ":SampleChestplate");
			
		}
		else if (placement == 2) {
			this.setTextureName(MyCode.MODID = ":SampleLeggings");
			
		}
		else if (placement == 3) {
			this.setTextureName(MyCode.MODID = ":SampleBoots");
			
		}
		
		// TODO Auto-generated constructor stub
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		if (stack.getItem() == MyCode.SampleHelmet || (stack.getItem() == MyCode.SampleChestplate ||  (stack.getItem() == MyCode.SampleBoots){
			return MyCode
		}
		
		
	}
	

	

}
