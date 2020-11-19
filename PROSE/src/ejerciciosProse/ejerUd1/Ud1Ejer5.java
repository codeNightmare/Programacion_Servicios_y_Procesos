package ejerciciosProse.ejerUd1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Crea una clase Java cuyo método main lance un comando que provoque
 * errores y pinte por pantalla la descripción del error.
 */
public class Ud1Ejer5 {

	public static void main(String[] args) {
		// Comandos mal a proposito
		String comandoLinux = "ls -help";	// ls --help
		String comandoWindows = "cmd /c help -dir";	// help dir
						
		String comando = comandoWindows;
		Process p = null;
		
		try {
			p = Runtime.getRuntime().exec(comando);
					
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		int status;
		BufferedReader br = null;
		
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " ha resultado " + status);
			System.out.println("La salida ha sido: ");
			
			InputStream errStream = p.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errStream));
			
			String linea = "";
			linea = br.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
