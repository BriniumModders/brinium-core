package com.briniumCore.common.core;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "briniumCore", name = "Brinium (CORE)", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class MainMod {
	
	public static CreativeTabs briniumCoreTab = new BrineTab(CreativeTabs.getNextID(), "briniumCore");

	public static int briniumOreID;
	public static int briniumIngotID;
	public static int volcaniteOreID;
	public static int volcaniteIngotID;
	public static int pandoriteOreID;
	public static int pandoriteIngotID;
	
	public static Block briniumOre;
	public static Block volcaniteOre;
	public static Block pandoriteOre;
	
	
@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	
	config.load();
	
	config.addCustomCategoryComment(Configuration.CATEGORY_BLOCK, "Note, the ids for the blocks will be lower than the items! This is only to sort out the creative tab!");
	config.addCustomCategoryComment(Configuration.CATEGORY_ITEM, "(See Blocks Catergory for info)");
	
	briniumOreID = config.get(Configuration.CATEGORY_BLOCK, "briniumOreID", 4000).getInt();
	volcaniteOreID = config.get(Configuration.CATEGORY_BLOCK, "volcaniteOreID", 4001).getInt();
	pandoriteOreID = config.get(Configuration.CATEGORY_BLOCK, "pandoriteOreID", 4002).getInt();
	
	briniumIngotID = config.get(Configuration.CATEGORY_ITEM, "briniumIngotID", 4050).getInt();
	volcaniteIngotID = config.get(Configuration.CATEGORY_ITEM, "volcaniteIngotID", 4051).getInt();
	pandoriteOreID = config.get(Configuration.CATEGORY_ITEM, "pandoriteOreID", 4052).getInt();
	
	config.save();
	
}

@EventHandler
public void init(FMLInitializationEvent event) {
	briniumOre = new Block(briniumOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setCreativeTab(briniumCoreTab).setUnlocalizedName("brine:briniumOre").setTextureName("brine:briniumOre");
	volcaniteOre = new Block(volcaniteOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setCreativeTab(briniumCoreTab).setUnlocalizedName("brine:volcaniteOre").setTextureName("brine:volcaniteOre");
	pandoriteOre = new Block(pandoriteOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setCreativeTab(briniumCoreTab).setUnlocalizedName("brine:pandoriteOre").setTextureName("brine:pandoriteOre");
	
	GameRegistry.registerBlock(briniumOre, "briniumOre");
	GameRegistry.registerBlock(volcaniteOre, "volcaniteOre");
	GameRegistry.registerBlock(pandoriteOre, "pandoriteOre");
	
	LanguageRegistry.addName(briniumOre, "Brinium Ore");
	LanguageRegistry.addName(volcaniteOre, "Volcanite Ore");
	LanguageRegistry.addName(pandoriteOre, "Pandorite Ore");
	
	LanguageRegistry.instance().addStringLocalization("itemGroup.briniumCore", "Brinium (Core)");

}

}
