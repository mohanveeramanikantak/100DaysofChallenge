#Shorted using custom key
employees=[
    {'Name':'Alan Turing','age':25,'salary':10000},
    {'Name':'Sharon lin','age':30,'salary':8000},
    {'Name':'John hopkins','age':18,'salary':10000},
    {'Name':'Mikhail Tal','age':40,'salary':20000},
]

#sort by name(Ascending order)
employees.sort(key=lambda x: x.get('Name'))
print(employees,end='\n\n')


#sort by Age(Ascending order)
employees.sort(key=lambda x: x.get('age'))
print(employees,end='\n\n')


#sort by Salary(Desending order)
employees.sort(key=lambda x: x.get('salary'),reverse=True)
print(employees,end='\n\n')
