package mods.roborave.edm.items.tools;

import net.minecraft.item.ItemSword;

public class ItemSwordMain extends ItemSword{

	private String Name;

	public ItemSwordMain(ToolMaterial p_i45356_1_, String par1Str) {
		super(p_i45356_1_);
		this.Name=par1Str;
		this.setUnlocalizedName(par1Str);
	//	this.setTextureName(Strings.MODID()+":"+par1Str);
	}

	public String getName()
	{
		return Name;
		
	}
}
