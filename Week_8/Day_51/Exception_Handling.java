//Exception Handling with Try-Catch
class Exception_Handling
{
    	public static void main(String[] args) 
	{
        	try 
		{
            		int data = 100 / 0;
        	} 
		catch (ArithmeticException e) 
		{
            		System.out.println("Error: " + e.getMessage());
        	} 
		finally 
		{
            		System.out.println("Finally block executed.");
        	}
    	}
}
