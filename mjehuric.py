ls = list(map(int, input().split(' ')))
lss = [1, 2, 3, 4, 5]

while ls != lss:
    if ls[0] > ls[1]:
        ls[0], ls[1] = ls[1], ls[0]
        print(*ls, sep=' ')

    if ls[1] > ls[2]:
        ls[1], ls[2] = ls[2], ls[1]
        print(*ls, sep=' ')

    if ls[2] > ls[3]:
        ls[2], ls[3] = ls[3], ls[2]
        print(*ls, sep=' ')

    if ls[3] > ls[4]:
        ls[3], ls[4] = ls[4], ls[3]
        print(*ls, sep=' ')
