package mods.roborave.edm.common;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
/*
 * WIP
 */
public class Ability {
	
	private static String name;
	private static Item ItemStack;
	private static ItemArmor armor;

	public static HashMap<String,Ability> AbilityList = new HashMap<String, Ability>();

	public Ability(String par1String, Item par2ItemStack)
	{
		Ability.name=par1String;
		ItemStack=par2ItemStack;
	}
	
	public static Ability addAbility(Item ItemStack,Ability ability)
	{
		return
		AbilityList.put(ability.getAbilityName(), ability);
	}

	public String getAbilityName() 
	{
		Ability.ItemStack.getUnlocalizedName();
		return Ability.name;
	}
	@SuppressWarnings("deprecation")
	public void putabilitytoList(Map<? extends String, ? extends Ability> m){
		 armor.getItemAttributeModifiers();
		 AbilityList.putAll(m);
	}

}
