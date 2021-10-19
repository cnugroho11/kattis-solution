aa = list(map(int, input().split()))
ans = 1

while aa[0] % aa[1] != 0:
    aa[1] -= aa[0] % aa[1]
    ans += 1

print(ans)
