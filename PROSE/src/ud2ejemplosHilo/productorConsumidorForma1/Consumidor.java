package ud2ejemplosHilo.productorConsumidorForma1;

/*
 * Hilo que recibe 10 veces una letra para mostrarla.
 */
public class Consumidor extends Thread {

	private Producto producto;
	private int cantidadEjecucion;
	
	public Consumidor(Producto p, int vueltas) {
		this.producto = p;
		this.cantidadEjecucion = vueltas;
	}

	@Override
	public void run() {
		synchronized (producto) {
			char letra;
			
			for (int i = 0; i < cantidadEjecucion; i++) {
				letra = producto.devolverLetra();
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println((i+1) + ") Consumo la letra " + letra);
			}
		}
	}
	
	
}
