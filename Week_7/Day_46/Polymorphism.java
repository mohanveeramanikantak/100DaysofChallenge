class Animal 
{
  	public void animalSound() 
	{
    		System.out.println("The animal makes a sound");
  	}
}

class Pig extends Animal 
{
  	public void animalSound() 
	{
    		System.out.println("The pig says: wee wee");
  	}
}

class Dog extends Animal 
{
  	public void animalSound() 
	{
    		System.out.println("The dog says: bow wow");
  	}
}

class Polymorphism
{
  	public static void main(String[] args) 
	{
    		Animal myAnimal = new Animal();  // Animal object
    		Animal myPig = new Pig();        // Pig object (inherits from Animal)
    		Animal myDog = new Dog();        // Dog object (inherits from Animal)
        
    		myAnimal.animalSound();          // Calls method from Animal class
    		myPig.animalSound();             // Calls overridden method from Pig class
    		myDog.animalSound();             // Calls overridden method from Dog class
  	}
}
