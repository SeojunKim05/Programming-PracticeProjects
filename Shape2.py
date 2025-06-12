import turtle 

wn = turtle.Screen()

Bob = turtle.Turtle()
Bob.color("blue")
Bob.pensize(2)
Bob.speed(10)



def ForwardLeftForward(t):
    t.forward(100)
    t.left(90)
    t.forward(100)

def Onesquare(t):
    ForwardLeftForward(t)
    for i in range(3):
        t.left(90)
        t.forward(200)
    t.left(90)
    ForwardLeftForward(t)
    t.left(15)

def drawPattern(t):
    for i in range(24):
        Onesquare(t)
    wn.exitonclick()

drawPattern(Bob)

    

