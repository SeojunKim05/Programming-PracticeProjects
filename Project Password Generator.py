import random
from tkinter.messagebox import NO

NoOfPswrd = (int(input('How many passwords would you like to generate? \n')))

PswrdLength = (int(input('How many letters do you want your passwords to be? \n')))

Characters = list('qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*()_-+=:;<>,.?/)')

for Numbers in range(NoOfPswrd):
    passwords = ''
    for Letters in range(PswrdLength):
        passwords += random.choice(Characters)
    print (passwords)




