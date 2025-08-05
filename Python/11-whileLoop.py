i = 0
while i <= 10:
    print(i)
    i+=1

print("Starting Break")

j = 0
while j < 10:
    print(j)
    if j == 5:
        break
    j+=1

print("Starting Continue")

k = 0
while k < 10:
    k += 1
    if k == 6:
        continue
    print(k)
