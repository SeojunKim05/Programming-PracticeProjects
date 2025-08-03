import turtle

wn = turtle.Screen()
wn.setup(1300,600)

def Triangle():
        triangle = turtle.Turtle()
        triangle.pensize(3)
        triangle.penup()
        triangle.goto(-275,100)
        triangle.pendown()

        for i in range(3):
                triangle.forward(180)
                triangle.left(120)

def Square():
        square = turtle.Turtle()
        square.pensize(3)
        square.penup()
        square.goto(100,100)
        square.pendown()

        for i in range(4):
                square.forward(150)
                square.left(90)

def Pentagon():
        pentagon = turtle.Turtle()
        pentagon.pensize(3)
        pentagon.penup()
        pentagon.goto(-255,-200)
        pentagon.pendown()

        for i in range(5):
                pentagon.forward(120)
                pentagon.left(72)

def Hexagon():
        hexagon = turtle.Turtle()
        hexagon.pensize(3)
        hexagon.penup()
        hexagon.goto (125,-200)
        hexagon.pendown()


        for i in range(6):
                hexagon.forward(100)
                hexagon.left(60)

def Worm():
        wn.clear()
        worm = turtle.Turtle()
        worm.pensize(3)
        x = 7

        for i in range(24):
                
                worm.forward(x)
                worm.left(90)
                x += 7
        return x

        
def Activate_Four_Shapes():
        wn.clear()
        Triangle()
        Square()
        Pentagon()
        Hexagon()


Activate_Four_Shapes()
Worm()
