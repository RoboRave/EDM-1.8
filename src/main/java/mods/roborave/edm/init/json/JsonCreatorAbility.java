package mods.roborave.edm.init.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.Logger;

import mods.roborave.edm.EDM;

import com.google.gson.Gson;

public class JsonCreatorAbility   
{
    public static JsonCreatorAbility instance = new JsonCreatorAbility();
    public static String RunLocation = "./Ability/";
    public static File path;
    public static TestAbility test = new TestAbility();
    public static FlyAbility fly = new FlyAbility();
    public static void genDefaults(){
        test.setname("MinecraftForge");
        test.setvalue("false");
        fly.setname("EDM");
        fly.setvalue("false");
        //File f= new File(RunLocation+"config.json");
        run();
        
    }
    public static boolean createFolder(String folderPath) {
        return createFolder(new File(folderPath));
    }

    public static boolean createFolder(File folder) {
        if (!folder.exists())
            return folder.mkdir();
        return folder.exists();
    }
    public static void createFile(String fileName) {
        createFile(new File(fileName));
    }
    public static void createFile(File file) {
        if (!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                EDM.Instance.logger.info("Failed to create file: "+ file.getName());
            }
        }
        
    }
   
    public static void run() {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(fly);
            String json2= gson.toJson(test);
            // File.WriteAllText(RunLocation + "/config.json", gson.toJson(config));
            // File.WriteAllText(RunLocation + "/config.json", Gson.SerializeObject(es));
            // serialize JSON directly to a file
            // PrintWriter file = new PrintWriter(new OutputStreamWriter(new FileOutputStream(RunLocation + "/config.json"), Charset.forName("UTF-8")));
            
              System.out.print(json);
              System.out.print(json2);
            //createFolder(new File("./ability/output/"));
            //createFolder(new File("./ability/output/"));

            createFile(new File("./output/config.json"));
            FileWriter writer = new FileWriter("config.json");
            writer.write(json);
            writer.write(json2);
            writer.close();
            //  serializer.Serialize(file, config);
            //  serializer.Serialize(file, es);
        } catch (IOException ex) {
         
        }
         
    }

}


