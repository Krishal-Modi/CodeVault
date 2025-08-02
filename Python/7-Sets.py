# Sets are mutable datatypes
# Automatically eliminates the duplicate values
# Works Exactly like in Set Theory

# Union
# A.union(B)
# A|B

# Intersection
# A.intersection(B)
# A&B

# Subtraction
# A-B
# A.difference(B)

# Symmetric Difference
# A.symmetric_difference(B)
# A^B

farmAnimals = {'cow', 'sheep', 'hen', 'goat', 'horse'}
print(farmAnimals)
print(type(farmAnimals))

# Indexing is not possible in Set because it will always give the different order of elements

# use of set()
# set("12345")
#
# if choice in set("12345"):
#     or
# if choice in {"1", "2", "3", "4", "5"}:

# For creating empty set
# numbers = {*""}
# print(type(numbers))
#
# or
#
# numbers = set()

numbers = {1,2,3,4,5,6}
numbers.add(9)
print(numbers)
print(type(numbers))

# Deleting Items from set
numbers.discard(5)
print(numbers)

# numbers.clear() for clearing the set

setA = {"sheep", "horse", "lion", "tiger", "fish"}
setB = {"snake", "owl", "sparrow", "fish"}
setC = {"fish"}

# Union
# x = setA.union(setB)
# y = setA|setB
# print(x)
# print(y)

# Intersection
# x = setA.intersection(setB)
# y = setA&setB
# print(y)

# set Difference
# x = setA.difference(setB)
# y = setA - setB
# print(x)

# Symmetric Difference
# x = setA.symmetric_difference(setB)
# print(x)

# Subset
# print(setC < setA)
# print(setC <= setA)

# Superset
# print(setC >= setA)