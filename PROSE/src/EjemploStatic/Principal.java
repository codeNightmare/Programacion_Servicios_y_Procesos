package EjemploStatic;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Pedro");
		Persona p2 = new Persona("Juan");
		
		// Metodo static
		Persona.miMetodo("Holaa");
		p1.miMetodo("Adios");

	}

}
