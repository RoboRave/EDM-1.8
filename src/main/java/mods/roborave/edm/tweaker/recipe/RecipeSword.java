package mods.roborave.edm.tweaker.recipe;

import mods.roborave.edm.init.Items;
import mods.roborave.edm.tweaker.api.IObject;
import mods.roborave.edm.tweaker.api.RecipeAPI;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeSword extends IObject implements RecipeAPI 
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
	
	public static RecipeSword instance;
	
	public void addRecipes()
	{
		BDSW = new ItemStack(Items.BDSW);
		BDSW.addEnchantment(Enchantment.fortune, 1);
		GameRegistry.addRecipe(BDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick, Character.valueOf('X'), Items.BD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		
		BLDSW = new ItemStack(Items.BLDSW);
		BLDSW.addEnchantment(Enchantment.fireAspect, 2);
		GameRegistry.addRecipe(BLDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.BLD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		
		GDSW = new ItemStack(Items.GDSW);
		GameRegistry.addRecipe(GDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		GDSW.addEnchantment(Enchantment.baneOfArthropods, 3);
		
		GRDSW = new ItemStack(Items.GRDSW);
		GameRegistry.addRecipe(GRDSW, new Object[] {"QXQ", "VXV", "Q#Q",Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.GRD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		GRDSW.addEnchantment(Enchantment.punch, 4);
		
		ODSW = new ItemStack(Items.ODSW);
		GameRegistry.addRecipe(ODSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.OD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		ODSW.addEnchantment(Enchantment.looting, 5);
		
		PDSW = new ItemStack(Items.PDSW);
		GameRegistry.addRecipe(PDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.PD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		PDSW.addEnchantment(Enchantment.unbreaking, 6);
		
		PUDSW = new ItemStack(Items.PUDSW);
		GameRegistry.addRecipe(PUDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.PUD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		PUDSW.addEnchantment(Enchantment.power, 7);
		
		RDSW = new ItemStack(Items.RDSW);
		GameRegistry.addRecipe(RDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.RD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		RDSW.addEnchantment(Enchantment.sharpness, 8);
		
		WDSW = new ItemStack(Items.WDSW);
		GameRegistry.addRecipe(WDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.WD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		WDSW.addEnchantment(Enchantment.unbreaking,10);
		
		YDSW = new ItemStack(Items.YDSW);
		GameRegistry.addRecipe(YDSW, new Object[] {"QXQ", "VXV", "Q#Q", Character.valueOf('#'), net.minecraft.init.Items.stick,Character.valueOf('X'), Items.YD,Character.valueOf('Q'),net.minecraft.init.Items.diamond});
		YDSW.addEnchantment(Enchantment.power, 10);
		YDSW.addEnchantment(Enchantment.looting, 10);
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
