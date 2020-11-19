package ejerciciosProse.ejerUd1;

public class Ud1Ejer7 {

	public static void main(String[] args) {
		//String comandoLinux = "firefox";
		//String comandoWindows = "C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		String comandoWindows = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		
		String comando = comandoWindows;
		
		try {
			ProcessBuilder pb = new ProcessBuilder(comando, "iescristobaldemonroy.es");
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
