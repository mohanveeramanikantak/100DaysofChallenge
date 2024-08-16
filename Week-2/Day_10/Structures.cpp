//Structures
//Create a program that defines a structure for a student (name, age, marks) and prints the details of a student.
#include <iostream>
using namespace std;
// Define a structure for a student
struct Student {
    string name;
    int age;
    float marks;
};
int main() {
    // Create a student variable and initialize it
    Student student1;
    
    // Input student details
    cout << "Enter student's name: ";
    getline(cin, student1.name);
    
    cout << "Enter student's age: ";
    cin >> student1.age;
    
    cout << "Enter student's marks: ";
    cin >> student1.marks;
    
    // Print student details
    cout << "\nStudent Details:" << endl;
    cout << "Name: " << student1.name << endl;
    cout << "Age: " << student1.age << endl;
    cout << "Marks: " << student1.marks << endl;
    
    return 0;
}

