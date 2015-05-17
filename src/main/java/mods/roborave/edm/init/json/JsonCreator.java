package mods.roborave.edm.init.json;

import mods.roborave.edm.EDM;
import mods.roborave.edm.lib.Strings;

import org.apache.logging.log4j.Level;

public class JsonCreator {

	public static void generateJsonBlock(String BlockName) {
		EDM.Instance.logger.log(Level.INFO,"Generating JSON file.");
	    
		IJsonData jsonData = null;
        jsonData = new BlockJson(Strings.name, BlockName);
        JsonGenerator.generateJson(Strings.name, jsonData);
        
    }
	
	public static void generateJsonItem(String ItemName) {
		EDM.Instance.logger.log(Level.INFO,"Generating JSON file.");

        IJsonData jsonData = null;
        jsonData = new ItemJson(Strings.name, ItemName);
        JsonGenerator.generateJson(Strings.name, jsonData);
    }

}
