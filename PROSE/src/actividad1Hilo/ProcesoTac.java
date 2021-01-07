package actividad1Hilo;

public class ProcesoTac extends Thread {

	@Override
	public void run() {
		
		// Bucle infinito
		while(true) {
			
			System.out.println("Tac");
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;	// Si algo sale mal, sale del bucle.
			}
		}
	}
}
