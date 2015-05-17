package mods.roborave.edm.items.tools;

import net.minecraft.item.ItemAxe;

public class ItemAxeMain extends ItemAxe {

	public String Name;
	public ItemAxeMain(ToolMaterial p_i45327_1_, String par1Str) {
		super(p_i45327_1_);
		this.Name=par1Str;
		this.setUnlocalizedName(par1Str);
	//	this.setTextureName(Strings.MODID()+":"+par1Str);
	}

	public String getName()
	{
		return Name;
		
	}
}
