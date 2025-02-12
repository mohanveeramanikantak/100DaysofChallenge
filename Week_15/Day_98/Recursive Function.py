#Python Function  to Find Factorial of given number with recursion
def factorial(n):
    if n==0:
        result=1
    else:
        result=n*factorial(n-1)
    return result
print("Facorial of 4 is:",factorial(4))
print("Facorial of 5 is:",factorial(5))
