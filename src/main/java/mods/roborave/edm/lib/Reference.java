package mods.roborave.edm.lib;

import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.Logger;

import com.google.common.base.Throwables;

public class Reference {
	
	static {
		Properties prop = new Properties();

		try {
			InputStream stream = Reference.class.getClassLoader().getResourceAsStream("version.properties");
			prop.load(stream);
			stream.close();
		} catch (Exception e) {
			Throwables.propagate(e);
		}

		VERSION = prop.getProperty("version.mod");
		FORGE = prop.getProperty("version.forge");
		MINECRAFT = prop.getProperty("version.minecraft");
	}

	public static final String MODID = "Extra_diamonds_Mod";
	public static final String NAME = "extra_diamonds_mod";
	public static final String VERSION;
	public static final String FORGE;
	public static final String MINECRAFT;
	public static final String PROXY_COMMON = "mods.roborave.edm.common.CommonProxy";
	public static final String PROXY_CLIENT = "mods.roborave.edm.client.ClientProxy";
	
	public static Logger logger = null;
}