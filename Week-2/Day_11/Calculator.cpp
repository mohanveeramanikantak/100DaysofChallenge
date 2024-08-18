#include <iostream>
class Calculator 
{
public:
    double add(double num1, double num2) 
	{
        return num1 + num2;
    }

    double subtract(double num1, double num2)
	{
        return num1 - num2;
    }

    double multiply(double num1, double num2) 
	{
        return num1 * num2;
    }

    double divide(double num1, double num2) 
	{
        if (num2 == 0) 
		{
            std::cout << "Error: Division by zero is not allowed." << std::endl;
            return 0;
        }
        return num1 / num2;
    }
};

int main() 
{
    Calculator calc; 
    double a, b;

    std::cout << "Enter two numbers: ";
    std::cin >> a >> b;

    std::cout << "Addition: " << calc.add(a, b) << std::endl;
    std::cout << "Subtraction: " << calc.subtract(a, b) << std::endl;
    std::cout << "Multiplication: " << calc.multiply(a, b) << std::endl;
    std::cout << "Division: " << calc.divide(a, b) << std::endl;

    return 0;
}

