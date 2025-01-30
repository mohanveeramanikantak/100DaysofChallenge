#if The avaliable then retuern corresponding value otherwise retuen none if wost
d={100:"durga",200:"ravi",300:"shiva"}
print(d[100])
print(d[400])
print(d.get(100))
print(d.get(400))
print(d.get(100,"Guest"))
print(d.get(400,"Guest"))
