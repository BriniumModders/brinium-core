package com.briniumCore.common.recipe;

import com.briniumCore.common.core.MainMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class BrineCraftingRecipes {

	public static void registerBriniumRecipes() {
		addToolCraftingRecipe("axe", MainMod.briniumIngot, MainMod.briniumAxe);
		addToolCraftingRecipe("pickaxe", MainMod.briniumIngot, MainMod.briniumPickaxe);
		addToolCraftingRecipe("sword", MainMod.briniumIngot, MainMod.briniumSword);
		addToolCraftingRecipe("spade", MainMod.briniumIngot, MainMod.briniumSpade);
		addToolCraftingRecipe("hoe", MainMod.briniumIngot, MainMod.briniumHoe);

	}
	
	public static void registerVolcaniteRecipes() {
		
	}
	
	public static void registerPandoriteRecipes() {
		
	}
	
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
	
}
