package ud3.reto2Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Principal {

	public static void main(String[] args) {
		String host, phpAPI,urlEndPoint1, urlEndPoint2;
		int apiKey = 0;
		ManagerCalculadora manager;
		
		host = "https://psp2021site.000webhostapp.com/";
		urlEndPoint1 = "registrarAplicacion.php";
		urlEndPoint2 = "realizaOperacion.php"; 
		
		
		try {
			// Conexión para conseguir la API Key
			URL url = new URL(host+urlEndPoint1);
			URLConnection urlCon = url.openConnection();
			urlCon.connect();
			System.out.println("Conexión realizada.");
			
			InputStream input = urlCon.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			String inputLine = null;
			
			inputLine = br.readLine();
			while (inputLine != null) {
				apiKey = Integer.parseInt(inputLine);
				inputLine = br.readLine();
			}
			br.close();
			System.out.println("API Key. " + apiKey);
			
			// E.j.:
			//https://psp2021site.000webhostapp.com/realizaOperacion.php?API_KEY=101&TIPO_OPERACION=MULTIPLICACION&OPERADOR_1=5&OPERADOR_2=8
			manager = new ManagerCalculadora(host, urlEndPoint2, apiKey, true);
			manager.sumar(3, 2);
			manager.restar(3, 2);
			manager.multiplicar(3, 2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
