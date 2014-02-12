package RestfullTestServer.dao;

public class DataProvider {

	private static String _LAUNCHER_VERSION = "0.0.0";
	private static String _CLIENT_VERSION = "0.0.1";
	
	
	public static String getLauncherVersion(){
		return _LAUNCHER_VERSION;
	}
	
	public static String getClientVersion(){
		return _CLIENT_VERSION;
	}
	
	public static String validateLogin(String login, String password){
		if("TEST".equals(login) && "test".equals(password)){
			return "00001";
		}
		
		return "ERROR";
	}
	
}
