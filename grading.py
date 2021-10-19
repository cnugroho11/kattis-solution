ll = list(map(int, input().split()))
vv = int(input())

if vv < ll[4]:
    print('F')
elif vv < ll[3]:
    print('E')
elif vv < ll[2]:
    print('D')
elif vv < ll[1]:
    print('C')
elif vv < ll[0]:
    print('B')
else:
    print('A')