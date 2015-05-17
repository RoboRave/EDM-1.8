package mods.roborave.edm.tweaker;

import mods.roborave.edm.tweaker.recipe.RecipeManager;
import mods.roborave.edm.tweaker.register.RegistryManager;

public class Tweaker {
	
	 public static void load() throws Exception 
	 {
		RecipeManager.load();
		RegistryManager.init();
	 }

}
