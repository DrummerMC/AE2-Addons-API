package DrummerMC.Extra_Stuff.Api;

public class Extrastuff {
	static private IExtraStuffAPI api = null;

	/**
	 * API Entry Point.
	 * 
	 * @return the {@link IExtraStuffAPI}
	 */
	public static IExtraStuffAPI instance(){
		if ( api == null ){
			try{
				Class c = Class.forName("DrummerMC.AE2_Addons.API");
				api = (IExtraStuffAPI) c.getField("instance").get(c);
			}catch (Exception e){
				return null;
			}
		}
		return api;
	}
}