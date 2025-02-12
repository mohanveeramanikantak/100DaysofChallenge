#reduce function
from functools import*
l=[10,20,30,40,50]
result=reduce(lambda x,y:x+y,range(1,101))
print(result)
