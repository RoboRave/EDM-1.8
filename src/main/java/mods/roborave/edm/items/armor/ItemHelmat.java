package mods.roborave.edm.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemHelmat extends ItemArmor
{
	public String color;
	
	
	public ItemHelmat(ArmorMaterial par2EnumArmorMaterial, int par3, String color)
	{
		super(par2EnumArmorMaterial, par3, 0);
		
		this.color = color;
		this.setFull3D();
		this.setUnlocalizedName(color+"_Diamond_Helm");
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return "minecraft"+":textures/models/armor/"+this.color.toLowerCase()+"_layer_1.png";
    }
	
	public String getArmorColor() {
		// TODO Auto-generated method stub
		return color+"_Diamond_Helm";
	}
}