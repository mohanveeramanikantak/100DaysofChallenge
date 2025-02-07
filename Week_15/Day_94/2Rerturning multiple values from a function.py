#Rerturning multiple values from a function
def calc(a,b):
    sum=a+b
    sub=a-b
    mul=a*b
    div=a/b
    return sum,sub,mul,div
t=calc(100,50)
print("The Result are ")
for i in t:
    print(i)
