package mods.roborave.edm.blocks;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOre extends Block
{
	public BlockOre(String ore) 
	{
		super(Material.rock);
		this.setUnlocalizedName(ore+"_diamond_Ore");
		this.setHardness(5.0F);
		Blocks.blockList.put(ore, this);
	}
}