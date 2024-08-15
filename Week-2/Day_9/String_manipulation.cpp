#include <iostream>
#include <string>
// Function to count the number of vowels in a string
int countVowels(const std::string& str) 
{
    int vowelCount = 0;
    
    // Iterate over each character in the string
    for (char ch : str) 
	{
        ch = std::tolower(ch); // Convert character to lowercase for uniformity
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
		{
            vowelCount++;
        }
    }
    return vowelCount; // Return the total count of vowels
}
int main() 
{
    std::string inputString;
    std::cout << "Enter a string: ";
    std::getline(std::cin, inputString); // Read input string from user

    int numberOfVowels = countVowels(inputString); // Count the vowels in the string

    std::cout << "The number of vowels in the string is: " << numberOfVowels << std::endl; // Output the result

    return 0;
}

