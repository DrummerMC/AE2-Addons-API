/**
 * 
 */
package DrummerMC.AE2_Addons.Api.Grid;

import java.util.List;

import DrummerMC.AE2_Addons.Api.Util.EnergyType;
import appeng.api.config.Actionable;

/**
 * @author DrummerMC
 *
 */
public interface IEnergyGrid {
	/**
	 * 
	 * @param amount
	 * @param actionable
	 * @param type
	 * @return he amount of energy that cant't be stored
	 */
	public double insertEnergy(double amount, Actionable actionable, EnergyType type);
	/**
	 * 
	 * @param amount
	 * @param actionable
	 * @param type
	 * @return the amount of energy that was extract
	 */
	public double extractEnergy(double amount, Actionable actionable, EnergyType type);
	/**
	 * 
	 * @param type
	 * @return the amount of stored energy
	 */
	public double getEnergy(EnergyType type);
	/**
	 * 
	 * @param list
	 * @return the EnergyTypes that are Stored in this {@link TileEntity} or {@link IPart}
	 */
	public List<EnergyType> getEnergyType(List list);
	/**
	 * 
	 * @return the Channel Name
	 */
	public String getChannelName();
}