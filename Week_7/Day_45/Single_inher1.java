// To Print Single Inheritence //
class First
{
	void Fprint()
	{
		System.out.println("First class Method");
	}

}
class Second extends First
{
	void Sprint()
	{
		System.out.println("Second class Method");
	}
}
class Single_inher1
{
	public static void main(String args[])
	{
		Second fc=new Second();
		fc.Fprint();
		fc.Sprint();
	}
}