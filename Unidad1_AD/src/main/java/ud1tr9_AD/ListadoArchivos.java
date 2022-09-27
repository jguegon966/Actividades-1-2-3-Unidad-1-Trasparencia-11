package ud1tr9_AD;

import java.io.File;
import java.io.FileFilter;

public class ListadoArchivos implements FileFilter 
{
	
	public boolean accept(File path)
	{
		int lastDot = path.getName().lastIndexOf(".");
		
		return ! path.getName().substring(lastDot + 1).equals("txt");
		
	}
	
}
