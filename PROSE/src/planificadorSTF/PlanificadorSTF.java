package planificadorSTF;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;




// Algoritmo de planificacion Short Time First (STF).
//el mas corto se ejecuta primero.
public class PlanificadorSTF {
	
	private static LinkedList <Proceso> linkedProceso;
	private static PlanificadorSTF planificador;

	
	
	private PlanificadorSTF() {
		linkedProceso = new LinkedList<Proceso>();
	}
	
	// Para que sea unico crea un objeto de la clase (Singleton).
	public static PlanificadorSTF getSingletonInstance() {
		if (planificador != null) {
			planificador = new PlanificadorSTF();
			
		} else {
			System.out.println("El objeto ya existe por lo que se devuelve la misma referencia.");
		}
		return planificador;
	}
		
	public Proceso get() {
		
		long inicioMilis, finMilis, totalMilis;
		Proceso procesoActual = ss.remove();
		
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
		ss.add(pi);
	}
	
	public void sirve() {
		while(get() != null);
	}
	
	

}
