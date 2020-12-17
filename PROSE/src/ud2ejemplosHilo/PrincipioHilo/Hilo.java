package ud2ejemplosHilo.PrincipioHilo;

public class Hilo extends Thread {

	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") Inicio Hilo");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
