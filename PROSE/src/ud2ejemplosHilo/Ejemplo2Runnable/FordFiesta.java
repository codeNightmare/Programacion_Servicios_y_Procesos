package ud2ejemplosHilo.Ejemplo2Runnable;

public class FordFiesta extends Coche implements Runnable {

	public FordFiesta(int km) {
		super(km);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") FordFiesta con km " + super.getKilometro());
		}
		
	}

}
