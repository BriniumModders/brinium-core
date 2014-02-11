package com.briniumCore.common.registry;

import com.briniumCore.common.core.MainMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class GameRegistering {

	public static void registerObjects() {
		GameRegistry.registerBlock(MainMod.briniumOre, "briniumOre");
		GameRegistry.registerBlock(MainMod.volcaniteOre, "volcaniteOre");
		GameRegistry.registerBlock(MainMod.pandoriteOre, "pandoriteOre");
		
		GameRegistry.registerItem(MainMod.briniumIngot, "briniumIngot");
		GameRegistry.registerItem(MainMod.volcaniteIngot, "volcaniteIngot");
		GameRegistry.registerItem(MainMod.pandoriteIngot, "pandoriteIngot");
		GameRegistry.registerItem(MainMod.briniumAxe, "briniumAxe");
		GameRegistry.registerItem(MainMod.briniumHoe, "briniumHoe");
		GameRegistry.registerItem(MainMod.briniumSword, "briniumSword");
		GameRegistry.registerItem(MainMod.briniumSpade, "briniumSpade");
		GameRegistry.registerItem(MainMod.briniumPickaxe, "briniumPickaxe");
	}
	
}
