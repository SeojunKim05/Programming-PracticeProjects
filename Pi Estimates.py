import turtle
import math
import random


fred = turtle.Turtle()
fred.pensize(1)

wn = turtle.Screen()
wn.setworldcoordinates(-1,-1,1,1)
wn.bgcolor("white")
fred.speed(500)
turtle.tracer(n=100)

def MoveRandomCoordinates(t):
    numdarts = 1000
    count = 0
    for i in range(numdarts):

        randx = random.random()
        randy = random.random()
        x = randx * 2 - 1
        y = randy * 2 - 1
        t.pendown()
        t.dot(size=3)
        t.penup()
        t.goto(x, y)
        if (x**2 + y**2 <= 1):
            count = count + 1
    print (4*count/numdarts)



james=turtle.Turtle()
def MakeACircle(t):
    t.penup()
    t.goto(0.006,-1)
    t.pendown()
    for i in range(360):
        t.left(1)
        t.forward(((math.pi)*(2))/360)
        
gabe=turtle.Turtle()
def MakeaSquare(t):
    t.penup()
    t.goto(-1,-1)
    t.pendown()
    for i in range (4):
        t.forward(2)
        t.left(90)



MakeaSquare(gabe)
MakeACircle(james)

MoveRandomCoordinates(fred)



wn.exitonclick()