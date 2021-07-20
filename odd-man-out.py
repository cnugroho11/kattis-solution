tc = int(input())
a = []

for i in range(tc):
    tmp = input()
    a.append(sorted(set(input().split(' '))))

print(a)