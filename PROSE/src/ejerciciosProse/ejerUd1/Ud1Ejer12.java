package ejerciciosProse.ejerUd1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 *  main que lance dos procesos para ejecutar las clases:
 *  - UD01Ej12ProcEscritorA
 *  - UD01Ej12ProcEscritorB
 *  
 *  Lanza esta clase número 12 y observa la salida del fichero ejercicio12.txt.
 *  ¿Qué cambios harías en la clase PSP.UD01.recursos.GestorFicheros para que
 *  escriba sólo un proceso cada vez?
 */
public class Ud1Ejer12 {

	public static void main(String[] args) {
		
		List<String> lCommandA = new ArrayList<String>();
		lCommandA.add("Java");
		lCommandA.add("ejerciciosProse.ejerUd1.recursos.UD01Ej12ProcEscritorA");
		
		List<String> lCommandB = new ArrayList<String>();
		lCommandB.add("Java");
		lCommandB.add("ejerciciosProse.ejerUd1.recursos.UD01Ej12ProcEscritorB");

		
		String classpath = "C:\\Users\\Javier\\git\\Programacion_Servicios_y_Procesos\\PROSE\\bin";
		
		ProcessBuilder pbA, pbB;
		
		pbA = new ProcessBuilder(lCommandA);
		pbA.environment().put("CLASSPATH", classpath);
		pbA.inheritIO();
		
		pbB = new ProcessBuilder(lCommandB);
		pbB.environment().put("CLASSPATH", classpath);
		pbB.inheritIO();
		
		File algo = new File("error_ejer9.txt");
		
		try {
			algo.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pbA.redirectError(algo);
		//pb.redirectOutput(new File("salida_ejer9.txt"));
		
		try {
			pbA.start();
			pbB.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
