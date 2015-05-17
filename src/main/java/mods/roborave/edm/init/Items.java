package mods.roborave.edm.init;

import java.util.ArrayList;
import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.client.model.ModelHelper;
import mods.roborave.edm.items.ItemCore;
import mods.roborave.edm.items.tools.ItemAxeMain;
import mods.roborave.edm.items.tools.ItemPickaxeMain;
import mods.roborave.edm.items.tools.ItemSpadeMain;
import mods.roborave.edm.items.tools.ItemSwordMain;
import mods.roborave.edm.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.RegistryNamespaced;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items 
{
	
	private static boolean isInitialized = false;
	
	public static HashMap<String , Item> itemList = new HashMap<String , Item>(); 

	
	public static ItemPickaxeMain BDPX;
	public static ItemAxeMain BDAX;
	public static ItemSpadeMain BDSD;
	public static ItemSwordMain BDSW;
	
	public static ItemPickaxeMain BLDPX;
	public static ItemAxeMain BLDAX;
	public static ItemSpadeMain BLDSD;
	public static ItemSwordMain BLDSW;
	
	public static ItemPickaxeMain GDPX;
	public static ItemAxeMain GDAX;
	public static ItemSpadeMain GDSD;
	public static ItemSwordMain GDSW;
	
	public static ItemPickaxeMain GRDPX;
	public static ItemAxeMain GRDAX;
	public static ItemSpadeMain GRDSD;
	public static ItemSwordMain GRDSW;
	
	public static ItemPickaxeMain ODPX;
	public static ItemAxeMain ODAX;
	public static ItemSpadeMain ODSD;
	public static ItemSwordMain ODSW;
	
	public static ItemPickaxeMain PDPX;
	public static ItemAxeMain PDAX;
	public static ItemSpadeMain PDSD;
	public static ItemSwordMain PDSW;

	public static ItemPickaxeMain PUDPX;
	public static ItemAxeMain PUDAX;
	public static ItemSpadeMain PUDSD;
	public static ItemSwordMain PUDSW;
	
	public static ItemPickaxeMain RDPX;
	public static ItemAxeMain RDAX;
	public static ItemSpadeMain RDSD;
	public static ItemSwordMain RDSW;
	
	public static ItemPickaxeMain WDPX;
	public static ItemAxeMain WDAX;
	public static ItemSpadeMain WDSD;
	public static ItemSwordMain WDSW;
	
	public static ItemPickaxeMain YDPX;
	public static ItemAxeMain YDAX;
	public static ItemSpadeMain YDSD;
	public static ItemSwordMain YDSW;
	
	public static Item BD;
	
	public static Item BLD;
	
	public static Item GD;
	
	public static Item GRD;
	
	public static Item OD;
	
	public static Item PD;
	
	public static Item PUD;
	
	public static Item RD;
	
	public static Item WD;
	
	public static Item YD;
	
	public static ArrayList<Item> set;

	public static final RegistryNamespaced itemRegistry = net.minecraftforge.fml.common.registry.GameData.getItemRegistry();
	
	public static void init() 
	{
		if (isInitialized)
		{
			EDM.Instance.getLogger().info("Item initialization failed, already initialized");
		}
		else
		{
			//Diamonds
			EDM.Instance.getLogger().info("Initializing Items");
			
			BD =new ItemCore("Item_Black_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(BD,"Item_Black_diamond");
			
			BLD =new ItemCore("Item_Blue_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(BLD,"Item_Blue_diamond");
			
			GD =new ItemCore("Item_Gray_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(GD,"Item_Gray_diamond");
			
			GRD =new ItemCore("Item_Green_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(GRD,"Item_Green_diamond");
			
			OD =new ItemCore("Item_Orange_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(OD,"Item_Orange_diamond");
			
			PD =new ItemCore("Item_Pink_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(PD,"Item_Pink_diamond");
			
			PUD =new ItemCore("Item_Purple_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(PUD,"Item_Purple_diamond");
			
			RD =new ItemCore("Item_Red_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(RD,"Item_Red_diamond");
			
			WD =new ItemCore("Item_White_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(WD,"Item_White_diamond");
			
			YD =new ItemCore("Item_Yellow_diamond").setCreativeTab(CreativeTabs.tabBlock);
			registerItem(YD,"Item_Yellow_diamond");
		
			
			//Tools
			EDM.Instance.getLogger().info("Initializing Tools");
			
			EDM.Instance.getLogger().info("Initializing Tools:Black Diamond");
			BDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Black,"Black_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        BDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Black,"Black_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        BDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Black,"Black_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			BDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Black, "Black_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
			
			EDM.Instance.getLogger().info("Initializing Tools:Blue Diamond");
	        BLDPX= (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Blue,"Blue_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        BLDAX= (ItemAxeMain) new ItemAxeMain(ClientProxy.Blue,"Blue_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        BLDSD= (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Blue,"Blue_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
			BLDSW= (ItemSwordMain) new ItemSwordMain(ClientProxy.Blue,"Blue_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
			
			EDM.Instance.getLogger().info("Initializing Tools:Gray Diamond");
	        GDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Gray,"Gray_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        GDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Gray,"Gray_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        GDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Gray,"Gray_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        GDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Gray,"Gray_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Green Diamond");
	        GRDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Green,"Green_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        GRDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Green,"Green_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        GRDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Green,"Green_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        GRDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Green,"Green_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        EDM.Instance.getLogger().info("Initializing Tools:Orange Diamond");
	        ODPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Orange,"Orange_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        ODAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Orange,"Orange_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        ODSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Orange,"Orange_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        ODSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Orange,"Orange_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Pink Diamond");
	        PDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Pink,"Pink_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        PDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Pink,"Pink_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        PDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Pink,"Pink_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        PDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Pink,"Pink_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Purple Diamond");
	        PUDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Purple,"Purple_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        PUDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Purple,"Purple_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        PUDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Purple,"Purple_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        PUDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Purple,"Purple_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        EDM.Instance.getLogger().info("Initializing Tools:Red Diamond");
	        RDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Red,"Red_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        RDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Red,"Red_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        RDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Red,"Red_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        RDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.Red,"Red_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        EDM.Instance.getLogger().info("Initializing Tools:White Diamond");
	        WDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.White,"White_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        WDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.White,"White_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        WDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.White,"White_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        WDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.White,"White_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
		
	        EDM.Instance.getLogger().info("Initializing Tools:Yellow Diamond");
	        YDPX = (ItemPickaxeMain) new ItemPickaxeMain(ClientProxy.Yellow,"Yellow_Diamond_Pick").setCreativeTab(CreativeTabs.tabTools);
	        YDAX = (ItemAxeMain) new ItemAxeMain(ClientProxy.Yellow,"Yellow_Diamond_Axe").setCreativeTab(CreativeTabs.tabTools);
	        YDSD = (ItemSpadeMain) new ItemSpadeMain(ClientProxy.Yellow,"Yellow_Diamond_Shovel").setCreativeTab(CreativeTabs.tabTools);
	        YDSW = (ItemSwordMain) new ItemSwordMain(ClientProxy.White,"Yellow_Diamond_Sword").setCreativeTab(CreativeTabs.tabCombat);
	        
	        registerToolSet(BDPX, BDAX, BDSD, BDSW);

	        registerToolSet(BLDPX, BLDAX, BLDSD, BLDSW);
	        
	        registerToolSet(GDPX, GDAX, GDSD, GDSW);
	        
	        registerToolSet(GRDPX, GRDAX, GRDSD, GRDSW);
	        
	        registerToolSet(ODPX, ODAX, ODSD, ODSW);
	        
	        registerToolSet(PDPX, PDAX, PDSD, PDSW);
	        
	        registerToolSet(PUDPX, PUDAX, PUDSD, PUDSW);
	        
	        registerToolSet(RDPX, RDAX, RDSD, RDSW);
	        
	        registerToolSet(WDPX, WDAX, WDSD, WDSW);
	       
	        registerToolSet(YDPX, YDAX, YDSD, YDSW);
	        
			isInitialized = true;

			}
		    
	}
	public static void registerToolSet(ItemPickaxeMain pick, ItemAxeMain axe, ItemSpadeMain spade, ItemSwordMain sword)
    {
        GameRegistry.registerItem(pick, pick.getName());
        GameRegistry.registerItem(axe, axe.getName());
        GameRegistry.registerItem(spade, spade.getName());
        GameRegistry.registerItem(sword, sword.getName());
        ModelHelper.registerItem(pick,Strings.MODID+":"+ pick.getName());
        ModelHelper.registerItem(axe,Strings.MODID+":"+ axe.getName());
        ModelHelper.registerItem(spade,Strings.MODID+":"+ spade.getName());
        ModelHelper.registerItem(sword,Strings.MODID+":"+ sword.getName());
        
        
    }
	
	public static Item get(Item item) 
	{
		return itemList.get(item);
	}
	
	public static void registerItem2(Item item) 
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID);
	}
	
    public static void registerItem(Item item, String string)
    {
        GameRegistry.registerItem(item, string);
        ModelHelper.registerItem(item,Strings.MODID+":"+ string);
    }
}