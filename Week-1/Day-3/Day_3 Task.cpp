//Control Flow (if/else)
//Write a program that checks if a given number is positive, negative, or zero.
#include <iostream>
using namespace std;
int main() 
{
    int number;

    cout << "Enter a number: ";
    cin >> number;

    if (number > 0) 
	{
        cout << number << " is positive." << endl;
    } 
	else if (number < 0) 
	{
        cout << number << " is negative." << endl;
    } else 
	{
        cout << number << " is zero." << endl;
    }

    return 0;
}

