//STL (Standard Template Library)
#include <iostream>
#include <vector>
#include <algorithm> // For std::sort
int main() {
    std::vector<int> numbers; 
    int num;
    
    // Input: Collecting integers from the user
    std::cout << "Enter integers (type -1 to stop): " << std::endl;
    while (true) 
	{
        std::cin >> num;
        if (num == -1) break; // Stop input when -1 is entered
        numbers.push_back(num); // Add the number to the vector
    }
    // Sorting the vector in ascending order
    std::sort(numbers.begin(), numbers.end());
    
    // Output: Displaying the sorted list of integers
    std::cout << "Sorted list of integers: ";
    for (int n : numbers) 
	{
        std::cout << n << " ";
    }
    std::cout << std::endl;

    return 0;
}

