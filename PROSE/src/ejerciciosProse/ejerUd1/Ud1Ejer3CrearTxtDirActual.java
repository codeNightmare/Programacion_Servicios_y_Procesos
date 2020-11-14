package ejerciciosProse.ejerUd1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


/*
 * Crea una clase Java cuyo método main liste los ficheros del directorio actual
 * y los guarde en un fichero de texto.
 */

public class Ud1Ejer3CrearTxtDirActual {

	private static final String DIRECTORIO_ACTUAL = "./";
	private static final String FICHERO_NUEVO = "./listaFicheros.txt";
	
	public static void main(String[] args) {
		
		File direc = new File(DIRECTORIO_ACTUAL);
		
		if (!direc.isDirectory()) {
			System.out.println("El fichero " + DIRECTORIO_ACTUAL + " no es un directorio.");
			
		} else {
			listarDirectorios(direc);
			System.out.println("Fin");
		}

	}
	
	private static void listarDirectorios(File direc) {
		
		String[] arrayFicheros;
		
		arrayFicheros = direc.list();
		
		try (
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(FICHERO_NUEVO))
				) {
			
			for (int i = 0; i < arrayFicheros.length; i++) {
				
				filtroEscritura.write("Fechero " + (i+1) + ": " + arrayFicheros[i]);
				filtroEscritura.newLine();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
