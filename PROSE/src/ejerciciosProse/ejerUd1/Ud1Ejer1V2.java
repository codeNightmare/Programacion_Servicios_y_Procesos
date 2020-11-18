package ejerciciosProse.ejerUd1;

public class Ud1Ejer1V2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process p = null;
				
		try {
			// Ejecutar el proceso de firefox (Ubuntu).
			// Proceso y url: nos abre firefox en esa web.
			p = rt.exec("firefox iescristobaldemonroy.es");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Proceso: " + p);
		}

	}

}
