//ArithmeticOperations in Java 
import java.util.Scanner;
public class ArithmeticOperations 
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

		System.out.println("");		
        	System.out.print("Enter the value for x: ");
        	int x = scanner.nextInt(); 	
		
		System.out.println("");
        	System.out.print("Enter the value for y: ");
        	int y = scanner.nextInt(); 	

        	// Perform arithmetic operations
        	int addition = x + y;
        	int subtraction = x - y;
        	int multiplication = x * y;
        	int division = y != 0 ? x / y : 0; // Handle division by zero
        	int modulus = y != 0 ? x % y : 0; // Handle modulus by zero

        	// Display the results
		System.out.println("");
		System.out.println("ArithmeticOperations in Java");
        	System.out.println("Addition: " + x + " + " + y + " = " + addition);
        	System.out.println("Subtraction: " + x + " - " + y + " = " + subtraction);
        	System.out.println("Multiplication: " + x + " * " + y + " = " + multiplication);
        	System.out.println("Division: " + x + " / " + y + " = " + (y != 0 ? division : "undefined (division by zero)"));
        	System.out.println("Modulus: " + x + " % " + y + " = " + (y != 0 ? modulus : "undefined (division by zero)"));
        
        	// Close the scanner
        	scanner.close();
    	}
}
