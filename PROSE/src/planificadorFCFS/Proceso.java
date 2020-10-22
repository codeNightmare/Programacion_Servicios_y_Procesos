package planificadorFCFS;


public class Proceso {
	private String nombre;
	private long duracion;
	
	
	public Proceso(String nombre, long duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getDuracion() {
		return duracion;
	}


	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}
	
	
	
	

}
