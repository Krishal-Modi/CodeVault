parrot = "Norwegian Blue"
print(parrot)

print(parrot[3])

## Negative Indexing
parrot = "Norwegian Blue"
#       -14              -1
print(parrot[-4])

## Slicing

print(parrot[0:3])
print(parrot[2:6])
print(parrot[:6])
print(parrot[10:])

## Negative Indexing

print(parrot[-14:-8])

## Slicing with steps

print(parrot[::2])
print(parrot[::-1])

name = input("Enter Your name : ")
age = int(input("Enter Your age : "))

print(f"{name} is {age} years old")
print("{0} is {1} years old".format(name, age))


### Boolean

print(bool("Hello"))
print(bool(15))