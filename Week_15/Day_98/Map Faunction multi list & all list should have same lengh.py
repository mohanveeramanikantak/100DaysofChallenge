#we can apply map() function on multiple list also.But make sure all list sholud have same lengh
l1=[1,2,3,4]
l2=[2,3,4,5]
l3=list(map(lambda x,y:x,l1,l2))
print(l3)
