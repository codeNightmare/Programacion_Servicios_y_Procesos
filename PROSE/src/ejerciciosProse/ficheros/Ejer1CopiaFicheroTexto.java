package ejerciciosProse.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer1CopiaFicheroTexto {

	private static final String FICHERO_ORIGINAL = "src/EjerFicheros/original.txt";
	private static final String FICHERO_FINAL = "src/EjerFicheros/final.txt";
	
	public static void main(String[] args) {
		File ficheroFinal = new File(FICHERO_FINAL);
		
		if (ficheroFinal.exists()) {
			System.out.println("El fichero ya existe.");
		} else {
			copiarFicheroEnOtro();
			System.out.println("Fin");
		}
	}
	
	
	private static void copiarFicheroEnOtro () {
		
		try (
				BufferedReader filtroLectura = new BufferedReader(new FileReader(FICHERO_ORIGINAL));
				BufferedWriter filtroEscritura = new BufferedWriter(new FileWriter(FICHERO_FINAL))
				){
			
			String linea;
			
			linea = filtroLectura.readLine();
			while (linea != null) {
				filtroEscritura.write(linea + "\n");
				linea = filtroLectura.readLine();
			}
			
			
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		} 
	}

}
