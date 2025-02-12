# we can call this function by passing any number of keyword aurguments
# internally thesr keyword arguments will be stored inside a dictionary
def display(**kwargs):
    for k,v in kwargs.items():
        print(k,"=",v)
display(n1=10,n2=20,n3=30)
display(rno=100,name="Durga",marks=70,Subject="Java")
