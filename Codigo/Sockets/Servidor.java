import java.net.*;
import java.io.*;

public class Servidor{
	
	public static void main(String args[]) throws IOException{

		ServerSocket servidor = new ServerSocket(9000);
		System.out.println("¡¡¡¡ ...Servidor listo... !!!!");
	while(true){	
		Socket cliente = servidor.accept();

		PrintWriter pw = new PrintWriter(cliente.getOutputStream(), true);

		InputStreamReader isr = new InputStreamReader(cliente.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		System.out.println("...Cliente conectado...");
		pw.println("Bienvenido al servidor chacalito... :) ");
		pw.println("Escribe una cadena: ");

		String cadena = br.readLine();
		pw.println("Usted escribio:" + cadena);
		System.out.println("El usuario escribio:" +  cadena);
	}	
	}



}