#After variable length aruments,if we are talking any other arguments we shlould provide valudes as keyword arguments
def f1(*s,n1,n2):
    for s1 in s:
        print(s1)
        print(n1)
        print(n2)
f1("A","B",n1=10,n2=20)











