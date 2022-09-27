package ud1tr11_AD_Actividad2;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		//La ruta y la carpeta pueden variar
		File file = new File("miDirectorio" + File.separator + "miFichero.txt");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		
	}

}
