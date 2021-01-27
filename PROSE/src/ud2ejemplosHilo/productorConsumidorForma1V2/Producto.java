package ud2ejemplosHilo.productorConsumidorForma1V2;

/*
 * Clase que almacena caracteres en un array y los muestra uno por uno.
 */
public class Producto {

	private static final int MAX_EJECUCION = 10;
	private char[] cola;
	private int posicionArray;
	private boolean esVaciada;
	
	public Producto() {
		cola = new char[MAX_EJECUCION];
		posicionArray = 0;
		esVaciada = true;
	}
	
	// Forma 1 para sincronizar el método.
	public void recogerLetra(char letra) {
		while(!esVaciada) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		cola[posicionArray] = letra;
		posicionArray++;
		System.out.println("Guardo la letra " + letra);
		
		esVaciada = false;

		notify();	
	}
	
	// Forma 2 para sincronizar el método.
	public char devolverLetra() {
		char letra = 0;
		
		while(esVaciada) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		letra = cola[posicionArray];
		posicionArray--;
		System.out.println("Devuelvo la letra " + letra);
		
		esVaciada = true;

		notify();
		return letra;
	}
}
