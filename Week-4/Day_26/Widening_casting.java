//Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double
class Widening_casting
{
	public static void main(String[] args) 
	{
    		int myInt = 9;
    		double myDouble = myInt; // Automatic casting: int to double

    		System.out.println(myInt);      
    		System.out.println(myDouble);   
  	}
}