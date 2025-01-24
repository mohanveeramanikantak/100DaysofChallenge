l=eval(input("Enter list of values"))
l1=[]
for x in l:
    if x not in l1:
        l1.append(x)
        print(l1)
