package com.briniumCore.common.registry;

import com.briniumCore.common.core.MainMod;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaring {

	public static void addOres() {
		OreDictionary.registerOre(MainMod.briniumOreID, MainMod.briniumOre);
		OreDictionary.registerOre(MainMod.volcaniteOreID, MainMod.volcaniteOre);
		OreDictionary.registerOre(MainMod.pandoriteOreID, MainMod.pandoriteOre);
	}
	
}
