package EjemploSingleton;

public class PrincipalSingleton {

	public static void main(String[] args) {
		ImpresoraSingleton impresora = ImpresoraSingleton.getSingletonInstance(0, TipoTinta.ROJA);
		ImpresoraSingleton impresora2 = ImpresoraSingleton.getSingletonInstance(10, TipoTinta.AZUL);

		// Son dos objetos distintos pero apuntan solo a una misma referencia en memoria.
		System.out.println(impresora + "\n" + impresora2);
		
		impresora.imprimirFrase("Hola");
	}

}
