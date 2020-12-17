package ud2ejemplosHilo.PrincipioHilo;

public class MainHilo {

	public static void main(String[] args) {
		Hilo h = new Hilo();
		
		// (MAL) Lo ejecuta de normal y luego.
		//h.run();
		
		// (BIEN) Llamo al start e intercala la ejecución del for de Hilo y el de abajo.
		h.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") Fin  Hilo.");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
