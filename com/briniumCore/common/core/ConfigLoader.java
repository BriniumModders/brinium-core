package com.briniumCore.common.core;

import net.minecraftforge.common.Configuration;

public class ConfigLoader {

	public static void generateConfig() {
		MainMod.config.load();
		
		MainMod.config.addCustomCategoryComment(Configuration.CATEGORY_BLOCK, "Note, the ids for the blocks will be lower than the items! This is only to sort out the creative tab!");
		MainMod.config.addCustomCategoryComment(Configuration.CATEGORY_ITEM, "(See Blocks Catergory for info)");
		
		MainMod.briniumOreID = MainMod.config.get(Configuration.CATEGORY_BLOCK, "briniumOreID", 4000).getInt();
		MainMod.volcaniteOreID = MainMod.config.get(Configuration.CATEGORY_BLOCK, "volcaniteOreID", 4001).getInt();
		MainMod.pandoriteOreID = MainMod.config.get(Configuration.CATEGORY_BLOCK, "pandoriteOreID", 4002).getInt();
		
		MainMod.briniumIngotID = MainMod.config.get(Configuration.CATEGORY_ITEM, "briniumIngotID", 4050).getInt();
		MainMod.volcaniteIngotID = MainMod.config.get(Configuration.CATEGORY_ITEM, "volcaniteIngotID", 4051).getInt();
		MainMod.pandoriteIngotID = MainMod.config.get(Configuration.CATEGORY_ITEM, "pandoriteIngotID", 4052).getInt();
		
		MainMod.briniumAxeID = MainMod.config.get(Configuration.CATEGORY_ITEM, "briniumAxeID", 4053).getInt();
		MainMod.briniumHoeID = MainMod.config.get(Configuration.CATEGORY_ITEM, "briniumHoeID", 4054).getInt();
		MainMod.briniumSpadeID = MainMod.config.get(Configuration.CATEGORY_ITEM, "briniumSpadeID", 4055).getInt();
		MainMod.briniumSwordID = MainMod.config.get(Configuration.CATEGORY_ITEM, "briniumSwordID", 4056).getInt();
		MainMod.briniumPickaxeID = MainMod.config.get(Configuration.CATEGORY_ITEM, "briniumPickaxeID", 4057).getInt();
		
		MainMod.config.save();
	}
	
}
