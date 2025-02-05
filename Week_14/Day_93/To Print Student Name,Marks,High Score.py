# Write a Program to accept student name and marks from the keyboard and creates a dictionary also display student marks by talking student nmae as input ?
n=int(input("Enter the Number of Students :"))
d={}
for i in range(n):
    name=input("Enter Student Name :")
    marks=input("Enter Student Marks :")
    d[name]=marks
while True:
    name=input("Enter Student Name of Get Marks :")
    marks=d.get(name,-1)
    if marks == -1:
        print("Student not Found")
    else:
        print("The Marks of",name,"are",marks)
        option=input("Do you want to find another Student marks[Yes|No]")
        if option=="No":
            print("Thanks For Using Our Application")
            break
              
