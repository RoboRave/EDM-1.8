package mods.roborave.edm.config;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import mods.roborave.edm.EDM;
import mods.roborave.edm.lib.Strings;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class Config extends Configuration 
{
	public final Property propCheckForUpdates;
	public final Property propSilenceKnownUpdates;
	public final Property propKnownUpdates;

	public Config(File file)
	{
		super(file);

		this.propCheckForUpdates = get(Configuration.CATEGORY_GENERAL, Strings.CONFIG_CHECKFORUPDATES, true, Strings.CONFIG_CHECKFORUPDATES_DESC);
		this.propSilenceKnownUpdates = get(Configuration.CATEGORY_GENERAL, Strings.CONFIG_SILENCEKNOWNUPDATES, false, Strings.CONFIG_SILENCEKNOWNUPDATES_DESC);
		this.propKnownUpdates = get(Configuration.CATEGORY_GENERAL, Strings.CONFIG_KNOWNVERSIONS, new String[0], Strings.CONFIG_KNOWNVERSIONS_DESC);
		EDM.hardMode = getBoolean(Configuration.CATEGORY_GENERAL, "HardMode", EDM.test, EDM.descriptionDEV);
	}

	public boolean checkForUpdates() 
	{
		return this.propCheckForUpdates.getBoolean(true);
	}

	public boolean silenceKnownUpdates() 
	{
		return this.propSilenceKnownUpdates.getBoolean(false);
	}

	public void addUpdate(String modid, String version) 
	{
		List<String> knownUpdatesList = new ArrayList<String>(Arrays.asList(this.propKnownUpdates.getStringList()));
		String update = String.format("%s %s", modid, version);
		if (!knownUpdatesList.contains(update)) 
		{
			knownUpdatesList.add(update);
		}
		Collections.sort(knownUpdatesList);

		String[] knownUpdates = new String[knownUpdatesList.size()];
		knownUpdates = knownUpdatesList.toArray(knownUpdates);
		this.propKnownUpdates.set(knownUpdates);
		save();
	}

	public boolean canNotifyOfUpdate(String modid, String version) 
	{
		return !Arrays.asList(this.propKnownUpdates.getStringList()).contains(String.format("%s %s", modid, version)) || !silenceKnownUpdates();
	}
}