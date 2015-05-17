package mods.roborave.edm.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemChest extends ItemArmor
{	
	private String color;
	
	public ItemChest(ArmorMaterial par2EnumArmorMaterial, int par3,String color)
	{
		super(par2EnumArmorMaterial, par3, 1);
		this.color=color;
	}
	/*
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Strings.MODID()+":"+this.color+"_Diamond_Chest"); 
	}
	*/
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return "minecraft"+":textures/models/armor/"+this.color.toLowerCase()+"_layer_1.png";
    }

	public String getArmorColor() {
		// TODO Auto-generated method stub
		return color+"_Diamond_Chest";
	}
	
}