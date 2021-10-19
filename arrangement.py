ll = []
for i in range(2):
    ll.append(int(input()))

lp = int(ll[1] / ll[0])
ex = int(ll[1] % ll[0])

for i in range(ll[0]):
    if ex > 0:
        for i in range(lp + 1):
            print('*', end='')
        print('')
        ex -= 1
    else:
        for i in range(lp):
            print('*', end='')
        print('')

