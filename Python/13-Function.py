def myFunction():
    print("Hello Today its a wonderful day!!!")

myFunction()
myFunction()

def gfunction(fname):
    print(f"Name is {fname}")

fname = input("Enter Name : ")
gfunction(fname)

# Arbitrary Arguments
def my_function(*kids):
  print("The youngest child is " + kids[2])

my_function("Emil", "Tobias", "Linus")

# Return Value
def maths(x):
    return x * 5

print(maths(10))

# If Function is empty then pass
def myfunction():
  pass
