package mods.roborave.edm.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBoots extends ItemArmor
{
	private String color;
	
	public ItemBoots(ArmorMaterial par2EnumArmorMaterial, int par3, String color)
	{
		super(par2EnumArmorMaterial, par3, 3);
		this.color=color;
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return "minecraft"+":textures/models/armor/"+this.color.toLowerCase()+"_layer_1.png";
    }
	
	public String getArmorColor() {
		// TODO Auto-generated method stub
		return color+"_Diamond_Boots";
	}

}