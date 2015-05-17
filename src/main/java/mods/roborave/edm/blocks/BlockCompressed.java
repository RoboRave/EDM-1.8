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

    public void createJsonBlockStates() {
        JsonObject root = new JsonObject();

        JsonObject variants = new JsonObject();

        JsonObject normal = new JsonObject();

        normal.addProperty("model", Strings.name + ":" + Blockname);

        variants.add("normal", normal);

        root.add("variants", variants);
    }
   
}