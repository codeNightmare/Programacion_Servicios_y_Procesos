package ud2ejemplosHilo.productorConsumidorForma2;

/*
 * Clase que almacena caracteres en un array y los muestra uno por uno.
 */
public class Producto {

	private char[] cola;
	private int posicionArray;
	private boolean estaVacia;
	private int cantidadEjecucion;
	
	public Producto(int vuelta) {
		this.cantidadEjecucion = vuelta;
		cola = new char[cantidadEjecucion];
		posicionArray = 0;
		estaVacia = true;
	}
	
	// Forma 1 para sincronizar el método.
	public void recogerLetra(char letra) {
		synchronized (this) {
			while(!estaVacia) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			cola[posicionArray] = letra;
			posicionArray++;
			System.out.println("Guardo la letra " + letra);
			
			if(posicionArray == cantidadEjecucion) {
				estaVacia = false;
				posicionArray--;
			}
			notify();
		}	
	}
	
	// Forma 2 para sincronizar el método.
	public synchronized char devolverLetra() {
		char letra = 0;
		
		while(estaVacia) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		letra = cola[posicionArray];
		posicionArray--;
		System.out.println("Devuelvo la letra " + letra);
		
		if(posicionArray == -1) {
			estaVacia = true;
			posicionArray++;
		}
		
		notify();
		return letra;
	}
}
