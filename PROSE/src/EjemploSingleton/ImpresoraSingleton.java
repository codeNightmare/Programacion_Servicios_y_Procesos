package EjemploSingleton;

public class ImpresoraSingleton {

	private int cantidadPapel;
	private TipoTinta tinta;
	private static ImpresoraSingleton impresora;
	
	
	// Esto evita que se cree un constructor por defecto.
	private ImpresoraSingleton (int cantidadPapel, TipoTinta tinta) {
		this.cantidadPapel = cantidadPapel;
		this.tinta = tinta;
	}
	
	// Para que sea unico crea un objeto de la clase.
	public static ImpresoraSingleton getSingletonInstance(int cantidadPapel, TipoTinta tinta) {
        if (impresora == null){
        	impresora = new ImpresoraSingleton(cantidadPapel, tinta);
        	
        } else{
            System.out.println("El objeto ya existe por lo que se devuelve la misma referencia.");
        }
        
        return impresora;
    }
	
	public int getCantidadPapel() {
		return cantidadPapel;
	}
	public void setCantidadPapel(int cantidadPapel) {
		this.cantidadPapel = cantidadPapel;
	}
	public TipoTinta getTinta() {
		return tinta;
	}
	public void setTinta(TipoTinta tinta) {
		this.tinta = tinta;
	}
	
	// Un metodo static accede SOLO a AT static.
	public static void imprimirFrase (String texto) {
		if (impresora == null) {
			System.out.println("El objeto impresora no está creado, no se puede imprimir.");
		} else {
			System.out.println("Imprimiendo...");
			System.out.println(texto);
		}
	}
	
	
}
