//Encapsulation with Private Fields and Getter/Setter Methods
class Employee 
{
    	private String name;
    	private int age;

    	public String getName() 
	{
        	return name;
    	}
	public void setName(String name) 
	{
        	this.name = name;
    	}
	public int getAge() 
	{
        	return age;
    	}
	public void setAge(int age) 
	{
        	this.age = age;
    	}
}
class Encapsulation 
{
    	public static void main(String[] args) 
	{
        	Employee emp = new Employee();
        	emp.setName("Charan Teja");
        	emp.setAge(20);
        	System.out.println("Name: " + emp.getName());
        	System.out.println("Age: " + emp.getAge());
    	}
}
