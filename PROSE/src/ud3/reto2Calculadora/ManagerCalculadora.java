package ud3.reto2Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class ManagerCalculadora {

	private String protocolo;
	private String urlEndPoint;
	private Integer apiKey;
	private boolean estaRegistrada;
	
	public ManagerCalculadora(String protocolo, String urlEndPoint, 
			Integer apiKey, boolean estaRegistrada) {
		this.protocolo = protocolo;
		this.urlEndPoint = urlEndPoint;
		this.apiKey = apiKey;
		this.estaRegistrada = estaRegistrada;
	}
	
	
	public String getProtocolo() {
		return protocolo;
	}


	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}


	public String getUrlEndPoint() {
		return urlEndPoint;
	}


	public void setUrlEndPoint(String urlEndPoint) {
		this.urlEndPoint = urlEndPoint;
	}


	public Integer getApiKey() {
		return apiKey;
	}


	public void setApiKey(Integer apiKey) {
		this.apiKey = apiKey;
	}


	public boolean isEstaRegistrada() {
		return estaRegistrada;
	}


	public void setEstaRegistrada(boolean estaRegistrada) {
		this.estaRegistrada = estaRegistrada;
	}

	
	@Override
	public String toString() {
		return "ManagerCalculadora [protocolo=" + protocolo + ", urlEndPoint=" + urlEndPoint + ", apiKey=" + apiKey
				+ ", estaRegistrada=" + estaRegistrada + "]";
	}


	public void sumar(int a, int b) throws IOException {
		Operacion operqacionActual = null;

		URL url = new URL(protocolo+urlEndPoint 
				+ "?API_KEY=" + apiKey
				+ "&TIPO_OPERACION=" + operqacionActual.SUMA
				+ "&SUMANDO_A=" + a
				+ "&SUMANDO_B=" + b);

		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		System.out.println("URL: " + urlCon.getURL());
		
		InputStream input = urlCon.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		String inputLine = null;
		
		inputLine = br.readLine();
		while (inputLine != null) {
			System.out.println("> SUMA: " + inputLine);
			inputLine = br.readLine();
		}
		br.close();
		
	}
	
	public void restar(int a, int b) throws IOException {
		Operacion operqacionActual = null;
		int operacion;
		URL url = new URL(protocolo+urlEndPoint 
				+ "?API_KEY=" + apiKey 
				+ "&TIPO_OPERACION=" + operqacionActual.RESTA
				+ "&MINUENDO=" + a
				+ "&SUSTRAENDO=" + b);
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		System.out.println("URL: " + urlCon.getURL());
		
		InputStream input = urlCon.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		String inputLine = null;
		
		inputLine = br.readLine();
		while (inputLine != null) {
			System.out.println("> RESTA: " + inputLine);
			inputLine = br.readLine();
		}
		br.close();
	}
	
	public void multiplicar(int a, int b) throws IOException {
		Operacion operqacionActual = null;
		int operacion;
		URL url = new URL(protocolo+urlEndPoint 
				+ "?API_KEY=" + apiKey
				+ "&TIPO_OPERACION=" + operqacionActual.MULTIPLICACION
				+ "&OPERADOR_1=" + a
				+ "&OPERADOR_2=" + b);
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
		System.out.println("URL: " + urlCon.getURL());
		
		InputStream input = urlCon.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		String inputLine = null;
		
		inputLine = br.readLine();
		while (inputLine != null) {
			System.out.println("> MULTIPLICACION: " + inputLine);
			inputLine = br.readLine();
		}
		br.close();
	}
}
