package mods.roborave.edm.items.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

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
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (itemStack.getItem() == mods.roborave.edm.init.Armor.BDH) {
	        effectPlayer(player, Potion.digSlowdown, 0);
	    }
	    
	} 
	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}
}