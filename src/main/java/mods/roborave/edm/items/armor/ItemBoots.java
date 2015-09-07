package mods.roborave.edm.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	   
	    
	} 

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}
}