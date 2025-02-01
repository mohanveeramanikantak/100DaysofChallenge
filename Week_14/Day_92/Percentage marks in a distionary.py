# Write a program ri enter name and percentage marks in a distionary and diaplay information on the screen
rec={}
n=int(input("Enter number of Students : "))
i=0
while(i<n):
    name=input("Enter Student Name : ")
    marks=input("Enter % of Marks of Students : ")
    rec[name]=marks
    i=i+1
print("Name of Students","\t","% of Marks")
for x in rec:
    print("\t",x,"\t\t",rec[x])

    
