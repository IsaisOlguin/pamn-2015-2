import java.io.*;

public class Prac112{
	
	
	public static void main(String args[]){

		InputStreamReader lector; 
		BufferedReader entrada;
		try{
			lector = new InputStreamReader(System.in);
			entrada = new BufferedReader(lector);

			System.out.println("Escribe algo: ");
			String cadena = entrada.readLine();
			System.out.println("Usted ha escrito: " + cadena);
		}catch(IOException e){
			System.out.println("No se pudo conectar al flujo");
		}
	}

}