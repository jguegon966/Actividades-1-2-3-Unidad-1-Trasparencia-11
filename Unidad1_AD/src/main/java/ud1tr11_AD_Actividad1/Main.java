package ud1tr11_AD_Actividad1;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		
		File carpeta = new File("C:\\Windows");
		String [] listado = carpeta.list();
		
		if(listado == null || listado.length == 0)
		{
			
			System.out.println("No hay elementos en la carpeta");
			
		}
		else
		{
			for (int i=0; i< listado.length; i++)
			{
				System.out.println(listado[i]);
			}
		}
		
	}

}
