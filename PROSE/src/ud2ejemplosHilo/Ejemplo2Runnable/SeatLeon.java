package ud2ejemplosHilo.Ejemplo2Runnable;

public class SeatLeon extends Coche implements Runnable {

	public SeatLeon(int km) {
		super(km);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ") SeatLeon con km " + super.getKilometro());
		}
		
	}

}
