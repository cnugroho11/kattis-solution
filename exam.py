ipt = []
right = 0

for i in range(3):
    ipt.append(input())

a = ipt[1]
b = ipt[2]

for i in range(len(ipt[1])):
    if b[i] == a[i]:
        right += 1

beda = right - int(ipt[0]) 

if beda > 0:
    print(len(ipt[1]) - beda)
else:
    print(len(ipt[1]) + beda)