package ejerciciosProse.actividad1Hilo;

public class ProcesoTic extends Thread {

	@Override
	public void run() {
		
		// Bucle infinito
		while(true) {
			
			System.out.println("Tic");
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;	// Si algo sale mal, sale del bucle.
			}
		}
	}

	
}
