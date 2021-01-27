package ud2ejemplosHilo.productorConsumidorForma1V2;

/*
 * Esta aplicación es como la original cambiando en que ahora
 * se consume tras haber producido una vez.
 */
public class Principal {

	private static final int CANTIDAD_MAX_EJECUCION = 5;
	public static void main(String[] args) {
		
		Producto producto = new Producto();
		Productor productor = new Productor(producto, CANTIDAD_MAX_EJECUCION);
		Consumidor consumidor = new Consumidor(producto, CANTIDAD_MAX_EJECUCION);
		
		productor.start();
		consumidor.start();
		
		try {	
			// Para el hilo principal hasta que no terminen 
			//productor y consumidor, tras esto muestra lo de abajo.
			productor.join();
			consumidor.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fin hilo principal");
	}

}
