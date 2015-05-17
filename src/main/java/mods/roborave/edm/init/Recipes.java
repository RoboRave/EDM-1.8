package mods.roborave.edm.init;

import mods.roborave.edm.helper.recipes.RecipesArmor;
import mods.roborave.edm.helper.recipes.RecipesTools;
import mods.roborave.edm.helper.recipes.SmeltOre;
import net.minecraft.item.Item;

public class Recipes 
{
	 public static Item BDPX;
	 public static Item BLDPX;
	 public static Item GDPX;
	 public static Item GRDPX;
	 public static Item ODPX;
	 public static Item PDPX;
	 public static Item PUDPX;
	 public static Item RDPX;
	 
	 public static Item BDSW;
	 public static Item BLDSW;
	 public static Item GDSW;
	 public static Item GRDSW;
	 public static Item ODSW;
	 public static Item PDSW;
	 public static Item PUDSW;
	 public static Item RDSW;
	 public static Item WDSW;
	 public static Item YDSW;
	 
	 public static void init()
	 {
		 (new RecipesArmor()).addRecipes();
		 (new RecipesTools()).addRecipes();
		 (new SmeltOre()).addRecipes();
		
	 }
}
