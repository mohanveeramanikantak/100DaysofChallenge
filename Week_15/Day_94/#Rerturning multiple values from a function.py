#Rerturning multiple values from a function
def sum_sub(a,b):
    sum=a+b
    sub=a-b
    return sum,sub
x,y=sum_sub(100,50)
print("The sum is:",x)
print("The subtraction is:",y)
