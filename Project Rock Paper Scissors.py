import random
import time

RPS = ["rock", "paper", "scissors"]
WinCondition = ["You Won", "Draw", "You lost"]



def Winner():
    userRPS = input("rock, paper, scissors: ")
    comRPS = (random.choice(RPS))
    if userRPS == "rock":
        if comRPS == RPS[0]:
            print(comRPS)
            time.sleep(1)
            print (WinCondition[1])
        if comRPS == RPS[1]:
            print(comRPS)
            time.sleep(1)
            print (WinCondition[2])
        if comRPS == RPS[2]:
            print(comRPS)
            time.sleep(1)
            print(WinCondition[0])
    elif userRPS == "paper":
        if comRPS == RPS[0]:
            print(comRPS)
            time.sleep(1)
            print (WinCondition[0])
        if comRPS == RPS[1]:
            print(comRPS)
            time.sleep(1)
            print (WinCondition[1])
        if comRPS == RPS[2]:
            print(comRPS)
            time.sleep(1)
            print(WinCondition[2])
    elif userRPS == "scissors":
        if comRPS == RPS[0]:
            print(comRPS)
            time.sleep(1)
            print (WinCondition[2])
        if comRPS == RPS[1]:
            print(comRPS)
            time.sleep(1)
            print (WinCondition[0])
        if comRPS == RPS[2]:
            print(comRPS)
            time.sleep(1)
            print(WinCondition[1])
    else:
        print("Invalid, try typing in all lower letters")



Winner()