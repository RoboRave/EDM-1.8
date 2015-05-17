package mods.roborave.edm.gui;
 
import java.util.Set;

import mods.roborave.edm.config.gui.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
 
public class ConfigGUIFactory implements IModGuiFactory {
    @Override
    public void initialize(Minecraft minecraftInstance) {
 
    }
 
    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return Config.class;
    }
 
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }
 
    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}