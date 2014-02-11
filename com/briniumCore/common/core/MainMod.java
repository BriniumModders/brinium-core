package com.briniumCore.common.core;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;

import com.briniumCore.common.block.Blocks;
import com.briniumCore.common.item.Items;
import com.briniumCore.common.recipe.BrineCraftingRecipes;
import com.briniumCore.common.registry.GameRegistering;
import com.briniumCore.common.registry.LanguageRegistering;
import com.briniumCore.common.registry.OreDictionaring;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "briniumCore", name = "Brinium (CORE)", version = "Alpha 0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class MainMod {
	
	public static Configuration config;
	
    public static EnumToolMaterial briniumTools;
    
    public static EnumArmorMaterial briniumArmor;
	
	public static CreativeTabs briniumCoreTab = new BrineTab(CreativeTabs.getNextID(), "briniumCore");

	public static int briniumOreID;
	public static int briniumIngotID;
	public static int volcaniteOreID;
	public static int volcaniteIngotID;
	public static int pandoriteOreID;
	public static int pandoriteIngotID;
	public static int briniumAxeID;
	public static int briniumHoeID;
	public static int briniumSpadeID;
	public static int briniumSwordID;
	public static int briniumPickaxeID;
	
	public static Block briniumOre;
	public static Block volcaniteOre;
	public static Block pandoriteOre;
	
	public static Item briniumIngot;
	public static Item volcaniteIngot;
	public static Item pandoriteIngot;
	
	public static Item briniumAxe;
	public static Item briniumHoe;
	public static Item briniumSpade;
	public static Item briniumSword;
	public static Item briniumPickaxe;
	
	
@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	
	briniumTools = EnumHelper.addToolMaterial("brinium", 4, 1561, 9.0F, 4.0F, 11);
	
	briniumArmor = EnumHelper.addArmorMaterial("BRINIUM", 34, new int[] {4, 9, 7, 4}, 11);
	
	config = new Configuration(event.getSuggestedConfigurationFile());
	
	ConfigLoader.generateConfig();
	
}

@EventHandler
public void init(FMLInitializationEvent event) {
		
	Blocks.initiateBlocks();
	
	Items.initiateItems();
	
	GameRegistering.registerObjects();
	
	LanguageRegistering.registerLanguageObjects();
	
	BrineCraftingRecipes.registerBriniumRecipes();
	
	OreDictionaring.addOres();
	
	MinecraftForge.setBlockHarvestLevel(briniumOre, "pickaxe", 2);
	MinecraftForge.setBlockHarvestLevel(volcaniteOre, "pickaxe", 3);
	MinecraftForge.setBlockHarvestLevel(pandoriteOre, "pickaxe", 4);

}

}
