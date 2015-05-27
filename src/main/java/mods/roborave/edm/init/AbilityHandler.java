package mods.roborave.edm.init;

import mods.roborave.edm.common.Ability;
/**
 * 
 * @author Zach
 *WIP 
 *TODO Make WORK
 */
public class AbilityHandler {

	public static Ability BlueDiamond;
	public static void init() 
	{
		BlueDiamond= new Ability("Black_diamond", Items.BD);
		Ability.addAbility(Items.BD, BlueDiamond).getAbilityName();
	}

}
