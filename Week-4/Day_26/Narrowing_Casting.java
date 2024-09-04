//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte
class Narrowing_Casting
{
  	public static void main(String[] args) 
	{
    		double myDouble = 9.78d;
    		int myInt = (int) myDouble; // Manual casting: double to int

    		System.out.println(myDouble);   
    		System.out.println(myInt);      
  	}
}