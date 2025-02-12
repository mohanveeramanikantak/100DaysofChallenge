#We can mix variable length arguments with positional auguments
def f1(n1,*s):
    print(n1)
    for s1 in s:
        print(s)
f1(10)
f1(10,20,30,40)
f1(10,"A",40,"B")
