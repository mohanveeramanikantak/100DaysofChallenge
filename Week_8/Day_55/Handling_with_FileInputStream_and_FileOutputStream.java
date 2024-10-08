//File Handling with FileInputStream and FileOutputStream
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class Handling_with_FileInputStream_and_FileOutputStream 
{
    	public static void main(String[] args) 
	{
        try {
            // Writing binary data to a file
            FileOutputStream fout = new FileOutputStream("binaryfile.dat");
            fout.write(65);  // Writing ASCII value of 'A'
            fout.close();

            // Reading binary data from the file
            FileInputStream fin = new FileInputStream("binaryfile.dat");
            int i = fin.read();
            System.out.println("Data read from file: " + (char) i);  // Outputs 'A'
            fin.close();
        } 
	catch (IOException e) 
	{
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
