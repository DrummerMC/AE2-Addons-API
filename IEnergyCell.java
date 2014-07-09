package DrummerMC.Extra_Stuff.Api;

import appeng.api.config.Actionable;
import DrummerMC.Extra_Stuff.Api.Util.EnergyType;
import net.minecraft.item.ItemStack;

public interface IEnergyCell {
	/**
	 * 
	 * @param is
	 * @return the stored Energy
	 */
	public double getEnergy(ItemStack is, EnergyType type, String ChannelName);
	/**
	 * 
	 * @param is
	 * @return the max amount of energy that can stored
	 */
	public double getMaxEnergy(ItemStack is, EnergyType type, String ChannelName);
	/**
	 * 
	 * @param is
	 * @return the amount of energy that cant added
	 */
	public double addEnergy(ItemStack is, EnergyType type, String ChannelName, double amount, Actionable action);
	/**
	 * 
	 * @param is
	 * @return the amount of Energy that was removed
	 */
	public double removeEnergy(ItemStack is, EnergyType type, String ChannelName, double amount, Actionable action);
	
	public boolean useDefaultEnergyStorageHandler(ItemStack is);
}
