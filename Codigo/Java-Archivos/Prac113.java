import java.io.*;

public class Prac113{
	
	
	public static void main(String args[]){

		FileInputStream	archivo;
		InputStreamReader lector; 
		BufferedReader entrada;

		try{
			archivo = new FileInputStream(args[0]);
			lector = new InputStreamReader(archivo);
			entrada = new BufferedReader(lector);

			System.out.println("Leyendo algo: ");

			String cadena;
			while((cadena = entrada.readLine())!= null){
				System.out.println(cadena);
			}
			entrada.close();
		}catch(IOException e){
			System.out.println("No se pudo conectar al flujo");
		}


	}

}