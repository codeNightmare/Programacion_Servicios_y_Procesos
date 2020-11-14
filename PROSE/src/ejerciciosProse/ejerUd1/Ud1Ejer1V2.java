package ejerciciosProse.ejerUd1;

public class Ud1Ejer1V2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process p = null;
				
		try {
			// Ejecutar el proceso de firefox (Ubuntu).
			p = rt.exec("firefox");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Proceso: " + p);
		}

	}

}
