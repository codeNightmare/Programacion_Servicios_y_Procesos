package ejerciciosProse.ejerUd1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Ud.1 Act.9 - método main cree un ProcessBuilder con un List de String realizando 
 * un listado del directorio src. Las salidas estándar y de error deben ser redirigidas 
 * a un fichero cuyo nombre sea salida_ejercicio9.txt y log_ejercicio9.txt respectivamente.
 * Además, por pantalla debe indicarnos un mensaje sobre qué fichero consultar en función 
 * de si la ejecución del proceso ha sido o no errónea.
 */
public class Ud1Ejer9 {

	public static void main(String[] args) {
		String comandoLinux = "ls -help";
		String comandoWindows = "CMD /C DIR";
		
		String comando = comandoWindows;
		
		ProcessBuilder pb1 = new ProcessBuilder(comando);
		List<String> listaDirectorio = 
		try {
			Process p = pb1.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(pb1.command());
//		List<String> listaFicheros = pb1.command();
//		
//		File directorioTrabajo = pb1.directory();
//		
//		for (int i = 0; i < listaFicheros.size(); i++) {
//			System.out.println(i + ") " + directorioTrabajo + ": " + listaFicheros.get(i));
//		}
		
		
		

	}

}
