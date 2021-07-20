def main():
    a, b = map(int, input().split(' '))
    ipt = []
    for i in range(b):
        ipt.append(int(input()))

    if a == b:
        tmp = 0
        for i in range(b):
            tmp += ipt[i]
        tmp /= a
        print(str(tmp)+" "+str(tmp))
    else:
        tmp1 = 0
        mn = 0
        mx = 0
        for i in range(b):
            tmp1 += ipt[i]
        mn = tmp1 + ((a-b)*-3)
        mx = tmp1 + ((a-b)*3)
        print(str(mn/a)+" "+str(mx/a))

main()