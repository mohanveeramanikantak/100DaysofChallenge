//Functions
//Write a program with a function to calculate the factorial of a number.
#include <iostream>
// Function to calculate the factorial of a number
int factorial(int n) 
{
    if (n == 0 || n == 1)
	{
        return 1; // Base case: factorial of 0 or 1 is 1
    } 
	else 
	{
        return n * factorial(n - 1); // Recursive case
    }
}
int main() 
{
    int number;

    std::cout << "Enter a number to calculate its factorial: ";
    std::cin >> number;

    int result = factorial(number);

    std::cout << "The factorial of " << number << " is: " << result << std::endl;

    return 0;
}

