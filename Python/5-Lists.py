# List are mutable type (can be changed)
myList = ["monitor", "desktop", "speaker", "cpu", "keyboard", "mouse"]
print(myList)
print(myList[1:2])
if "desktop" in myList:
    print("Yees it is there")

# Update the list
thislist = ["apple", "banana", "cherry", "orange", "kiwi", "mango"]
thislist[1:3] = ["blackcurrant", "watermelon"]
print(thislist)

# Insert
thislist.insert(2, "watermelon")
print(thislist)

# Extends
thisList = ["apple", "banana", "cherry"]
tropical = ["mango", "pineapple", "papaya"]
thisList.extend(tropical)
print(thisList)

# Remove
thisList.remove("apple")
print(thisList)

# Del (delete completely)
thislist = ["apple", "banana", "cherry"]
del thislist

# # Clear
# thislist.clear()
# print(thislist)

# Loop in List
myList = ["apple", "dragon", "kiwi", "banana"]
for x in myList:
    print(x)

# Sorting
sortList = [100, 50, 65, 82, 23]
sortList.sort() # sortList.sort(reverse = True)
print(sortList)

# append
appendList = [1,2,3,45,4]
appendList.append(9)
print(appendList)

