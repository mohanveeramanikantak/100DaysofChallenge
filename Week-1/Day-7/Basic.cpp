//Basic I/O
//Create a program that reads a string from the user and prints it in reverse.
#include <iostream>
#include <string>
#include <algorithm>
int main()
{
    std::string input;
    
    // Prompt the user to enter a string
    std::cout << "Enter a string: ";
    std::getline(std::cin, input);
    
    // Reverse the string using the reverse function from the algorithm library
    std::reverse(input.begin(), input.end());
    
    // Output the reversed string
    std::cout << "Reversed string: " << input << std::endl;
    
    return 0;
}

