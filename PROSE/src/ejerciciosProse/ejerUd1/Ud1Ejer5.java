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
						
		String comando = comandoLinux;
		String linea;
		Process p = null;
		InputStream errores;
				
		try {
			p = Runtime.getRuntime().exec(comando);
							
			// No se cierra porque no crea un flujo, solo referencia la entrada.
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
					
			int status = p.waitFor();
					
			if (status != 0) {
				errores = p.getErrorStream();
				// pintar el valor ?
				for (int i = 0; i < errores.available(); i++) {
		            System.out.println("" + errores.read());
		         }
						
			} else {
						
				linea = br.readLine();
				while (linea != null) {
					System.out.println(linea);
					linea = br.readLine();
				}
						
			}
				
			// No lo pide pero deja ponerlo, duda br.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
