#Write a program to find number of occurrences of each letter present in the given string
word=input("Enter the Word")
d={}
for x in word:
    d[x]=d.get(x,0)+1
for k,v in d.items():
    print(k,"Occurred",v,"items")


#Enter the Wordmississippi
#m Occurred 1 items
#i Occurred 4 items
#s Occurred 4 items
#p Occurred 2 items
