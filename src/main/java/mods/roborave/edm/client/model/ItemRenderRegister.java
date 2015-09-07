package mods.roborave.edm.client.model;

import mods.roborave.edm.init.Armor;
import mods.roborave.edm.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;



public final class ItemRenderRegister {

	public static void preInit() {
	}

	public static void registerItemRenderer() {

		reg(Armor.tutorialHelmet);
		reg(Armor.tutorialChestplate);
		reg(Armor.tutorialLeggings);
		reg(Armor.tutorialBoots);
	}

	// ==========================================================================

	public static String modid = Strings.name;

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void reg(Item item, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
}
