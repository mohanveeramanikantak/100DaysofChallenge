// Exception Handling in C++
#include <iostream>
#include <stdexcept> // Required for std::runtime_error

int main() 
{
    int numerator, denominator;
    
    // Taking user input for numerator and denominator
    std::cout << "Enter the numerator: ";
    std::cin >> numerator;
    
    std::cout << "Enter the denominator: ";
    std::cin >> denominator;

    try 
	{
        // Check for division by zero
        if (denominator == 0) 
		{
            throw std::runtime_error("Division by zero is not allowed.");
        }
        
        // Perform the division and display the result
        double result = static_cast<double>(numerator) / denominator;
        std::cout << "The result is: " << result << std::endl;
    } 
	catch (const std::runtime_error& e) 
	{
        // Handle the exception by displaying the error message
        std::cerr << "Error: " << e.what() << std::endl;
    }

    return 0;
}

