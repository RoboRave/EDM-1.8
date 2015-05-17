package mods.roborave.edm.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemLegs extends ItemArmor
{
	
	private String color;
	
	public ItemLegs(ArmorMaterial par2EnumArmorMaterial, int par3, String color)
	{
		super(par2EnumArmorMaterial, par3, 2);
		this.color=color;
		this.setUnlocalizedName(this.color + "_Diamond_Pants");
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return "minecraft"+":textures/models/armor/"+this.color.toLowerCase()+"_layer_2.png";
    }
	public String getArmorColor() {
		// TODO Auto-generated method stub
		return color + "_Diamond_Pants";
	}
}