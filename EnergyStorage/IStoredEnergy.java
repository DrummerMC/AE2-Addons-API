package DrummerMC.AE2_Addons.Api.EnergyStorage;

import DrummerMC.AE2_Addons.Api.Util.EnergyType;

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
	
}
