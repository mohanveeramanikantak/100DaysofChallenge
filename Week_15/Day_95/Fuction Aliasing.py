#function Aliasing
#For the existing we can give another name, which is nothing but function aliasling
def wish(name):
    print("Good Morning:",name)

greeting=wish
print(id(wish))
print(id(greeting))

greeting('Shanmithi')
wish('Shanmithi')
