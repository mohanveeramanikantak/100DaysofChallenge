//File I/O
//Write a program that reads data from a file and writes the reversed content to another file.
#include <iostream>
#include <fstream>
#include <string>
#include <algorithm>
int main()
{
    std::ifstream inputFile("input.txt");
    std::ofstream outputFile("output.txt");
    if (!inputFile) 
	{
        std::cerr << "Error opening input file!" << std::endl;
        return 1;
    }
    if (!outputFile) 
	{
        std::cerr << "Error opening output file!" << std::endl;
        return 1;
    }
    std::string content((std::istreambuf_iterator<char>(inputFile)),
                        std::istreambuf_iterator<char>());
    std::reverse(content.begin(), content.end());

    outputFile << content;

    inputFile.close();
    outputFile.close();

    std::cout << "Content reversed and written to output.txt" << std::endl;

    return 0;
}

