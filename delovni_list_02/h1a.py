while True:
    a = int(input("vnesi število"))

    for i in range(1, a+1):
        if a % i == 0:
            print(i)