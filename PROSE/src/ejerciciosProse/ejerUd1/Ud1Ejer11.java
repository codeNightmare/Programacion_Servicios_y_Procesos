package ejerciciosProse.ejerUd1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
 * Realiza una clase Java cuyo método main lance un proceso 
 * ejecutando la clase del Ejercicio10.
 */
public class Ud1Ejer11 {

	public static void main(String[] args) {
		
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("Java");
		lCommand.add("ejerciciosProse.ejerUd1.Ud1Ejer10");

		
		String classpath = "C:\\Users\\Javier\\git\\Programacion_Servicios_y_Procesos\\PROSE\\bin";
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		pb.environment().put("CLASSPATH", classpath);
		pb.inheritIO();
		
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
