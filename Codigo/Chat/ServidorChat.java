import java.net.*;
import java.io.*;

public class ServidorChat{
	
	private static ClienteHilo[] hilos = new ClienteHilo[10];
	private int MaxClientes;
	private static Socket cliente;
	private static ServerSocket servidor;

	public static void main(String args[])throws IOException{
		servidor = new ServerSocket(6666);
		int i = 0;
		while(i<10){
			cliente = servidor.accept();
			hilos[i] = new ClienteHilo(cliente,hilos);
			hilos[i].start();
			i++;
		}
	}

	
}