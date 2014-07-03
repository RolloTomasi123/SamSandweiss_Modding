package sam.sandweiss;

//Recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;



//MyBlocks Imports
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemFood;

//MyBlocks
import sam.sandweiss.MyBlocks.RubyOre;
import sam.sandweiss.MyBlocks.MixedOre;

//MyItems
import sam.sandweiss.MyItems.RubyGem;
import sam.sandweiss.MyItems.FoodStrawberry;

//MyTools
import net.minecraftforge.common.util.EnumHelper;
import sam.sandweiss.MyItems.RubySword;
import sam.sandweiss.armor.SampleArmor;

public class MyCode {
	
	//Unique ID's for Armor
	public static int helmetID;
	public static int chestplateID;
	public static int leggingsID;
	public static int bootsID;
	
	//Armor Material
	public static ArmorMaterial SampleArmorMaterial = EnumHelper.addArmorMaterial("SampleArmorMaterial", 66, new int [] {6,16,12,6}, 10);
	
	//List Blocks Here #setupBLOCK
	public static Block rubyOre;
	public static Block mixedOre;
	
	
	//List Items Here #setupITEM
	public static Item rubyGem;
	public static Item Strawberry = new ItemFood(32, 10, false);
	
	//Tools
	public static Item RubySword;
	public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 3, 800, 9.0F, 3.5F, 10);
	
	//Armor
	public static Item SampleHelmet = new SampleArmor(SampleArmorMaterial, helmetID, 0).setUnlocalized("SampleHelmet");
	public static Item SampleChestplate = new SampleArmor(SampleArmorMaterial, chestplateID, 1).setUnlocalized("SampleChestplate");
	public static Item SampleLeggings = new SampleArmor(SampleArmorMaterial, leggingsID, 2).setUnlocalized("SampleLeggings");
	public static Item SampleBoots = new SampleArmor(SampleArmorMaterial, bootsID, 1).setUnlocalized("SampleBoots");
	

	public static void MyBlocks(){	
		
		//Blocks #setupBLOCK
	//RubyOre
		rubyOre = new RubyOre (Material.ground)
		.setHardness(0.9F)
		.setStepSound(Block.soundTypeGravel)
		.setBlockName("rubyOre")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("redstone_ore");
	//MixedOre
		mixedOre = new MixedOre (Material.ground)
		.setHardness(0.9F)
		.setStepSound(Block.soundTypeGravel)
		.setBlockName("MixedOre")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("redstone_ore");
		//Harvest Level 

		//Register #setupBLOCK
		GameRegistry.registerBlock(rubyOre, "RubyOre");
		GameRegistry.registerBlock(mixedOre, "MixedOre");
		
	}
	public static void MyRecipes(){
		
		//Armor Recipes
		GameRegistry.addRecipe(new ItemStack(SampleHelmet, 1), new Object[] {
			"AAA",
			"A A",
			"   ",
			'A', rubyGem,
		
		});
		GameRegistry.addRecipe(new ItemStack(SampleChestplate, 1), new Object[] {
			"A A",
			"AAA",
			"AAA",
			'A', rubyGem,
		
		});
		GameRegistry.addRecipe(new ItemStack(SampleLeggings, 1), new Object[] {
			"AAA",
			"A A",
			"A A",
			'A', rubyGem,
		
		});
		GameRegistry.addRecipe(new ItemStack(SampleBoots, 1), new Object[] {
			"A A",
			"A A",
			'A', rubyGem,
		});
		
		GameRegistry.addShapelessRecipe( new ItemStack(Blocks.brown_mushroom), new Object[] {new ItemStack(Items.cookie)});
		//GameRegistry.addShapelessRecipe( new ItemStack(Blocks.cobblestone), new Object[] {new ItemStack(Blocks.dirt)});

		
		GameRegistry.addRecipe(new ItemStack(Blocks.bedrock), new Object[] {
			"ABA",
			"BAB",
			"ABA",
			'A', Blocks.diamond_block, 'B', Blocks.iron_block,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.glowstone_dust), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Items.redstone, 'B', Blocks.torch,
		});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[] {
			"CAC",
			"CBC",
			"DDD",
			'A', Items.lava_bucket, 'B', Items.water_bucket, 'C', Blocks.cobblestone, 'D', Blocks.stone,
		});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.double_plant,1,4), new Object[] {
			" A ",
			" B ",
			" A ",
			'A', Blocks.red_flower, 'B', Blocks.vine,
		});
		
		
		{
			
		ItemStack CreeperEgg = new ItemStack(Items.spawn_egg,50);
			
		GameRegistry.addSmelting(CreeperEgg, new ItemStack(Items.gunpowder,1), 0.01F);
		
		//GameRegistry.addSmelting(Items.cookie, new ItemStack(Items.cooked_beef,1), 0.01F);
		
		GameRegistry.addSmelting(Items.dye, new ItemStack(Items.clay_ball,1,15), 0.01F);	
			
		};
		
		ItemStack MagmaCream = new ItemStack(Items.magma_cream);
		ItemStack LavaBucket = new ItemStack(Items.lava_bucket);
		ItemStack Bucket = new ItemStack(Items.bucket);
		
		GameRegistry.addShapelessRecipe(LavaBucket, Bucket, MagmaCream, MagmaCream, MagmaCream, MagmaCream, MagmaCream, MagmaCream);
		{
			//Enchanting Items
		ItemStack newEnchantment = new ItemStack(Items.cooked_beef,1);
		newEnchantment.addEnchantment(Enchantment.sharpness, 3);
		newEnchantment.addEnchantment(Enchantment.knockback, 127);
		GameRegistry.addSmelting(Items.cookie,newEnchantment, 0.01F);
		
		}
		//Enchanting Items
		ItemStack awesomePick = new ItemStack(Items.stone_pickaxe);
		awesomePick.addEnchantment(Enchantment.fortune, 127);
		GameRegistry.addRecipe(awesomePick,new Object[] {
				"AAA",
				" B ",
				"  B",
				'A',Blocks.cobblestone,
				'B',Items.stick,
				
		});
	
		
	
	}
	public static void MyItems(){
		
		//ruby gem
		rubyGem = new RubyGem();
		
		
		Strawberry = new FoodStrawberry(5015, 10, false);
		
		//RubySword
		RubySword = new RubySword(RUBY);
		

		GameRegistry.registerItem(SampleHelmet, "SampleHelmet");
		GameRegistry.registerItem(SampleChestplate, "SampleChestplate");
		GameRegistry.registerItem(SampleLeggings, "SampleLeggings");
		GameRegistry.registerItem(SampleBoots, "SampleBoots");
		
		GameRegistry.registerItem(Strawberry, "Strawberry");
		GameRegistry.registerItem(rubyGem, "rubyGem");
		GameRegistry.registerItem(RubySword, "RubySword");
	}
}