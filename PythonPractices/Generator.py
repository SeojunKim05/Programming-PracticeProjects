def firstn(n):
    nums = []
    num = 0
    while num < n:
        nums.append(num)
        num += 1
    return nums



def firstn_generator(n):
    num = 0
    while num < n:
        yield num
        num+= 1



print(firstn(10))
print(firstn(10))





