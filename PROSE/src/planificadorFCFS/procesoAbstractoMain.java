package planificadorFCFS;

import java.util.ArrayList;
import java.util.Collections;

import planificadorSTF.Proceso;

public class procesoAbstractoMain {

	private static final int MAX_PROCESOS = 5;
	public static void main(String[] args) {
		preparaMicroprocesador();
		PlanificadorAbstractoFCFS.sirve();

	}
	/*
	 * 
	 */
	private static void preparaMicroprocesador () {
		ArrayList<Proceso> proceso = new ArrayList<Proceso>();
		
		for (int i = 0; i < MAX_PROCESOS; i++) {
			Proceso pi = new Proceso( "p" + i, ((int) Math.floor(Math.random()*4+1)) * 1000 );
			proceso.add(pi);
		}
		
		// Collections.shuffle: método usado para permutar aleatoriamente la lista 
		//especificada utilizando una fuente predeterminada de aleatoriedad.
		Collections.shuffle(proceso);
		
		for (Proceso p : proceso) {
			PlanificadorAbstractoFCFS.put(p);
		}
	}

}
