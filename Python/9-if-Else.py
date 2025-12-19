name = input("Enter Your name : ")
age = int(input("Enter your age : "))

print(f"Hello {name} as your age is {age}")
if age > 18:
    print("Eligible for vote")
elif age == 18:
    print("you have to wait for 1 year more")
else:
    print("You Cannot vote")
