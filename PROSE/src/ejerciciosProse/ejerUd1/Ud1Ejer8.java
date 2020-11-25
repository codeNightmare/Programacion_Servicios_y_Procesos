package ejerciciosProse.ejerUd1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Ud.1 Act.8 - 
 * 1. Crear objeto ProcessBuilder que consulte variables.
 * 2. Crear segundo ProcessBuilder que cree un proceso que lance ls -help 
 * y mostrarlo por pantalla.
 */
public class Ud1Ejer8 {

	public static void main(String[] args) {
		ProcessBuilder pb1 = new ProcessBuilder();
		Map<String, String> variablesEntorno = pb1.environment();
		System.out.println(variablesEntorno);
		
		List<String> listaCommand = new ArrayList<String>();
		listaCommand.add("CMD");
		listaCommand.add("/C");
		listaCommand.add("DIR");
		
		ProcessBuilder pb2 = new ProcessBuilder(listaCommand);
		System.out.println(pb2.command());
		
		
		try {
			pb2.start();	
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
