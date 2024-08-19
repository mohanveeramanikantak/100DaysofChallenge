//Inheritance
#include <iostream>
// Base class
class Animal {
public:
    // Virtual method to be overridden in derived classes
    virtual void makeSound() const {
        std::cout << "Some generic animal sound" << std::endl;
    }
};

// Derived class Dog
class Dog : public Animal 
{
public:
    // Override the makeSound method
    void makeSound() const override 
	{
        std::cout << "Woof! Woof!" << std::endl;
    }
};
// Derived class Cat
class Cat : public Animal 
{
public:
    // Override the makeSound method
    void makeSound() const override 
	{
        std::cout << "Meow! Meow!" << std::endl;
    }
};

int main() 
{
    Animal genericAnimal;
    Dog dog;
    Cat cat;

    std::cout << "Animal makes sound: ";
    genericAnimal.makeSound();

    std::cout << "Dog makes sound: ";
    dog.makeSound();

    std::cout << "Cat makes sound: ";
    cat.makeSound();

    return 0;
}

