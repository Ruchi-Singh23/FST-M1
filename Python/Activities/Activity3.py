user1 = input("What is Player1 name? ")
user2 = input("What is Player2 name? ")

selection1 = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
selection2 = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

if selection1 == selection2:
    print("It's a tie!")
elif selection1 == 'rock':
    if selection2 == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif selection1 == 'scissors':
    if selection2 == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif selection1 == 'paper':
    if selection2 == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")