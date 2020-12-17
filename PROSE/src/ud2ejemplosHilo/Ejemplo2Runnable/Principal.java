package ud2ejemplosHilo.Ejemplo2Runnable;

public class Principal {

	public static void main(String[] args) {
		
		// Hilo principal (esta clase) lanzado
		FordFiesta ff = new FordFiesta(3);
		SeatLeon sl = new SeatLeon(5);
		System.out.println("-------------");
		
		Thread hilo1 = new Thread(ff); 
		hilo1.start();
		System.out.println("Iniciado hilo1");
		
		Thread hilo2 = new Thread(sl);
		hilo2.start();
		System.out.println("Iniciado hilo2");
		
		// Se ejecuta uno por uno, hay un momneto que se entrelazan 
		//los procesos y se resuelve esa ejecución de forma aleatoria.

	}

}
