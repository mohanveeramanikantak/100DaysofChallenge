#take second element for sort
def takesecond(elem):
    return elem[1]

#random list
random=[(2,2),(3,4),(4,1),(1,3)]

#sort list with key
random.sort(key=takesecond)

#print list
print('sorted list:',random)
