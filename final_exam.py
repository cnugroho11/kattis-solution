tc = int(input())
ipt = []
point = 0

for i in range(tc):
    ipt.append(input())

aa = ipt[0:-1]
bb = ipt[1:len(ipt)]

for i in range(len(aa)):
    if aa[i] == bb[i]:
        point += 1

print(point)