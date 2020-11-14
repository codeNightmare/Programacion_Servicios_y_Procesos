package ejerciciosProse.ejerUd1;


public class Ud1Ejer1LanzarFireFox {

	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		try {
			// Ejecutar el proceso de firefox (Ubuntu).
			rt.exec("firefox");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
