class ReturnExample 
{
	public static int addNumbers(int num1, int num2) 
	{
        	int sum = num1 + num2;
        	return sum; 		// Returning the result
    	}
    	public static int findMax(int a, int b) 
	{
        	if (a > b) 
		{
            		return a; // Return a if it's larger
        	} 
		else 
		{
            		return b; // Otherwise, return b
        	}
    	}

    	public static void main(String[] args) 
	{
        	int result = addNumbers(5, 10);
        	System.out.println("The sum is: " + result);

        	// Call the findMax method
        	int max = findMax(15, 20);
        	System.out.println("The larger number is: " + max);
    	}
}
