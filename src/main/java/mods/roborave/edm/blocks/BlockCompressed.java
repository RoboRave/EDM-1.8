package mods.roborave.edm.blocks;

import com.google.gson.JsonObject;

import mods.roborave.edm.EDM;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.material.Material;

public class BlockCompressed extends BlockCore
{
	public String Blockname;
    public BlockCompressed(String name)
    {
        super(Material.iron, name);
        this.setCreativeTab(EDM.tabEDMBlock);
        this.setUnlocalizedName(name);
        this.Blockname=name;
    }

   
}