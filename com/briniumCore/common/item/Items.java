package com.briniumCore.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

import com.briniumCore.common.core.MainMod;

public class Items {

	public static void initiateItems() {
		MainMod.briniumIngot = new Item(MainMod.briniumIngotID).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumIngot").setTextureName("brine:briniumIngot");	
		MainMod.volcaniteIngot = new Item(MainMod.volcaniteIngotID).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:volcaniteIngot").setTextureName("brine:volcaniteIngot");	
		MainMod.pandoriteIngot = new Item(MainMod.pandoriteIngotID).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:pandoriteIngot").setTextureName("brine:pandoriteIngot");

		MainMod.briniumAxe = new ItemAxe(MainMod.briniumAxeID, MainMod.briniumTools).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumAxe").setTextureName("brine:briniumAxe");
		MainMod.briniumHoe = new ItemHoe(MainMod.briniumHoeID, MainMod.briniumTools).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumHoe").setTextureName("brine:briniumHoe");
		MainMod.briniumSpade = new ItemSpade(MainMod.briniumSpadeID, MainMod.briniumTools).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumSpade").setTextureName("brine:briniumSpade");
		MainMod.briniumSword = new ItemSword(MainMod.briniumSwordID, MainMod.briniumTools).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumSword").setTextureName("brine:briniumSword");
		MainMod.briniumPickaxe = new ItemPickaxe(MainMod.briniumPickaxeID, MainMod.briniumTools).setCreativeTab(MainMod.briniumCoreTab).setUnlocalizedName("brine:briniumPickaxe").setTextureName("brine:briniumPickaxe");
		
	}
	
}