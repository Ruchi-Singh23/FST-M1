fruits = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

search = input("Enter search fruit: ").lower()

if (search in fruits):
    print("Yes, this is available")
else:
    print("No, this is not available")