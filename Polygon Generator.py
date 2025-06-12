import turtle


def DrawPolygon(Bob, sides, length):
    Bob.begin_fill()
    for i in range(sides):
        Bob.forward(length / sides)
        Bob.left(360 / sides)
    Bob.end_fill()



def main():
    sides = int(input("Enter the number of sides of the polygon: "))
    length = 360#int(input("Enter the length of the polygon: "))
    
    wn = turtle.Screen()
    Bob = turtle.Turtle()
    Bob.color("grey")
    Bob.fillcolor("red")
    Bob.shape("turtle")
    Bob.pensize(3)

    DrawPolygon(Bob, sides, length)

    wn.exitonclick()


main()
