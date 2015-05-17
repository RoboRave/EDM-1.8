package mods.roborave.edm.client.model;

import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModelHelper
{
    public static void registerItem(Item item, int metadata, String itemName)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(item, metadata, new ModelResourceLocation(itemName, "inventory"));
    }
    
    public static void registerBlock(Block block, int metadata, String blockName)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        mesher.register(Item.getItemFromBlock(block), metadata, new ModelResourceLocation(blockName, "inventory"));
    }
    
    public static void registerBlock(Block block, String blockName)
    {
        registerBlock(block, 0, blockName);
    }
    
    public static void registerItem(Item item, String itemName)
    {
        registerItem(item, 0, itemName);
    }
    
    public static void registerBlock(Block b)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b), 0, new ModelResourceLocation(Strings.name+":" + GameRegistry.findUniqueIdentifierFor(b).name, "inventory"));
	}

}