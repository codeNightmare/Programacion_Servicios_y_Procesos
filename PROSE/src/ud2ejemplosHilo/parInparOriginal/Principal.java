package ud2ejemplosHilo.parInparOriginal;


public class Principal {

	public static void main(String[] args) {
		
		Thread hilo1 = new Thread(new SumaPar());
		Thread hilo2 = new Thread(new SumaInpar());
	
		hilo1.start();
		hilo2.start();
		
		try {	
			// Para el hilo principal hasta que no terminen 
			//productor y consumidor, tras esto muestra lo de abajo.
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin hilo principal");
	}

}
