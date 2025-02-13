#Without Lambda Funtion
def isEven(x):
    if x%2==0:
        return True
    else:
        return False
i=[0,5,10,15,20,25,30]
i1=list(filter(isEven,i))
print(i1)
