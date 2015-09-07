package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.client.ClientProxy;
import mods.roborave.edm.client.model.ItemRenderRegister;
import mods.roborave.edm.client.model.ModelHelper;
import mods.roborave.edm.items.armor.ItemBoots;
import mods.roborave.edm.items.armor.ItemChest;
import mods.roborave.edm.items.armor.ItemHelmat;
import mods.roborave.edm.items.armor.ItemLegs;
import mods.roborave.edm.items.armor.ItemModArmor;
import mods.roborave.edm.lib.Strings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
public class Armor 
{
	public static ArmorMaterial TUTORIALA = EnumHelper.addArmorMaterial("TUTORIALA", Strings.name+Strings.name, 16, new int[]{3, 8, 6, 3}, 30);
	
	public static HashMap<String , Item> itemList = new HashMap<String , Item>(); 
	public static ItemHelmat BDH;
	public static ItemChest BDC;
	public static ItemLegs BDP;
	public static ItemBoots BDB;
	
	public static ItemHelmat BLDH;
	public static ItemChest BLDC;
	public static ItemLegs BLDP;
	public static ItemBoots BLDB;

	public static ItemHelmat GDH;
	public static ItemChest GDC;
	public static ItemLegs GDP;
	public static ItemBoots GDB;
	
	public static ItemHelmat GRDH;
	public static ItemChest GRDC;
	public static ItemLegs GRDP;
	public static ItemBoots GRDB;
	
	public static ItemHelmat ODH;
	public static ItemChest ODC;
	public static ItemLegs ODP;
	public static ItemBoots ODB;
	
	public static ItemHelmat PDH;
	public static ItemChest PDC;
	public static ItemLegs PDP;
	public static ItemBoots PDB;
	
	public static ItemHelmat PUDH;
	public static ItemChest PUDC;
	public static ItemLegs PUDP;
	public static ItemBoots PUDB;
	
	public static ItemHelmat RDH;
	public static ItemChest RDC;
	public static ItemLegs RDP;
	public static ItemBoots RDB;
	
	public static ItemHelmat WDH;
	public static ItemChest WDC;
	public static ItemLegs WDP;
	public static ItemBoots WDB;
	
	public static ItemHelmat YDH;
	public static ItemChest YDC;
	public static ItemLegs YDP;
	public static ItemBoots YDB;
	
	public static Item tutorialHelmet;
	public static Item tutorialChestplate;
	public static Item tutorialLeggings;
	public static Item tutorialBoots;
	public static void init()
	{
		
		EDM.Instance.getLogger().info("Initializing Armor");
		
        BDH = (ItemHelmat) new ItemHelmat(ClientProxy.Black_Diamonds,1, "Black").setUnlocalizedName("Black_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        BDC= (ItemChest) new ItemChest(ClientProxy.Black_Diamonds,2 ,"Black").setUnlocalizedName("Black_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        BDP= (ItemLegs) new ItemLegs(ClientProxy.Black_Diamonds, 3,"Black").setUnlocalizedName("Black_Diamond_Legs").setCreativeTab(EDM.tabEDMArmor);
        BDB= (ItemBoots) new ItemBoots(ClientProxy.Black_Diamonds, 4,"Black").setUnlocalizedName("Black_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        BLDH= (ItemHelmat) new ItemHelmat(ClientProxy.Blue_Diamonds, 1, "Blue").setUnlocalizedName("Blue_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        BLDC= (ItemChest) new ItemChest(ClientProxy.Blue_Diamonds,  2, "Blue").setUnlocalizedName("Blue_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        BLDP= (ItemLegs) new ItemLegs(ClientProxy.Blue_Diamonds, 3, "Blue").setUnlocalizedName("Blue_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        BLDB= (ItemBoots) new ItemBoots(ClientProxy.Blue_Diamonds, 4,"Blue").setUnlocalizedName("Blue_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        GDH= (ItemHelmat) new ItemHelmat(ClientProxy.Gray_Diamonds,1, "Gray").setUnlocalizedName("Gray_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        GDC= (ItemChest) new ItemChest(ClientProxy.Gray_Diamonds,2,"Gray").setUnlocalizedName("Gray_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        GDP= (ItemLegs) new ItemLegs(ClientProxy.Gray_Diamonds,3,"Gray").setUnlocalizedName("Gray_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        GDB= (ItemBoots) new ItemBoots(ClientProxy.Gray_Diamonds,4,"Gray").setUnlocalizedName("Gray_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        GRDH= (ItemHelmat) new ItemHelmat(ClientProxy.Green_Diamonds, 1,"Green").setUnlocalizedName("Green_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        GRDC= (ItemChest) new ItemChest(ClientProxy.Green_Diamonds, 2,"Green").setUnlocalizedName("Green_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        GRDP= (ItemLegs) new ItemLegs(ClientProxy.Green_Diamonds, 3,"Green").setUnlocalizedName("Green_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        GRDB= (ItemBoots) new ItemBoots(ClientProxy.Green_Diamonds, 4,"Green").setUnlocalizedName("Green_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        ODH= (ItemHelmat) new ItemHelmat(ClientProxy.Orange_Diamonds,1, "Orange").setUnlocalizedName("Orange_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        ODC= (ItemChest) new ItemChest(ClientProxy.Orange_Diamonds,2,"Orange").setUnlocalizedName("Orange_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        ODP= (ItemLegs) new ItemLegs(ClientProxy.Orange_Diamonds,3,"Orange").setUnlocalizedName("Orange_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        ODB= (ItemBoots) new ItemBoots(ClientProxy.Orange_Diamonds,4,"Orange").setUnlocalizedName("Orange_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
       
        PDH= (ItemHelmat) new ItemHelmat(ClientProxy.Pink_Diamonds,1, "Pink").setUnlocalizedName("Pink_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        PDC= (ItemChest) new ItemChest(ClientProxy.Pink_Diamonds,2,"Pink").setUnlocalizedName("Pink_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        PDP= (ItemLegs) new ItemLegs(ClientProxy.Pink_Diamonds,3,"Pink").setUnlocalizedName("Pink_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        PDB= (ItemBoots) new ItemBoots(ClientProxy.Pink_Diamonds,4,"Pink").setUnlocalizedName("Pink_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        PUDH= (ItemHelmat) new ItemHelmat(ClientProxy.Purple_Diamonds,1, "Purple").setUnlocalizedName("Purple_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        PUDC= (ItemChest) new ItemChest(ClientProxy.Purple_Diamonds,2,"Purple").setUnlocalizedName("Purple_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        PUDP= (ItemLegs) new ItemLegs(ClientProxy.Purple_Diamonds,3,"Purple").setUnlocalizedName("Purple_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        PUDB= (ItemBoots) new ItemBoots(ClientProxy.Purple_Diamonds,4,"Purple").setUnlocalizedName("Purple_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);

        RDH= (ItemHelmat) new ItemHelmat(ClientProxy.Red_Diamonds,1, "Red").setUnlocalizedName("Red_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        RDC= (ItemChest) new ItemChest(ClientProxy.Red_Diamonds,2,"Red").setUnlocalizedName("Red_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        RDP= (ItemLegs) new ItemLegs(ClientProxy.Red_Diamonds,3,"Red").setUnlocalizedName("Red_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        RDB= (ItemBoots) new ItemBoots(ClientProxy.Red_Diamonds,4,"Red").setUnlocalizedName("Red_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        WDH= (ItemHelmat) new ItemHelmat(ClientProxy.White_Diamonds,1, "White").setUnlocalizedName("White_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        WDC= (ItemChest) new ItemChest(ClientProxy.White_Diamonds,2,"White").setUnlocalizedName("White_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        WDP= (ItemLegs) new ItemLegs(ClientProxy.White_Diamonds,3,"White").setUnlocalizedName("White_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        WDB= (ItemBoots) new ItemBoots(ClientProxy.White_Diamonds,4,"White").setUnlocalizedName("White_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        YDH= (ItemHelmat) new ItemHelmat(ClientProxy.Yellow_Diamonds,1, "Yellow").setUnlocalizedName("Yellow_Diamond_Helm").setCreativeTab(EDM.tabEDMArmor);
        YDC= (ItemChest) new ItemChest(ClientProxy.Yellow_Diamonds,2,"Yellow").setUnlocalizedName("Yellow_Diamond_Chest").setCreativeTab(EDM.tabEDMArmor);
        YDP= (ItemLegs) new ItemLegs(ClientProxy.Yellow_Diamonds,3,"Yellow").setUnlocalizedName("Yellow_Diamond_Pants").setCreativeTab(EDM.tabEDMArmor);
        YDB= (ItemBoots) new ItemBoots(ClientProxy.Yellow_Diamonds,4,"Yellow").setUnlocalizedName("Yellow_Diamond_Boots").setCreativeTab(EDM.tabEDMArmor);
        
        GameRegistry.registerItem(tutorialHelmet = new ItemModArmor("tutorial_helmet", TUTORIALA, 1, 0), "tutorial_helmet");
		GameRegistry.registerItem(tutorialChestplate = new ItemModArmor("tutorial_chestplate", TUTORIALA, 1, 1), "tutorial_chestplate");
		GameRegistry.registerItem(tutorialLeggings = new ItemModArmor("tutorial_leggings", TUTORIALA, 2, 2), "tutorial_leggings");
		GameRegistry.registerItem(tutorialBoots = new ItemModArmor("tutorial_boots", TUTORIALA, 1, 3), "tutorial_boots");
        
		registerArmorSet(BDH,BDC,BDP,BDB);
        registerArmorSet(BLDH,BLDC,BLDP,BLDB);
        registerArmorSet(GDH,GDC,GDP,GDB);
        registerArmorSet(GRDH,GRDC,GRDP,GRDB);
        registerArmorSet(ODH,ODC,ODP,ODB);
        registerArmorSet(PDH,PDC,PDP,PDB);
        registerArmorSet(PUDH,PUDC,PUDP,PUDB);
		registerArmorSet(RDH,RDC,RDP,RDB);
		registerArmorSet(WDH,WDC,WDP,WDB);
		registerArmorSet(YDH,YDC,YDP,YDB);
		ItemRenderRegister.registerItemRenderer();
	}
	
	public static void registerArmorSet(ItemHelmat helm, ItemChest chest, ItemLegs legs, ItemBoots boots)
    {
        GameRegistry.registerItem(helm, helm.getArmorColor());
        GameRegistry.registerItem(chest, chest.getArmorColor());
        GameRegistry.registerItem(legs, legs.getArmorColor());
        GameRegistry.registerItem(boots, boots.getArmorColor());
        ModelHelper.registerItem(helm,Strings.MODID+":"+ helm.getArmorColor());
        ModelHelper.registerItem(chest,Strings.MODID+":"+ chest.getArmorColor());
        ModelHelper.registerItem(legs,Strings.MODID+":"+ legs.getArmorColor());
        ModelHelper.registerItem(boots,Strings.MODID+":"+ boots.getArmorColor());
    }
	
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName(), Strings.MODID());
	}
}
