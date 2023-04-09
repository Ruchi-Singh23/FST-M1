num = list(input("Enter a sequence of comma separated values: ").split(", "))
sum = 0

for x in num:
    sum += int(x)

print(sum)