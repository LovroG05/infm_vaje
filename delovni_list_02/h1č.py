a = int(input(">> "))

b = 0

for i in range(1, a):
        if a % i == 0:
            b += i

if a == b:
    print("popolno")
else:
    print("ni popolno")