package ejerciciosProse.ejerUd1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Crea una clase Java cuyo método main lance un comando que provoque
 * errores y genere un fichero con la descripción del error.
 */
public class Ud1Ejer6 {

	private static final String FICHERO_NUEVO = "./erroes.txt";
	public static void main(String[] args) {
		// Comandos mal a proposito
		String comandoLinux = "ls -help";	// ls --help
		String comandoWindows = "cmd /c ddir";	// help dir
								
		String comando = comandoWindows;
		Process p = null;
				
		try {
			p = Runtime.getRuntime().exec(comando);
							
		} catch (IOException e) {
			e.printStackTrace();
		} 
				
		int status;
		BufferedReader br = null;
		BufferedWriter bw = null;
				
		try {
			// NOTA status = 0: todo bien.
			status = p.waitFor();
			System.out.println("El comando " + comando + " ha resultado " + status);
			System.out.println("La salida ha sido: ");
					
			InputStream errStream = p.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errStream));
			
			bw = new BufferedWriter(new FileWriter(FICHERO_NUEVO));
			
			String linea = "";
			linea = br.readLine();
			while(linea != null) {
				bw.write(linea);
				bw.newLine();
				linea = br.readLine();
			}
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
			

}
