package ud2ejemplosHilo.parInparOriginal;

public class SumaPar extends Thread {

	
	public SumaPar() {
	
	}

	@Override
	public void run() {
		
		int sumanum = 0;
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				sumanum += i;
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Par > Numero: " + i + " > suma: " + sumanum);
			}
		}
	}
	
	
}
