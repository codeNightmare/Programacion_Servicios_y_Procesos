package ud2ejemplosHilo.Ejemplo2Runnable;

public abstract class Coche {

	private int kilometro;
	
	public Coche(int km) {
		this.kilometro = km;
	}

	public int getKilometro() {
		return kilometro;
	}

	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}

	@Override
	public String toString() {
		return "Coche [kilometro=" + kilometro + "]";
	}
	
	
}
