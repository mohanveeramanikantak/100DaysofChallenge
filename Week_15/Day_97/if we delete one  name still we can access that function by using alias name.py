#if we delete one  name still we can access that function by using alias name
def wish(name):
    print("Good Morninbg:",name)

greeting=wish

greeting('Shanmithi')
wish('Shanmithi')

del wish
#wish('Shanmithi')==>NameError: name 'wish' is not defined
greeting('pavan')
