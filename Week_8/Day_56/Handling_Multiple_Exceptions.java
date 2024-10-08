//Handling Multiple Exceptions
class Handling_Multiple_Exceptions
{
	public static void main(String[] args) 
	{
        	try 
		{
            		int[] numbers = {1, 2, 3};
            		System.out.println(numbers[5]); 	
            
            		int result = 10 / 0;  
            		System.out.println(result);
        	} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            		System.out.println("Error: Array index out of bounds - " + e.getMessage());
        	} 
		catch (ArithmeticException e) 
		{
            		System.out.println("Error: Division by zero - " + e.getMessage());
        	} 
		finally 
		{
           		System.out.println("Execution of the try-catch block is completed.");
        	}
    	}
}
