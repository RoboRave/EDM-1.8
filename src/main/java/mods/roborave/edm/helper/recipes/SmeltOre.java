package mods.roborave.edm.helper.recipes;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltOre 
{

	public void addRecipes() 
	{
		GameRegistry.addSmelting(Blocks.getBlock("Black_diamond_Ore"), new ItemStack(Items.BD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Blue_diamond_Ore"), new ItemStack(Items.BLD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Gray_diamond_Ore"), new ItemStack(Items.GD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Green_diamond_Ore"), new ItemStack(Items.GRD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Orange_diamond_Ore"), new ItemStack(Items.OD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Pink_diamond_Ore"), new ItemStack(Items.PD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Purple_diamond_Ore"), new ItemStack(Items.PUD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("White_diamond_Ore"), new ItemStack(Items.WD), 5);
		GameRegistry.addSmelting(Blocks.getBlock("Yellow_diamond_Ore"), new ItemStack(Items.YD), 5);
	}
}
