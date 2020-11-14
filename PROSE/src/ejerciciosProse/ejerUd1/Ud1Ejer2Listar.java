package ejerciciosProse.ejerUd1;
import java.io.File;

/*
 * UD 1 - Ejer 2
 * Listar los fichero del directorio actual y mostrarlos.
 * 
 */
public class Ud1Ejer2Listar {

	private static final String DIRECTORIO_ACTUAL = "./";
	public static void main(String[] args) {

		File direc = new File(DIRECTORIO_ACTUAL);
		
		if (!direc.isDirectory()) {
			System.out.println("El fichero " + DIRECTORIO_ACTUAL + " no es un directorio.");
			
		} else {
			listarDirectorios(direc);
		}
	}
	
	private static void listarDirectorios(File direc) {
		
		String[] arrayFicheros;
		
		arrayFicheros = direc.list();
		
		for (int i = 0; i < arrayFicheros.length; i++) {
			System.out.println("Fichero " + (i+1) + ": " + arrayFicheros[i]);
		}
	}

}
