package ejerciciosProse.ejerUd1;

import java.io.IOException;
import java.util.Map;

/*
 * Ud.1 Act.8 - Crear una varaible de entorno JAVA_HOME (raiz del jdk) y hacer en el main:
 * 1. Crear objeto ProcessBuilder que consulte dichas variables.
 * 2. Crear segundo ProcessBuilder que cree un proceso que lance ls -help 
 * y mostrarlo por pantalla.
 */
public class Ud1Ejer8 {

	// variable de entorno
	private static final String JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_111";
	private static final String COMANDO_LINUX = "ls -help";
	private static final String COMANDO_WINDOWS = "cmd /c help dir";
	
	public static void main(String[] args) {
		ProcessBuilder pb1 = new ProcessBuilder(JAVA_HOME, "/c", "cmd set " + JAVA_HOME);
		ProcessBuilder pb2 = new ProcessBuilder();
		Process procesoListar;
		
		Map<String, String> env = pb1.environment();
		
		//fhcd
		
		try {
			procesoListar = pb2.start();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
