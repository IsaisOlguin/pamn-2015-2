import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Archivo{
	
	void muestraInfoArchivo(String ruta) throws IOException{

		File archivo = new File(ruta);

		if(archivo.exists()){
			System.out.println("Nombre: " + archivo.getName());
			System.out.println("Ruta completa: " + archivo.getAbsolutePath());
			System.out.println("Tamanno: " + archivo.length() + " bytes");
			if(archivo.isDirectory()) System.out.println("Es un directorio");
			else System.out.println("No es un directorio");
		}
		else{
			throw new IOException("El archivo " + ruta + " no existe");
		}

	}


}