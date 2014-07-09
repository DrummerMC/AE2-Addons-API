/**
 * 
 */
package DrummerMC.Extra_Stuff.Api.Grid;

import DrummerMC.Extra_Stuff.Api.Extrastuff;
import DrummerMC.Extra_Stuff.Api.Util.EnergyType;
import appeng.api.config.Actionable;
import appeng.api.networking.IGridCache;

/**
 * @author DrummerMC
 * 
 * 
 * 
 */
public interface IEnergyStorageGrid extends IGridCache {
	
	/**
	 * 
	 * @param type
	 * @param ChannelName
	 * @return the amount of energy that is stored in the network for the EnergyType {@link EnergyType}
	 */
	public double getEnergy(EnergyType type, String ChannelName);
	/**
	 * 
	 * @param amount
	 * @param actionable
	 * @param type
	 * @param ChannelName
	 * @return the amount of energy that can't fill for the EnergyType {@link EnergyType}
	 */
	public double fillEnergy(double amount, String ChannelName, Actionable actionable, EnergyType type);
	/**
	 * 
	 * @param amount
	 * @param actionable
	 * @param type
	 * @param ChannelName
	 * @return the amount of energy that was drain for the EnergyType {@link EnergyType}
	 */
	public double drainEnergy(double amount, String ChannelName, Actionable actionable, EnergyType type);
}
