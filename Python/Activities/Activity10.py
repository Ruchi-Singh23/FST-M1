s = tuple(input("Enter a sequence of comma separated values: ").split(", "))
print("Entered tuple is: ", s)

print("Elements that are divisible by 5:")
for num in s:
    if (int(num) % 5 == 0):
        print(num)