package mods.roborave.edm.tweaker.register;
import java.util.HashMap;

import mods.roborave.edm.tweaker.api.IObject;
import mods.roborave.edm.tweaker.helper.LogHelper;

public class RegistryManager
{
	public static HashMap<Class<?extends IObject>,String> APIClasses = new HashMap<Class<? extends IObject>, String>();
	
	public static void init()
	{
		LogHelper.info("Registered %s API Classes", APIClasses.size());
	}
	/**
	* 
	* @param clazz the class that needs to initizied
	*/
	public static void registerAPIClass(Class<?extends IObject> clazz)
	{
		APIClasses.put(clazz,clazz.toString().toLowerCase());
		try {
			clazz.newInstance().initialize();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
