import java.net.*;
import java.io.*;

public class Cliente{
	
	
	public static void main(String args[])throws UnknownHostException, IOException{

		Socket socket = new Socket("www.unam.mx", 80);
		System.out.println("Conectado!!! :)");

		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
		String cadena;

		pw.println("get");
		while((cadena = br.readLine())!=null)
			System.out.println(cadena);

	}
}