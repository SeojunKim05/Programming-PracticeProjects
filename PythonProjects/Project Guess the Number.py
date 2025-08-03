import random


NumberofGuesses = int(input("Enter the number of chances of guesses: "))
OutofGuesses = False
CurrentGuesses = 0
Gamerunning = True

Inputrandnum1 = int(input("Enter your starting range of number for the guesses: "))
Inputrandnum2 = int(input("Enter your Ending range of number for the guesses: "))
Randnum = random.randrange(Inputrandnum1, Inputrandnum2)

def RunGame():
    global CurrentGuesses
    global OutofGuesses
    global NumberofGuesses
    global Gamerunning
    global Randnum
    while Gamerunning and not OutofGuesses:
        if CurrentGuesses < NumberofGuesses:
            a = int(input("Enter your guess: "))
            if a != Randnum:
                if a >= Randnum:
                    print("Smaller")
                    CurrentGuesses +=1
                elif a <= Randnum:
                    print("Bigger")
                    CurrentGuesses += 1
            elif a == Randnum:
                print("You won!")
                Gamerunning = False
                OutofGuesses = True

        else:
            OutofGuesses = True
            Gamerunning = False
            print("You lost! The number was " + str(Randnum) + "!")




RunGame()

