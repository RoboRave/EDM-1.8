package mods.roborave.edm.lib;


public class Strings {

	public Strings Instance;
	
	public static final String MODID = "Extra_Diamonds_Mod";
	
	public static final String MODID(){	return Reference.MODID;	}
	
	public static final  String name = "extra_diamonds_mod";
	public static final String version = "5.0.0";
	
	public static final String CONFIG_CATEGORY_VERCHECK = "versioncheck";

	public static final String CONFIG_CHECKFORUPDATES = "checkForUpdates";
	public static final String CONFIG_CHECKFORUPDATES_DESC = "Should the mod check for updates?";

	public static final String CONFIG_SILENCEKNOWNUPDATES = "silenceKnownUpdates";
	public static final String CONFIG_SILENCEKNOWNUPDATES_DESC = "Should the mod remind you only for new updates (once per version)?";

	public static final String CONFIG_KNOWNVERSIONS = "knownVersions";
	public static final String CONFIG_KNOWNVERSIONS_DESC = "A list of known updates. Deleting versions from the list will remind you about them again.";

	public static final String VERCHECK_RECOMMENDED_FORGE = "\n---\nRecommended Forge: %s";
	public static final String VERCHECK_URL = "https://dl.dropboxusercontent.com/u/100336313/minecraft/mods/EDM/version/%s/%s.json";
	public static final String VERCHECK_VERSION = "%s -> %s";

	public static final String VERCHECK_UPDATEAVAILABLE = "\nUpdate is available (%s -> %s)!";
	public static final String VERCHECK_UPTODATE = "\nUp to date!";

	public static final String VERCHECK_UPDATEAVAILABLECON = "Update is available for %s (%s -> %s)!";
	public static final String VERCHECK_UPTODATECON = "%s is up to date!";
	public static final String VERCHECK_FUTURECON = "Is %s from the future?";

	public static final String MESSAGE_UPDATESAVAILABLE = "edm.message.updatesavailable";
}
