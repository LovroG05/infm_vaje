st = ""

while len(st) >= 4 and len(st) <= 6:
    st = input(">>> ")
st = int(st)


def vsotaStevk(n):
    a = 0
    while n > 1:
        a += n%10
        n /= 10

    print(a)


def najvecjaStevka(n):
    najvecja = 0

    while n > 1:
        if n%10 > najvecja:
            najvecja = n%10
        n /= 10

    return najvecja

def palindromskoStevilo(n):
    n = str(n)
    if n == n[::-1]:
        return True
    return False