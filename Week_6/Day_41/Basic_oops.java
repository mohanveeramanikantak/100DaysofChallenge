class Car 
{
	String brand;
    	String model;
    	int year;
    	void displayCarInfo() 
	{
        	System.out.println("Brand: " + brand);
        	System.out.println("Model: " + model);
        	System.out.println("Year: " + year);
    	}
}
class Basic_oops
{
    	public static void main(String[] args) 
	{
        	Car myCar = new Car();
        	myCar.brand = "Tesla";
        	myCar.model = "Model S";
        	myCar.year = 2023;
		myCar.displayCarInfo();
    }
}
