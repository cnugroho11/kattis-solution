tc = int(input())
ls = list(map(int, input().split(' ')))
a = ls[0]
cc = 1

for i in range(1, tc):
    if a < ls[i]:
        cc += 1
    a = ls[i]

print(cc)