a = []

def f(x):
    return x**3 - 2

def lihaStevila(tabela):
    for i in tabela:
        if i % 2 != 0:
            print(i)

def povprecje(tabela):
    s = 0
    for i in tabela:
        s += i

    return s/len(tabela)

def manjsaStevila(a, tabela):
    for i in tabela:
        if i < a: print(i)

for i in range(-20, 20):
    a.append(f(i))

lihaStevila(a)

print(povprecje(a))

manjsaStevila(12, a)



