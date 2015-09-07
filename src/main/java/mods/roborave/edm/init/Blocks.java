package mods.roborave.edm.init;

import java.util.HashMap;

import mods.roborave.edm.EDM;
import mods.roborave.edm.blocks.BlockCompressed;
import mods.roborave.edm.blocks.BlockOre;
import mods.roborave.edm.client.model.ModelHelper;
import mods.roborave.edm.init.json.JsonCreator;
import mods.roborave.edm.lib.Strings;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.apache.logging.log4j.Level;

public class Blocks 
{

	private static boolean isInitialized = false;
	
	/**Testing 
	 * default: public HashMap blockList = new HashMap();
	 */
	public static HashMap<String,Block> blockList = new HashMap<String, Block>();

	public Blocks instance;

	public static Block BD;
	public static Block BLD;
	public static Block GD;
	public static Block GRD;
	public static Block OD;
	public static Block PD;
	public static Block PUD;
	public static Block RD;
	public static Block WD;
	public static Block YD;
	
	public static BlockOre BDO;
	public static BlockOre BLDO;
	public static BlockOre GDO;
	public static BlockOre GRDO;
	public static BlockOre ODO;
	public static BlockOre PDO;
	public static BlockOre PUDO;
	public static BlockOre RDO;
	public static BlockOre WDO;
	public static BlockOre YDO;
	
	public static void init() 
	{
		if (isInitialized) 
		{
			EDM.Instance.getLogger().info("Block initialization failed, already initialized");
			
		}else{
		
		EDM.Instance.getLogger().log(Level.INFO,"Initializing Blocks");
		
		BD = new BlockCompressed("Black_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(BD,"Black_diamond_Block");
	
		BLD =new BlockCompressed("Blue_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(BLD,"Blue_diamond_Block");
		
		GD =new BlockCompressed("Gray_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(GD,"Gray_diamond_Block");
	
		GRD =new BlockCompressed("Green_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(GRD,"Green_diamond_Block");
	
		OD =new BlockCompressed("Orange_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(OD,"Orange_diamond_Block");
	
		PD =new BlockCompressed("Pink_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(PD,"Pink_diamond_Block");

		PUD =new BlockCompressed("Purple_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(PUD,"Purple_diamond_Block");
		
		RD =new BlockCompressed("Red_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(RD,"Red_diamond_Block");
		
		WD =new BlockCompressed("White_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(WD,"White_diamond_Block");
	
		YD =new BlockCompressed("Yellow_diamond_Block").setCreativeTab(EDM.tabEDMBlock);
		registerBlock(YD,"Yellow_diamond_Block");
		
		BDO = (BlockOre) new BlockOre("Black").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(BDO,"Black_diamond_Ore");
	
		BLDO =(BlockOre) new BlockOre("Blue").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(BLDO,"Blue_diamond_Ore");
		
		GDO =(BlockOre) new BlockOre("Gray").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(GDO,"Gray_diamond_Ore");
	
		GRDO =(BlockOre) new BlockOre("Green").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(GRDO,"Green_diamond_Ore");
	
		ODO =(BlockOre) new BlockOre("Orange").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(ODO,"Orange_diamond_Ore");
	
		PDO =(BlockOre) new BlockOre("Pink").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(PDO,"Pink_diamond_Ore");

		PUDO =(BlockOre) new BlockOre("Purple").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(PUDO,"Purple_diamond_Ore");
		
		RDO =(BlockOre) new BlockOre("Red").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(RDO,"Red_diamond_Ore");
		
		WDO =(BlockOre) new BlockOre("White").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(WDO,"White_diamond_Ore");
	
		YDO =(BlockOre) new BlockOre("Yellow").setCreativeTab(EDM.tabEDMBlock);
		registerBlockOre(YDO,"Yellow_diamond_Ore");
		
		isInitialized = true;
		}
	}
	
	public static Block getBlock(String blockName) 
	{
		try 
		{
			return (Block) Blocks.blockList.get(blockName);
		} 
		catch (Throwable e)
		{
			return null;
		}
	}
	public static void registerBlock(Block block, String string)
	{
	        GameRegistry.registerBlock(block, string);
	        ModelHelper.registerBlock(block, Strings.MODID+":" + string);
	}
	public static void registerBlockOre(BlockOre block, String string)
	{
	        GameRegistry.registerBlock(block, string);
	        ModelHelper.registerBlock(block, Strings.MODID+":" + string);
	        
	}
}