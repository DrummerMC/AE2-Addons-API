package DrummerMC.AE2_Addons.Api;

public class AE2Addons {
	static private IAE2AddonsAPI api = null;

	/**
	 * API Entry Point.
	 * 
	 * @return the {@link IAE2AddonsAPI}
	 */
	public static IAE2AddonsAPI instance(){
		if ( api == null ){
			try{
				Class c = Class.forName("DrummerMC.AE2_Addons.API");
				api = (IAE2AddonsAPI) c.getField("instance").get(c);
			}catch (Exception e){
				return null;
			}
		}
		return api;
	}
}