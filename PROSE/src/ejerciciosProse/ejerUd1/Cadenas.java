package ejerciciosProse.ejerUd1;

public class Cadenas {
	private static final String RUTA_FICHERO = "pruebas_ficheros";
	private static final String RUTA_IMAGENES = "pruebas_ficheros";
	
	public static String getCadenaFicheroLinux(String nombreFichero) {
		return RUTA_FICHERO + "/" + nombreFichero;
	}
	
	public static String getCadenaFicheroWindows(String nombreFichero) {
		return RUTA_FICHERO + "\\" + nombreFichero;
	}
}
