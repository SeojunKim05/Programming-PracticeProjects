#Tic Tac Toe by text
import random

Game_board = [ "-","-","-","-","-","-","-","-","-"]
currentplayer = "X"
Winner = None
gameRunning = True

def printboard(Game_board):
    print(Game_board[0] + "|" + Game_board[1] + "|" + Game_board[2])
    print("-----")
    print(Game_board[3] + "|" + Game_board[4] + "|" + Game_board[5])
    print("-----")
    print(Game_board[6] + "|" + Game_board[7] + "|" + Game_board[8])

def player_Input(Game_board):
    button = int(input("Enter your location you want to place: "))
    if button >= 1 and button <=9 and Game_board[button-1] =="-":
        Game_board[button-1] = currentplayer
    else:
        print("Invalid Input")

def checkHorizontal(Game_board):
    global Winner
    if Game_board[0] == Game_board[1] == Game_board[2] and Game_board[1] != "-":
        Winner = Game_board[1]
        return True
    elif Game_board[3] == Game_board[4] == Game_board[5] and Game_board[3] != "-":
        Winner = Game_board[4]
        return True
    elif Game_board[6] == Game_board[7] == Game_board[8] and Game_board[6] != "-":
        Winner = Game_board[7]
        return True

def checkVertical (Game_board):
    global Winner
    if Game_board[0] == Game_board[3] == Game_board[6] and Game_board[3] != "-":
        Winner = Game_board[0]
        return True
    elif Game_board[1] == Game_board[4] == Game_board[7] and Game_board[4] != "-":
        Winner = Game_board[1]
        return True
    elif Game_board[2] == Game_board[5] == Game_board[8] and Game_board[5] != "-":
        Winner = Game_board[2]
        return True

def checkdiag (Game_board):
    global Winner
    if Game_board[0] == Game_board[4] == Game_board[8] and Game_board[4] != "-":
        Winner = Game_board[4]
        return True
    elif Game_board[2] == Game_board[4] == Game_board[6] and Game_board[4] != "-":
        Winner = Game_board[4]
        return True
def checkTie(Game_board):
    global gameRunning
    if "-" not in Game_board:
        print("It's a Tie! ")
        gameRunning = False

def checkWin(Game_board):
    global gameRunning
    if checkdiag(Game_board) or checkHorizontal(Game_board) or checkVertical(Game_board):
        print(f"The winner is {Winner}")
        gameRunning = False


def switchPlayer():
    global currentplayer
    if currentplayer == "X":
        currentplayer = "O"
    else:
        currentplayer = "X"

#def AI(Game_board):
    #while currentplayer == "O":
        #position = random.randint(0,8)
        #global Game_board
        #if Game_board(position) == "-":
            #Game_board(position) = "O"







while gameRunning == True:
    printboard(Game_board)
    player_Input(Game_board)
    checkWin(Game_board)
    checkTie(Game_board)
    switchPlayer()
    #AI(Game_board)
    ##checkTie(Game_board)







