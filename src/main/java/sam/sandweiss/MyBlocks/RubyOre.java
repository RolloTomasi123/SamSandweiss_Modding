package sam.sandweiss.MyBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sam.sandweiss.MyCode;

public class RubyOre extends Block {

	public RubyOre(Material material) {

		super(material);

	}

	@Override
	public Item getItemDropped(int metadata, Random random, int fortune) {
		return MyCode.rubyGem;
	}

	public int quantityDropped(Random rand) {
		return rand.nextInt(5) + 1;
	}
}
