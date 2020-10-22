package EjemploStatic;

public class Persona {
	private String nombre;
	private static int cantPersona = 0;
	
	public Persona (String nombre) {
		this.nombre = nombre;
		this.cantPersona += 1;
	}
	
	// Accede SOLO a las variables ststicas, this y las otras fallan
	public static void miMetodo(String texto) {
//		System.out.println(nombre + ": " + texto + " persona número " + cantPersona);
	}

}
