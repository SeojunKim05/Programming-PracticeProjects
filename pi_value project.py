def pi_compute(num_term):
    pi = 3
    a = 2
    b = 1

    for i in range(num_term):
        pi += (4 / (a * (a + 1) * (a + 2))) * b
        a += 2
        b *= -1

    return pi

print(pi_compute(351))