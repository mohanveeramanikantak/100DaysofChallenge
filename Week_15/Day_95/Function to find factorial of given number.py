#Function to find factoral of given numbers
def fact(num):
    result=1
    while num>=1:
        result=result*num
        num=num-1
    return result

for i in range(1,5):
    print("The Factorial of",i,"is :",fact(i))f
