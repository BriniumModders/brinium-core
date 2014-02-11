package com.briniumCore.api;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	
	
	/**
	 * This is how you can have easy simple tool crafting recipes
	 * 
	 * @author Mitchellbrine
	 * 
	 * @param The tool type
	 * @param The item used to craft the tools
	 * @param The tool
	 * 
	 * **/
	public static void addToolCraftingRecipe(String tool, Item ore, Item output) {
		if (tool == "axe") {
			GameRegistry.addRecipe(new ItemStack(output, 1), " XX", " YX", " Y ", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
			GameRegistry.addRecipe(new ItemStack(output, 1), "XX ", "XY ", " Y ", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
		}
		else if (tool == "pickaxe") {
			GameRegistry.addRecipe(new ItemStack(output, 1), "XXX", " Y ", " Y ", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
		}
		else if (tool == "sword") {
			GameRegistry.addRecipe(new ItemStack(output, 1), "X", "X", "Y", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
		}
		else if (tool == "spade") {
			GameRegistry.addRecipe(new ItemStack(output, 1), "X", "Y", "Y", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
		}
		else if (tool == "hoe") {
			GameRegistry.addRecipe(new ItemStack(output, 1), "XX ", " Y ", " Y ", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
			GameRegistry.addRecipe(new ItemStack(output, 1), " XX", " Y ", " Y ", Character.valueOf('X'), ore, Character.valueOf('Y'), Item.stick);
		}
	}
	
	
	/**
	 * This is how you can have easy simple armor crafting recipes
	 * 
	 * @author Mitchellbrine
	 * 
	 * @param The armor slot (0 = boots, 1 = legs, 2 = plate, 3 = helmet)
	 * @param The item used to craft the armor
	 * @param The armor piece
	 * 
	 * **/
	public static void addArmorCraftingRecipe(int armorSlot, Item ore, Item output) {
		if (armorSlot == 0) {
			GameRegistry.addRecipe(new ItemStack(output, 1), "X X", "X X", Character.valueOf('X'), ore);
		}
		else if (armorSlot == 1) {
			GameRegistry.addRecipe(new ItemStack(output, 1), "XXX", "X X", "X X", Character.valueOf('X'), ore);
		}
		else if (armorSlot == 2) {
			GameRegistry.addRecipe(new ItemStack(output, 1), "X X", "XXX", "XXX", Character.valueOf('X'), ore);
		}
		else if (armorSlot == 3) {
			GameRegistry.addRecipe(new ItemStack(output, 1), "XXX", "X X", Character.valueOf('X'), ore);
		}
		
	}
	
}
