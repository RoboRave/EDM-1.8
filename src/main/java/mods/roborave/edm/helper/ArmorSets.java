package mods.roborave.edm.helper;

import net.minecraft.item.Item;
import mods.roborave.edm.init.Armor;;

public class ArmorSets {

	public static Item[][] Armorsets;
	
	public ArmorSets(){
		ArmorSets.Armorsets = new Item[][] {
        		{
        			Armor.BDH,
        			Armor.BDC, 
        			Armor.BDP,
        			Armor.BDB,
        		}
		};
	
	}
}
