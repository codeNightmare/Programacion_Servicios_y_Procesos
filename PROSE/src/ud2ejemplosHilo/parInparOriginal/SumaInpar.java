package ud2ejemplosHilo.parInparOriginal;

public class SumaInpar extends Thread {
	
	
	public SumaInpar() {
		
	}
	
	@Override
	public void run() {
		
		int sumanum = 0;
		for (int i = 0; i < 10; i++) {
			if (i%2!=0) {
				sumanum += i;
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Inpar > Numero: " + i + " > suma: " + sumanum);
			}
		}
	}
}
