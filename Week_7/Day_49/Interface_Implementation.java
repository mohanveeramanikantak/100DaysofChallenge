//Interface Implementation
interface Animal 
{
	void sound();
}

class Dog implements Animal 
{
	public void sound() 
	{
        	System.out.println("Bark");
    	}
}
class Interface_Implementation
{
	public static void main(String[] args) 
	{
        	Animal dog = new Dog();
        	dog.sound();
    	}
}
