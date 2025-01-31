#Write a program to find number occurrences of each Vovel present in the given String
word=input("Enter any Word:")
vowels={'a','e','i','o','u'}
d={}
for x in word:
    if x in vowels:
        d[x]=d.get(x,0)+1
for k,v in sorted (d.items()):
    print(k,"Occurred",v,"items")
    
#Enter any Word:doganimaldoganimals
#a Occurred 4 items
#i Occurred 2 items
#o Occurred 2 items
