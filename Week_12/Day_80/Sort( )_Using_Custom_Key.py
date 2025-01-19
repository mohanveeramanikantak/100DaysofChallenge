
#Shorted using custom key
employees=[
    {'Name':'Alan Turing','age':25,'salary':10000},
    {'Name':'Maniknata','age':24,'salary':60000},
    {'Name':'Kumar','age':24,'salary':30000},
    {'Name':'Srinu','age':26,'salary':20000},
]

#Custom Function to Get Employee info
def get_Name(employee):
    return employee.get('Name')

def get_Age(employee):
    return employee.get('age')

def get_Salary(employee):
    return employee.get('salary')

#sorted by Name(Ascending Order)
employees.sort(key=get_Name)
print(employees,end='\n\n')

#sorted by Age(Ascending Order)
employees.sort(key=get_Age)
print(employees,end='\n\n')

#sorted by Salary(Descending Order)
employees.sort(key=get_Salary,reverse=True)
print(employees,end='\n\n')


  
