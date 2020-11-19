package ejerciciosProse.ejerUd1;

import java.io.IOException;


/*
 * Crea una clase Java cuyo método main lance un comando que provoque
 * errores y pinta por pantalla el valor devuelto por el error.
 */
public class Ud1Ejer4 {

	public static void main(String[] args) {
		
		// Comandos mal a proposito
		String comandoLinux = "ls -help";	// ls --help
		String comandoWindows = "cmd /c help -dir";	// help dir
				
		String comando = comandoLinux;
		Process p = null;
		
		
		try {
			p = Runtime.getRuntime().exec(comando);
					
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		int status;
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " ha ewsultado " + status);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	

}
