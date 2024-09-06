import java.util.Scanner;
class esleif
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a platform code (L for LinkedIn, G for GitHub, W for W3Schools): ");
        	char platform = scanner.next().charAt(0); // Read the user input as a character	
        	if (platform == 'L' || platform == 'l') 
		{
            		System.out.println("You chose LinkedIn.");
        	} 
		else if (platform == 'G' || platform == 'g') 
		{
            		System.out.println("You chose GitHub.");
        	} 
		else if (platform == 'W' || platform == 'w') 
		{
            		System.out.println("You chose W3Schools.");
        	}
		else 
		{
            		System.out.println("Invalid input. Please enter L, G, or W.");
        	}
        	scanner.close();
    	}
}
