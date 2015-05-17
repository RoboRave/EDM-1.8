package mods.roborave.edm.blocks;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCore extends Block {
	
	public BlockCore(Material material, String blockName) 
	{
		super(material);
		this.setUnlocalizedName(Strings.MODID +":" + blockName);
		Blocks.blockList.put(blockName, this);
	}
	

}
