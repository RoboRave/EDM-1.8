package mods.roborave.edm.blocks;

import mods.roborave.edm.EDM;
import net.minecraft.block.material.Material;

public class BlockOre extends BlockCore 
{
	
	public BlockOre(String ore) 
	{
		super (Material.rock, ore+"_diamond_Ore");
		this.setCreativeTab(EDM.tabEDMBlock);
		this.setHardness(3.0F);
	}
}