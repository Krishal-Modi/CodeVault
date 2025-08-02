# Tuples are immutable type datatype
t = ("a", "b", "c")
print(t)
print(t[2])

# Unpacking of tuple
a = b = c = d = e = 42
print(c)

x,y,z = 10,20,30
print(y)

data = 10,20,30
x,y,z = data

print(y)
print(z)

# enumeration
for t in enumerate ("abcdef"):
    index, character = t
    print(index+1 ,character)