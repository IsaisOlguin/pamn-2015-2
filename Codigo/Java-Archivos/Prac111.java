import java.io.IOException;
public class Prac111{
	
	public static void main(String args[])throws IOException{

		Archivo demo = new Archivo();

		if(args.length > 0){
			demo.muestraInfoArchivo(args[0]);
		}
		else{
			System.out.println("Uso: java Prac111 <nomArchivo>");
		}

	}

}