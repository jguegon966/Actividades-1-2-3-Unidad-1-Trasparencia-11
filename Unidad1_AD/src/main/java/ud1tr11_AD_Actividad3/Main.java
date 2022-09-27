package ud1tr11_AD_Actividad3;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		//Tendras que cambiar la ruta en tu pc ya que mi carpeta puede estar alojada en un sitio diferente
		File miCarpeta = new File("C:\\Users\\Chechu\\Desktop\\Ejemplos");
		
		File[] misElementos = miCarpeta.listFiles();
		
		if (misElementos == null || misElementos.length == 0)
		{
			
			System.out.println("No hay elementos en la carpeta actual");
			
		}
		else
		{
			
			for (int i=0; i< misElementos.length; i++)
			{
				System.out.println(misElementos[i]);
			}
			
		}
		
	}

}
