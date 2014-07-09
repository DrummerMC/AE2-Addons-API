package DrummerMC.Extra_Stuff.Api.Events;

import DrummerMC.Extra_Stuff.Api.Grid.IEnergyGrid;
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
