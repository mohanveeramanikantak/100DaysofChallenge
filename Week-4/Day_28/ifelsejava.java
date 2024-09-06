// if else in Java user input type
import java.util.Scanner;
class ifelsejava
{
    	public static void main(String[] args) 
	{
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the time (0-24): ");
        	int time = scanner.nextInt(); // Read the user input as an integer

                if (time < 18) 
		{
            		System.out.println("Good day.");
        	} 
		else 
		{
            		System.out.println("Good evening.");
        	}

	        scanner.close();
   	}
}
