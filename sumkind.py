tc = int(input())
ans = []

for i in range(tc):
    aa = 0
    bb = 0
    cc = 0

    tmpAns = []
    tmpAns.append(str(i+1))
    tmp = list(map(int, input().split()))
    for j in range(1,tmp[1]+1):        
        aa += j
    for j in range(1, 2 * (tmp[1])):
        if j % 2 != 0:
            bb += j
    for j in range(1, 2 * (tmp[1]+1)):
         if j % 2 == 0:
            cc += j

    tmpAns.append(str(aa))
    tmpAns.append(str(bb))
    tmpAns.append(str(cc))
    ans.append(tmpAns)

for i in range(len(ans)):
    print(" ".join(ans[i]))