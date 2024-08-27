//Recursion
//Write a recursive function to find the nth Fibonacci number.
#include <iostream>
using namespace std;
// Recursive function to find the nth Fibonacci number
int fibonacci(int n) 
{
    // Base cases
    if (n == 0) return 0;
    if (n == 1) return 1;
    // Recursive call
    return fibonacci(n - 1) + fibonacci(n - 2);
}
int main() 
{
    int n;
    cout << "Enter the value of n: ";
    cin >> n;
    
    cout << "The " << n << "th Fibonacci number is: " << fibonacci(n) << endl;
    return 0;
}

