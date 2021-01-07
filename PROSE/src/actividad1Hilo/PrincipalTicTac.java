package actividad1Hilo;


public class PrincipalTicTac {

	public static void main(String[] args) {
		ProcesoTic tic1 = new ProcesoTic();
		ProcesoTac tac1 = new ProcesoTac();
		
		// Es un Demonio: Proceso que escucha
		tic1.setDaemon(true);
		tac1.setDaemon(true);

		// CONCURRENTE: se solapan
		tic1.start();
		System.out.println("Lanzamos Tic");
		tac1.start();
		System.out.println("Lanzamos Tac");
		
		// Duerme esta clase Main.
		try {
			Thread.sleep(5000);	// 5 seg
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
