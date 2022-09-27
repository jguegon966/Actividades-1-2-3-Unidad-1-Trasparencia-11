package ud1tr9_AD;

import java.io.File;

public class Main 
{
	public static void main(String[] args) 
	{
	
		File miCarpeta = new File("C:\\Users\\2DAM\\Desktop\\Ejemplos");
		
		File[] misElementos = miCarpeta.listFiles(new ListadoArchivos());
		
		
		
	}

}
