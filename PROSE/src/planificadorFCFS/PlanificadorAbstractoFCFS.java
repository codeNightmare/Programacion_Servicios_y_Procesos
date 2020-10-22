package planificadorFCFS;
import java.util.LinkedList;
import java.util.Queue;

import planificadorSTF.Proceso;




// Algoritmo de planificacion First Come First Served (FCFS).
//el primer proceso que entra es el que se ejecuta y continua tras terminar con este.

// Al ser abstracta no instancia (es una formalidad logica por el static).
public abstract class PlanificadorAbstractoFCFS {
	
	private static Queue<Proceso> cola;

	static {
		cola = new LinkedList<Proceso>();
	}
	
	// private ya que sirve lo llama y asi no se usa como tal.
	private static Proceso get() {
		
		long inicioMilis, finMilis, totalMilis;
		Proceso procesoActual = cola.poll();
		
		if (procesoActual != null) {
			try {
				System.out.println("********************** INICIO PROCESO " + 
						procesoActual.getNombre() + " **********************");
			
				inicioMilis = System.currentTimeMillis();
				System.out.println("Hora inicio: " + inicioMilis);
			
				Thread.sleep(procesoActual.getDuracion());
			
				finMilis = System.currentTimeMillis();
				System.out.println("Hora fin: " + finMilis);
			
				totalMilis = finMilis - inicioMilis;
				System.out.println("--> Duracion del hilo (" + procesoActual.getDuracion() + ") " + 
						procesoActual.getNombre() + " || " + totalMilis);
			
				System.out.println("********************** FIN PROCESO " + procesoActual.getNombre() 
				+ " *************************");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("++++++++++++++++++++++++++ Planificador sin procesos.");
		}
		return procesoActual;
	}
	
	public static void put(Proceso pi) {
		cola.add(pi);
	}
	
	public static void sirve() {
		while(get() != null);
	}
	
	

}
