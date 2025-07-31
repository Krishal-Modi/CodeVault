### Variables
import random

x = "Hello"
#Or x = 'Hello'
y = 5

print(type(x))
print(type(y))

# Camel Case
myVariable = "asdi"
# Snake Case
my_variable_is = "kfbsjkd"
# Pascal Case
MyVariableName = "dkbsdas"

## Assign Multiple Values
x , y , z = 12 , 20 , 30
print(y)

a = b = c = "Hello"
print(b)

### Datatypes

# Text Type:	str
# Numeric Types:	int, float, complex
# Sequence Types:	list, tuple, range
# Mapping Type:	dict
# Set Types:	set, frozenset
# Boolean Type:	bool
# Binary Types:	bytes, bytearray, memoryview
# None Type:	NoneType

## Random
print(random.randint(1,5))

## Casting
z = int(2.2)
print(z)
c = int("5")
print(c)
print(type(c))
