package ejerciciosProse.ejerUd1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Ud1Ejer3CrearTxtDirActual {

	private static final String DIRECTORIO_ACTUAL = "./";
	private static final String FICHERO_NUEVO = "./listaFicheros.txt";
	
	public static void main(String[] args) {
		
		File fichero = new File(FICHERO_NUEVO);
		
		if (!fichero.isFile()) {
			System.out.println("El fichero " + DIRECTORIO_ACTUAL + " no es un directorio.");
			
		} else {
			listarDirectorios(fichero);
			System.out.println("Fin");
		}

	}
	
	private static void listarDirectorios(File fichero) {
		
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
			BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(fichero));
			
			String linea;
			while ((linea = br.readLine()) != null) {
				filtroEscritura.write(linea);
				filtroEscritura.newLine();
			}
			
			filtroEscritura.close();
			// No lo pide pero deja ponerlo, duda br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
