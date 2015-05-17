package mods.roborave.edm.config.gui;
 
import mods.roborave.edm.EDM;
import mods.roborave.edm.lib.Strings;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
 
public class Config extends GuiConfig {
   
	public Config(GuiScreen parent) {
        super(parent,
                new ConfigElement(EDM.getVersionConfig().getCategory(EDM.category_version)).getChildElements(),
               Strings.MODID, false, false, GuiConfig.getAbridgedConfigPath(EDM.getVersionConfig().toString()));
    }
}