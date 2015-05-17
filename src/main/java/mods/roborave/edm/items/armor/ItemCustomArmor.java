package mods.roborave.edm.items.armor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
public class ItemCustomArmor extends ItemArmor implements ISpecialArmor 
{
	private Object color;
	private int type;

	public ItemCustomArmor(ArmorMaterial mat, int par2Name, int par3Type, String par4Color) 
	{
		super(mat, par3Type, par2Name);
		if(type==0 && type==1){
			this.type=1;
		}else{
			this.type=2;
		}
		
		this.color=par4Color;
	}
	//This is the MOST important method in this class! This gets called every time a player wearing your armor gets damaged, however it is called before the damage is applied so you can modify it.
	@SuppressWarnings("static-access")
	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) 
	{
		if(source == source.inFire || source == source.lava || source == source.onFire) 
		{ //Check for fire damage, you can use other types of damage too.
			return new ArmorProperties(1, 1, MathHelper.floor_double(damage * .25D));
		}
		return new ArmorProperties(0, 0, 0);
	}
	
	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) 
	{
		return 4; //How many half shields each piece of armor will fill up on the armor bar
	}
	
	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) 
	{
		stack.damageItem(damage * 2, entity); //Allows you to control the amount of damage done to each piece of armor, useful for nerfing some suits of armor.
	}

	@Override //This is pretty self explanatory
	public String getArmorTexture(ItemStack armor, Entity entity, int slot, String type) 
	{
		if(this.type==1) 
		{
			return "minecraft"+":textures/models/armor/"+this.color.toString()+"_layer_1.png";
		} else {
			return "minecraft"+":textures/models/armor/"+this.color.toString()+"_layer_2.png";
	}
}

	@Override
	public CreativeTabs[] getCreativeTabs() 
	{
		return new CreativeTabs[] {CreativeTabs.tabCombat}; //This lets me put my armor in as many create tabs as I want, pretty cool right?
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) 
	{
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 500, 4));		
	}

	@Override
	public boolean getIsRepairable(ItemStack armor, ItemStack stack) 
	{
		return true; //Alllows certain items to repair this armor.
	}
}