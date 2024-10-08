// Abstract Class Example
abstract class Shape 
{
	abstract void draw();
}
class Circle extends Shape 
{
    	void draw() 
	{
        	System.out.println("Drawing a Circle");
    	}
}
class Abstract
{
    	public static void main(String[] args) 
	{
        	Shape shape = new Circle();
        	shape.draw();
    	}
}
