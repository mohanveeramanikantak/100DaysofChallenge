import java.util.Scanner;
class Methods 
{
	void Institute_name()
	{
		String Institute_name;
		Scanner ui=new Scanner(System.in);
		System.out.print("Enter Your Favorite Color : ");
		String institute_name=ui.next();
		System.out.println(" Your Favorite is : "+ institute_name);
	}
	public static void main(String args[])
	{
		Methods ed=new Methods();
		ed.Institute_name();
	}
}