/**
 * 
 */
package DrummerMC.AE2_Addons.Api.Grid;

import DrummerMC.AE2_Addons.Api.Util.EnergyType;
import appeng.api.networking.IGridCache;

/**
 * @author DrummerMC
 *
 */
public interface IEnergyStorrageGrid extends IGridCache {
	
	
	public Double getEnergy(EnergyType type);
}
