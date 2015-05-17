package mods.roborave.edm.helper;

import mods.roborave.edm.lib.Strings;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHandler{
	
	public static Logger log;
	
	public static LogHandler instance;
	
	private static boolean configured = false;

	public void init()
	{
		log = LogManager.getLogger(Strings.MODID);
		configured = true;
	}

	public void log(Level level, String message)
	{
		if (!configured)
		{
			init();
		}
		log.log(level, "[" + Strings.version + "] " + message, new Object[0]);
	}
	public void log(Level level, String message,Object... params)
	{
		log.log(level, message, params);
	}
	
	public void info(String message) 
	{
		log(Level.INFO, message);
	}

}