package planificadorFCFS;
import java.util.LinkedList;
import java.util.Queue;



// Algoritmo de planificacion First Come First Served (FCFS).
//el primer proceso que entra es el que se ejecuta y continua tras terminar con este.
public class PlanificadorFCFS {
	
	private static Queue<Proceso> cola;
	private static PlanificadorFCFS planificador;

	
	
	private PlanificadorFCFS() {
		cola = new LinkedList<Proceso>();
	}
	
	// Para que sea unico crea un objeto de la clase (Singleton).
	public static PlanificadorFCFS getSingletonInstance() {
		if (planificador == null) {
			planificador = new PlanificadorFCFS();
			
		} else {
			System.out.println("El objeto ya existe por lo que se devuelve la misma referencia.");
		}
		return planificador;
	}
	
	// private ya que sirve lo llama y asi no se usa como tal.
	private Proceso get() {
		
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
	
	public void put(Proceso pi) {
		cola.add(pi);
	}
	
	public void sirve() {
		while(get() != null);
	}
	
	

}
