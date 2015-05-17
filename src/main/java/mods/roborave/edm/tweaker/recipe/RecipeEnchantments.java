package mods.roborave.edm.tweaker.recipe;

import mods.roborave.edm.init.Items;
import mods.roborave.edm.tweaker.api.IObject;
import mods.roborave.edm.tweaker.api.RecipeAPI;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class RecipeEnchantments extends IObject implements RecipeAPI 
{
	public static ItemStack BDSW;
	public static ItemStack BLDSW;
	public static ItemStack GDSW;
	public static ItemStack GRDSW;
	public static ItemStack ODSW;
	public static ItemStack PDSW;
	public static ItemStack PUDSW;
	public static ItemStack RDSW;
	public static ItemStack WDSW;
	public static ItemStack YDSW;
	
	public static RecipeEnchantments instance;
	 
	public void addRecipes()
	{
		BDSW = new ItemStack(Items.BDSW);
	//	BDSW.addEnchantment(Enchantment.fortune, 1);
		GameRegistry.addRecipe(BDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick, Character.valueOf('X'), Items.BD});
		
		BLDSW = new ItemStack(Items.BLDSW);
	//	BLDSW.addEnchantment(Enchantment.fireAspect, 2);
		GameRegistry.addRecipe(BLDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.BLD});
		
		GDSW = new ItemStack(Items.GDSW);
		GameRegistry.addRecipe(GDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GD});
	//	GDSW.addEnchantment(Enchantment.baneOfArthropods, 3);
		
		GRDSW = new ItemStack(Items.GRDSW);
		GameRegistry.addRecipe(GRDSW, new Object[] {"VXV", "VXV", "V#V",Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GRD});
	//	GRDSW.addEnchantment(Enchantment.punch, 4);
		
		ODSW = new ItemStack(Items.ODSW);
		GameRegistry.addRecipe(ODSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.OD});
	//	ODSW.addEnchantment(Enchantment.looting, 5);
		
		PDSW = new ItemStack(Items.PDSW);
		GameRegistry.addRecipe(PDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.PD});
	//	PDSW.addEnchantment(Enchantment.unbreaking, 6);
		
		PUDSW = new ItemStack(Items.PUDSW);
		GameRegistry.addRecipe(PUDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.PUD});
	//	PUDSW.addEnchantment(Enchantment.power, 7);
		
		RDSW = new ItemStack(Items.RDSW);
		GameRegistry.addRecipe(RDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.RD});
	//	RDSW.addEnchantment(Enchantment.sharpness, 8);
		
		WDSW = new ItemStack(Items.WDSW);
		GameRegistry.addRecipe(WDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.WD});
	//	WDSW.addEnchantment(Enchantment.unbreaking,10);
		
		YDSW = new ItemStack(Items.YDSW);
		GameRegistry.addRecipe(YDSW, new Object[] {"VXV", "VXV", "V#V", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.YD});
	//	YDSW.addEnchantment(Enchantment.power, 10);
	//	YDSW.addEnchantment(Enchantment.looting, 10);
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
