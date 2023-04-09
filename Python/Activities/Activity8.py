s = list(input("Enter a sequence of comma separated values: ").split(", "))
print("Entered list is: ", s)
if (s[0] == s[-1]):
    print("True")
else:
    print("False")