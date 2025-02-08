#NOTE:-
#If global variable and local variable having the same name then we can access global variable inside a function as follow
a=10 #global variable
def f1():
    a=777   #local Variable
    print(a)
    print(globals()['a'])
f1()
