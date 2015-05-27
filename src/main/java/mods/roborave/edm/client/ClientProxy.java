package mods.roborave.edm.client;

import mods.roborave.edm.common.CommonProxy;
import mods.roborave.edm.interfaces.IProxy;
import mods.roborave.edm.tick.VersionTicker;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy implements IProxy
{
	public static Item.ToolMaterial Black = EnumHelper.addToolMaterial("Black_D", 3, 1200, 6.0F,  3.0F, 8);
    public static Item.ToolMaterial Blue  = EnumHelper.addToolMaterial("Blue_D",  3, 1400, 8.0F,  5.0F, 10);
    public static Item.ToolMaterial Gray  = EnumHelper.addToolMaterial("Gray_D",  3, 1600, 10.0F, 7.0F, 12);
    public static Item.ToolMaterial Green = EnumHelper.addToolMaterial("Green_D", 3, 1800, 12.0F, 9.0F, 14);
    public static Item.ToolMaterial Orange= EnumHelper.addToolMaterial("Orange_D",3, 2000, 14.0F, 11.0F,16);
    public static Item.ToolMaterial Pink  = EnumHelper.addToolMaterial("Pink_D",  3, 2200, 16.0F, 13.0F,18);
    public static Item.ToolMaterial Purple= EnumHelper.addToolMaterial("Purple_D",3, 2400, 18.0F, 16.0F,20);
    public static Item.ToolMaterial Red=    EnumHelper.addToolMaterial("Red_D",   3, 2600, 20.0F, 19.0F,22);
    public static Item.ToolMaterial White=  EnumHelper.addToolMaterial("White_D", 3, 2800, 22.0F, 22.0F,24);
    public static Item.ToolMaterial Yellow= EnumHelper.addToolMaterial("Yellow_D",3, 3000, 24.0F, 24.0F,26);
    
    public static ArmorMaterial Black_Diamonds = EnumHelper.addArmorMaterial("Black Diamond", "Black", 30,new int[]  { 1, 6,   4, 1 }, 10);
	public static ArmorMaterial Blue_Diamonds = EnumHelper.addArmorMaterial("Blue Diamond", "Blue", 35, new int[]   { 3, 8,   6, 3 }, 15);
	public static ArmorMaterial Gray_Diamonds= EnumHelper.addArmorMaterial("Gray Diamond", "Gray", 40, new int[]    { 5, 10,  8, 5 }, 20);
	public static ArmorMaterial Green_Diamonds= EnumHelper.addArmorMaterial("Green Diamond", "Green", 45, new int[]  { 7, 12, 10, 7 }, 25);
	public static ArmorMaterial Orange_Diamonds= EnumHelper.addArmorMaterial("Orange Diamond", "Orange", 50, new int[]{ 9, 14, 12, 9 }, 30);
	public static ArmorMaterial Pink_Diamonds= EnumHelper.addArmorMaterial("Pink Diamond", "Pink", 55, new int[]    {11, 16, 14,11 }, 35);
	public static ArmorMaterial Purple_Diamonds= EnumHelper.addArmorMaterial("Purple Diamond", "Purple", 60, new int[]{13, 18, 16,13 }, 40);
	public static ArmorMaterial Red_Diamonds= EnumHelper.addArmorMaterial("Red Diamond","Red", 65, new int[]      {15, 22, 18,15 }, 45);
	public static ArmorMaterial White_Diamonds= EnumHelper.addArmorMaterial("White Diamond", "White", 70, new int[]  {17, 24, 20,17 }, 50);
	public static ArmorMaterial Yellow_Diamonds= EnumHelper.addArmorMaterial("Yellow Diamond", "Yellow", 75, new int[]{19, 26, 22,19 }, 55);
	
	@Override
	public void PreInit()
	{
		super.PreInit();
	}
	
	@Override
	public void Init()
	{
		super.Init();
	}
	
	@Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
	
	@Override
	public void registerTickers() 
	{
		FMLCommonHandler.instance().bus().register(new VersionTicker());
	}

    public void announce(String announcement)
    {
        FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(new ChatComponentText(announcement));
    }
}