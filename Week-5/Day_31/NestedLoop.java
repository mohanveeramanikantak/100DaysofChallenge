class NestedLoop 
{
    	public static void main(String[] args) 
	{
        	// Nested loop example
        	System.out.println("Nested loop example:");
        	for (int i = 1; i <= 3; i++) 
		{ // Outer loop
            		System.out.println("Outer loop iteration: " + i);
            		for (int j = 1; j <= 2; j++) 
			{ // Inner loop
                		System.out.println("   Inner loop iteration: " + j);
            		}
        	}

        	// For-each loop example
        	System.out.println("\nFor-each loop example:");
        	String[] fruits = {"Apple", "Banana", "Cherry"};
        	for (String fruit : fruits) 
		{ // For-each loop
            		System.out.println("Fruit: " + fruit);
        	}
    	}
}
