package mods.roborave.edm.items.armor;

import mods.roborave.edm.common.Ability;
import mods.roborave.edm.init.AbilityHandler;
import mods.roborave.edm.init.Armor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemModArmor extends ItemArmor {

	public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);

		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		/*if (itemStack.getItem() == Armor.tutorialHelmet) {
			this.effectPlayer(player, Potion.nightVision, 0);
		}
		if (itemStack.getItem() == Armor.tutorialChestplate) {
			this.effectPlayer(player, Potion.digSpeed, 0);
		}
		if (itemStack.getItem() ==Armor.tutorialLeggings) {
			this.effectPlayer(player, Potion.moveSpeed, 0);
		}
		if (itemStack.getItem() == Armor.tutorialBoots) {
			this.effectPlayer(player, Potion.jump, 1);
		}
*/
		if (this.isWearingFullSet(player, Armor.tutorialHelmet, Armor.tutorialChestplate, Armor.tutorialLeggings, Armor.tutorialBoots)) {
			this.effectPlayer(player, AbilityHandler.Fly);
		}else{
				player.capabilities.isFlying = false;
				player.capabilities.allowFlying = false; 
			}
		
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
		//Always effect for 8 seconds, then refresh
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}
	private void effectPlayer(EntityPlayer player, Ability ability) {
		//Always effect for 8 seconds, then refresh
		ability.getAbility();
		/*player.fallDistance = 0.0F;
		player.capabilities.allowFlying = true;*/
	}

	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
	}
}
