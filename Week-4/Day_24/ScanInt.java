import java.util.Scanner;
class ScanInt 
{
    	public static void main(String args[]) 
	{
        	Scanner intt = new Scanner(System.in); 
        	System.out.println("Enter the Laptop Price: "); 
        	int a = intt.nextInt(); 
        	System.out.println("The Laptop Price is: " + a); 
        	intt.close(); 
    	}    
}
