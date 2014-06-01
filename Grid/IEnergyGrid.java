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
	 * @return he amount of energy that cant't be stored
	 */
	public double insertEnergy(double amount, Actionable actionable);
	/**
	 * 
	 * @param amount
	 * @param actionable
	 * @return the amount of energy that was extract
	 */
	public double extractEnergy(double amount, Actionable actionable);
	/**
	 * 
	 * @return the amount of stored energy
	 */
	public double getEnergy();
	/**
	 * 
	 * @return the max Energy that can stored
	 */
	public double getMaxEnergy();
	/**
	 * 
	 * @param list
	 * @return the EnergyType that is Stored in this {@link TileEntity} or {@link IPart}
	 */
	public EnergyType getEnergyType();
	/**
	 * 
	 * @return the Channel Name
	 */
	public String getChannelName();
}