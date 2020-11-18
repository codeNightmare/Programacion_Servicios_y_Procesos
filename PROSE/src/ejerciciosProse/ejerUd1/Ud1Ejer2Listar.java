package ejerciciosProse.ejerUd1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * UD 1 - Ejer 2
 * Listar los fichero del directorio actual y mostrarlos.
 * 
 */
public class Ud1Ejer2Listar {

	
	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls";
		String comandoWindows = "CMD /C DIR";
		
		String comando = comandoLinux;
		Process p = null;
		try {
			p = rt.exec(comando);
			
			// No se cierra porque no crea un flujo, solo referencia la entrada.
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			// No lo pide pero deja ponerlo, duda br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
