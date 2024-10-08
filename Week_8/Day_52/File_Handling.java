//File Handling (Read/Write File)
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class File_Handling
{
	public static void main(String[] args) 
	{
        	try 
		{
            		FileWriter writer = new FileWriter("output.txt");
            		writer.write("Hello, World!");
            		writer.close();

            		FileReader reader = new FileReader("output.txt");
            		int ch;
            		while ((ch = reader.read()) != -1) 
			{
                		System.out.print((char) ch);
            		}
            		reader.close();
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}
    	}
}
