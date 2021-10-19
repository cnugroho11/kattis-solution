ipt = input().replace('0', '')

while True:
    tmp = 1
    for i in ipt:
        tmp *= int(i)
    ipt = str(tmp)

    if int(ipt) >= 1 and int(ipt) <= 9:
        print(ipt)
        break