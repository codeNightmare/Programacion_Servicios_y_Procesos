package ud2ejemplosHilo.cajeraCliente;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		/*
		 * no significa que tengamos dos cajeras independientes, lo que estamos diciendo
		 * es que dentro del mismo hilo se ejecute primero los métodos de la cajera1 y
		 * después los métodos de la cajera2, por tanto a nivel de procesamiento es como
		 * si tuviésemos una sola cajera:
		 */
		
		/* Esto no es óptimo, tarda mucho en procesarlo...
		Cajera cajera1 = new Cajera("Cajera 1");
		Cajera cajera2 = new Cajera("Cajera 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
		*/
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2, initialTime);

		cajera1.start();
		cajera2.start();

	}

}
