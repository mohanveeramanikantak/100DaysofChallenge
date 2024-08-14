//Pointers
//Implement a program that demonstrates pointer usage by swapping two variables using pointers.
#include <iostream>
using namespace std;
void swap(int *a, int *b) 
{
    int temp = *a;
    *a = *b;
    *b = temp;
}
int main() 
{
    int x = 10, y = 20;
    cout << "Before swap: x = " << x << ", y = " << y << endl;
    // Calling the swap function with pointers
    swap(&x, &y);
    cout << "After swap: x = " << x << ", y = " << y << endl;
    return 0;
}

