#include <iostream>
// Template function to find the maximum of two numbers
template <typename T>
T findMax(T a, T b) 
{
    return (a > b) ? a : b;
}
int main() 
{
    std::cout << "Max of 3 and 7: " << findMax(3, 7) << std::endl;
    std::cout << "Max of 3.5 and 2.1: " << findMax(3.5, 2.1) << std::endl;
    std::cout << "Max of 'a' and 'z': " << findMax('a', 'z') << std::endl;

    return 0;
}

