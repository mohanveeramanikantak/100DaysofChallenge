#A function can Return Another function
def outer():
    print("Outer Fucntion Started")
    def inner():
        print("Inner Function Execution")
        print("Outer Function returning inner function")
    return inner
f1=outer()
f1()
f1()
f1()
