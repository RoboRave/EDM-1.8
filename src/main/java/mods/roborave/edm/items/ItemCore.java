package mods.roborave.edm.items;

import mods.roborave.edm.EDM;
import net.minecraft.item.Item;

public class ItemCore extends Item{
	protected int itemId;
	public String ItemName;
	
	public ItemCore(String itemName) {
		super();
		this.ItemName=itemName;
		this.setCreativeTab(EDM.tabEDMItems);
		setUnlocalizedName(itemName);
	}
		
}