package mods.roborave.edm.items.tools;

import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeMain extends ItemPickaxe {

	public String Name;

	public ItemPickaxeMain(ToolMaterial p_i45347_1_, String par1Str) 
	{
		super(p_i45347_1_);
		this.setUnlocalizedName(par1Str);
		this.Name=par1Str;
	}

	public String getName()
	{
		return Name;
		
	}
}
