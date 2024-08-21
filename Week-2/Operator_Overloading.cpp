//Operator Overloading
//Create a program that overloads the + operator to add two complex numbers.
#include <iostream>
class Complex 
{
private:
    double real;
    double imaginary;

public:
    // Constructor to initialize complex numbers
    Complex(double r = 0.0, double i = 0.0) : real(r), imaginary(i) {}

    // Overload the + operator to add two complex numbers
    Complex operator + (const Complex& obj) const {
        Complex result;
        result.real = real + obj.real;
        result.imaginary = imaginary + obj.imaginary;
        return result;
    }

    // Function to display the complex number
    void display() const {
        std::cout << real << " + " << imaginary << "i" << std::endl;
    }
};
int main() 
{
    Complex num1(3.4, 5.6);
    Complex num2(2.3, 4.5);

    Complex sum = num1 + num2; // Using the overloaded + operator

    std::cout << "The sum of the complex numbers is: ";
    sum.display();

    return 0;
}

