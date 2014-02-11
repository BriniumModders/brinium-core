package com.briniumCore.common.registry;

import com.briniumCore.common.core.MainMod;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageRegistering {

	public static void registerLanguageObjects() {
		LanguageRegistry.addName(MainMod.briniumOre, "Brinium Ore");
		LanguageRegistry.addName(MainMod.volcaniteOre, "Volcanite Ore");
		LanguageRegistry.addName(MainMod.pandoriteOre, "Pandorite Ore");
		LanguageRegistry.addName(MainMod.briniumIngot, "Brinium Ingot");
		LanguageRegistry.addName(MainMod.volcaniteIngot, "Volcanite Ingot");
		LanguageRegistry.addName(MainMod.pandoriteIngot, "Pandorite Ingot");
		LanguageRegistry.addName(MainMod.briniumAxe, "Brinium Axe");
		LanguageRegistry.addName(MainMod.briniumHoe, "Brinium Hoe");
		LanguageRegistry.addName(MainMod.briniumSpade, "Brinium Shovel");
		LanguageRegistry.addName(MainMod.briniumSword, "Brinium Sword");
		LanguageRegistry.addName(MainMod.briniumPickaxe, "Brinium Pickaxe");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.briniumCore", "Brinium (Core)");
	}
	
}
