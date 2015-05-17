package mods.roborave.edm.items;

import mods.roborave.edm.init.Items;
import net.minecraft.item.Item;

public class ItemCore extends Item{
	protected int itemId;
	public String ItemName;
	
	public ItemCore(String itemName) {
		super();
		this.ItemName=itemName;
		//this.setCreativeTab(EDM.tabEDMItems);
		setUnlocalizedName(itemName);
		//setTextureName(Strings.MODID + ":" + itemName);
		Items.itemList.put(itemName, this);
		//GameRegistry.registerItem(this, itemName);
	}
		
}