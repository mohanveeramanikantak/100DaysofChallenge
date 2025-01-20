#importing array modeule to use array
import array as arr

#Declare and initialze array of type signed int
a=arr.array('i',[10,20,-30,40,-50])

#type size
print('item sixe if an element :',a.itemsize)

#typecode
print('Type code of a:',a.typecode)

#append new list at the end of the array
a.append(60)
print('Elements:',a);

#array count
print(a.count(20));

#index(x)
print('index :',a.index(20));

#insert
a.insert(2,99)
print('Element :',a);

#pop(i)
print(a.pop(2),"is Removed....")
print('Element :',a);

#remove (x)
a.remove(-30)
print("Element :",a);

#reverse
a.reverse()
print("Element :",a);

#tolist
print("Element(tolist):",a.tolist())
print("Type of a :",(a))


