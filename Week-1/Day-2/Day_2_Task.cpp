//Basic Arithmetic Operations
//Implement a program that takes two integers as input and performs addition, subtraction, multiplication, and division
#include<iostream>
int main()
{
	int num1,num2;
	
	std::cout<<"Enter the First Number : ";
	std::cin>> num1;
	std::cout<<"Enter the Second Number : ";
	std::cin>> num2;
	
	std::cout<<" Addition : " << num1 + num2 << std::endl;
	std::cout<<" Subtraction : " << num1 - num2 << std::endl;
	std::cout<<" Multiplication : " << num1 * num2 << std::endl;
	
	return 0;	
}
