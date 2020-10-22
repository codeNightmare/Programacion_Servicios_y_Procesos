package planificadorSTF;

import java.util.ArrayList;
import java.util.Collections;


public class procesoMain {

	private static final int MAX_PROCESOS = 5;
	public static void main(String[] args) {
		
		
		PlanificadorSTF planificador = PlanificadorSTF.getSingletonInstance();
		preparaMicroprocesador(planificador);
		planificador.sirve();
		
		

	}
	/*
	 * 
	 */
	private static void preparaMicroprocesador (PlanificadorSTF planificador) {
		ArrayList<Proceso> proceso = new ArrayList<Proceso>();
		
		for (int i = 0; i < MAX_PROCESOS; i++) {
			// la parte de duracion es asi por los milisegundos del metodo Thread.sleep(procesoActual.getDuracion());
			Proceso pi = new Proceso( "p" + i, ((int) Math.floor(Math.random()*4+1)) * 1000 );
			proceso.add(pi);
		}
		
		// Collections.shuffle: metodo usado para permutar aleatoriamente la lista 
		//especificada utilizando una fuente predeterminada de aleatoriedad.
		Collections.shuffle(proceso);
		
		for (Proceso p : proceso) {
			planificador.put(p);
		}
	}
	

}
