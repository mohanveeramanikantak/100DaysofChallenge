//Using a do-while loop in cpp
#include <iostream>
int main() 
{
    int i = 1;
    do  // Using a do-while loop to print the first 10 natural numbers
	{
        std::cout << i << " ";
        i++;
    } while(i <= 10);
    
    return 0;
}

