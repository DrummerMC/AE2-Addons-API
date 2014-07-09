package DrummerMC.Extra_Stuff.Api.EnergyStorage;

import appeng.api.networking.IGrid;
import DrummerMC.Extra_Stuff.Api.Util.EnergyType;

public interface IStoredEnergy {
	/**
	 * 
	 * @return the EnergyType {@link EnergyType}
	 */
	public EnergyType getEnergyType();
	
	/**
	 * 
	 * @return the Channel Name
	 */
	public String getChannelName();
	/**
	 * update the energy
	 */
	public void update(IGrid grid);
	
}
