import java.net.*;
import java.io.*;

public class ClienteHilo extends Thread{
	
	private Socket cliente = null;
	private final ClienteHilo[] hilos;
	private PrintWriter salida;
	private BufferedReader entrada;
	private InputStreamReader isr;

	public ClienteHilo(Socket clienteSocket, ClienteHilo[] hilos){
		this.cliente = clienteSocket;
		this.hilos = hilos;
	}

	public void run(){
		System.out.println("Atendiendo hilo");
		try{
			isr = new InputStreamReader(cliente.getInputStream());
			entrada = new BufferedReader(isr);
			salida = new PrintWriter(cliente.getOutputStream(),true);
			String apodo;

			salida.println("Bienvenido al chat-ito");
			salida.println("Tu nombre:");
			apodo = entrada.readLine();
			for(int i = 0;i< 10;i++){
				if(hilos[i]!=null && hilos[i]!=this)
					hilos[i].salida.println("Entro: " + apodo);
			}

			String mensaje;
			while(true){
				mensaje = entrada.readLine();
				if(mensaje.compareTo("salir")==0) break;
				for(int i = 0;i< 10;i++){
				if(hilos[i]!=null && hilos[i]!=this)
					hilos[i].salida.println(apodo + " dice:" + mensaje);
				}
			}

			salida.println("Adios " + apodo);
			entrada.close();
			salida.close();
		}
		catch(IOException e){

		}
	}


}