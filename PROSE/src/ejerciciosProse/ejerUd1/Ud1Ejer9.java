package ejerciciosProse.ejerUd1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
 * Ud.1 Act.9 - método main cree un ProcessBuilder con un List de String realizando 
 * un listado del directorio src. Las salidas estándar y de error deben ser redirigidas 
 * a un fichero cuyo nombre sea salida_ejercicio9.txt y log_ejercicio9.txt respectivamente.
 * Además, por pantalla debe indicarnos un mensaje sobre qué fichero consultar en función 
 * de si la ejecución del proceso ha sido o no errónea.
 */
public class Ud1Ejer9 {

	public static void main(String[] args) {
		//String comandoLinux = "ls -help";
		//String comandoWindows = "CMD /C DIR"; DA ERROR por lo que uso lista
		
		//String comando = comandoWindows;
		ProcessBuilder pb;
		Process p;
		int status = -1;
		
		List<String> lista = new ArrayList<>();
		lista.add("CMD");
		lista.add("/C");
		lista.add("DIR");
		
		try {
			pb = new ProcessBuilder(lista);
			
			pb.redirectError(new File("..\\..\\error_ejer9.txt"));
			pb.redirectInput(new File("..\\..\\salida_ejer9.txt"));
			
			p = pb.start();
			
			status = p.waitFor();
			System.out.println("Resultado: " + status);
			
			if (status != 0) {
				System.out.println("1. Dio error");
			} else {
				System.out.println("2. Todo ok");
			}
			
		} catch (IOException | InterruptedException  e) {
			e.printStackTrace();
		}
		
		

	}

}
