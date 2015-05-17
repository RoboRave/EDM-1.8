package mods.roborave.edm.tweaker.recipe;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import mods.roborave.edm.tweaker.api.IObject;
import mods.roborave.edm.tweaker.api.RecipeAPI;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesBlocks extends IObject implements RecipeAPI
{
	    
		/**
	     * Adds the Block recipes to the CraftingManager.
	     */
	    public void addRecipes()
	    {
			GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Black"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X',Items.BD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Blue"+"_diamond_Block")),  new Object[] {"XXX","XXX","XXX", 'X', Items.BLD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Gray"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X',Items.GD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Green"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X',Items.GRD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Orange"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X',Items.OD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Pink"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X',Items.PD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Purple"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X', Items.PUD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Red"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X', Items.RD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("White"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X', Items.WD});
	    	GameRegistry.addRecipe(new ItemStack(Blocks.blockList.get("Yellow"+"_diamond_Block")), new Object[] {"XXX","XXX","XXX", 'X', Items.YD});
	    	 
	    }
	    
	    public void initialize()
	    {
	    	this.start();
	    }

		public void start() 
		{
			addRecipes();
		}
	}
