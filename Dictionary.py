
monthconversions = {
    "Jan": "January",
    "Feb": "February",
    "Mar": "March",
    "Apr": "April",
    "May": "May",
    "Jun": "June",
    "Jul": "July",
    "Aug": "August",
    "Sep": "September",
    "Oct": "October",
    "Nov": "November",
    "Dec": "December",

}

print(monthconversions.pop("Nov", "Not a valid key"))
print(monthconversions)
print(monthconversions.get("Nov","Not a valid key"))


def translate(phrase):
    translation =""
    for letter in phrase:
        if letter in "AEIOUaeiou":
            if letter.isupper():
                translation = translation + "X"
            else:
                 translation = translation + "x"
        else:
            translation = translation + letter
    return translation

print(translate(input("Enter your words:")))

my_dict = {3:9, 6:36, 9:81}
print (my_dict)

x = my_dict[6]
print (x)

y = [1, 2, 3, 2]
y.pop (2)
print(y)