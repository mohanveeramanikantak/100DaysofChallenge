//Access Specifiers Example
class Example 
{
    	public int publicVar = 10;
    	private int privateVar = 20;
    	protected int protectedVar = 30;

    	public void display() 
	{
        	System.out.println("Public: " + publicVar);
        	System.out.println("Private: " + privateVar);
        	System.out.println("Protected: " + protectedVar);
    	}
}
class Access_Specifiers
{
    	public static void main(String[] args) 
	{
        	Example ex = new Example();
        	ex.display();
    	}	
}
