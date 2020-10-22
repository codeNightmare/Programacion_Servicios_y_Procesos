package planificadorFCFS;

import java.util.ArrayList;
import java.util.Collections;

public class procesoMain {

	private static final int MAX_PROCESOS = 5;
	public static void main(String[] args) {
		
		PlanificadorFCFS planificador = PlanificadorFCFS.getSingletonInstance();
		preparaMicroprocesador(planificador);
		planificador.sirve();
		
		

	}
	/*
	 * 
	 */
	private static void preparaMicroprocesador (PlanificadorFCFS planificador) {
		ArrayList<Proceso> proceso = new ArrayList<Proceso>();
		
		for (int i = 1; i <= MAX_PROCESOS; i++) {
			Proceso pi = new Proceso( "p" + i, ((int) Math.floor(Math.random()*4+1)) * 1000 );
			proceso.add(pi);
		}
		
		// Collections.shuffle: método usado para permutar aleatoriamente la lista 
		//especificada utilizando una fuente predeterminada de aleatoriedad.
		Collections.shuffle(proceso);
		
		for (Proceso p : proceso) {
			planificador.put(p);
		}
	}
	

}
