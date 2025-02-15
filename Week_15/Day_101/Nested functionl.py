#Nested Functiom
    #we can declare a function inside another function, such type of function are called Nested Function
def outer():
    print("Outer Function Started")
def inner():
    print("inner Function Execution")
    print("Outer Function Calling inner Function")
inner()
outer()
#inner()==>NameErroe:name'inner' is Not Defined
