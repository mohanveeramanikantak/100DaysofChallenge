#Global Variable
def f1():
    global a
    a=10
    print(a)

def f2():
    print(a)

f1()
f2()
