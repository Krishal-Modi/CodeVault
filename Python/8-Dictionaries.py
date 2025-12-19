# Dictionary is a collections of values that are stored using a key
# Dictionaries are mutable type
vehicles = {
    'BMW' : 'X09',
    'BMWX' : 'x7',
    'Mercedes' : 'Mercedes Benz',
    'Maruti Suzuki' : 'XUV',
    'Mustang' : 'GTX',
    'Tata' : 'Harrier'
}

my_car = vehicles['Mustang']
print(my_car)

# Adding item
vehicles["Ford"] = "F-104"

# Iterating over a Dictionary
for key in vehicles:
    print(key, vehicles[key], sep=": ")

d = {
    0: "zero",
    1: "un",
    2: "duo",
    3: "triode",
    4: "quatre",
    5: "cinq",
    6: "six",
    7: "sept",
    8: "huit",
    9: "neuf",
    10: "dix"
}

d2 = {
    8:"huight"
}

d.update(d2)
print(d)

for key, value in d.items():
    print(key, value)

keys = d.keys()
print(keys)