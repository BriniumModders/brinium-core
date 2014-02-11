package com.briniumCore.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.briniumCore.common.core.MainMod;

public class Blocks {

	public static void initiateBlocks() {
		MainMod.briniumOre = new Block(MainMod.briniumOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumOre").setTextureName("brine:briniumOre");
		MainMod.volcaniteOre = new Block(MainMod.volcaniteOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:volcaniteOre").setTextureName("brine:volcaniteOre");
		MainMod.pandoriteOre = new Block(MainMod.pandoriteOreID, Material.rock).setHardness(3.0F).setResistance(5.0F).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:pandoriteOre").setTextureName("brine:pandoriteOre");

	}
	
}
