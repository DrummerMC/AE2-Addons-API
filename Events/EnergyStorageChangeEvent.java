package DrummerMC.AE2_Addons.Api.Events;

import DrummerMC.AE2_Addons.Api.Grid.IEnergyGrid;
import appeng.api.networking.events.MENetworkEvent;

public class EnergyStorageChangeEvent extends MENetworkEvent {
	public final IEnergyGrid grid;
	/**
	 * 
	 * @param grid
	 */
	public EnergyStorageChangeEvent(IEnergyGrid grid){
		this.grid = grid;
	}

}
