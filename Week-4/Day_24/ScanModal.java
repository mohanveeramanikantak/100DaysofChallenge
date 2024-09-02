import java.util.Scanner;
class ScanModal 
{
    	public static void main(String args[]) 
	{
        	Scanner name = new Scanner(System.in); 
        	System.out.println("Enter Your name: "); 
        	String n1 = name.nextLine(); 
        	System.out.println("Your name is: " + n1); 
        	name.close(); 
    	}
}
