//Buffered File Handling
import java.io.*;
class Buffered_File_Handling
{
    	public static void main(String[] args) 
	{
        	try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) 
		{
            		bw.write("Hello from BufferedWriter");
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}
		try (BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) 
		{
            		String line;
            		while ((line = br.readLine()) != null) 
			{
                		System.out.println(line);
            		}
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}
    	}
}
