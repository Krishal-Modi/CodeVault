# When a function Calls Itself then is a recursive function

def fact(x):
    if x == 0 or x == 1:  # Base case
        return 1
    else:
        return x * fact(x - 1)  # Recursive case

x = int(input("Enter the value: "))
print("Factorial is:", fact(x))
