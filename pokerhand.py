from collections import Counter

ipt = input().split(' ')
ans = []

for i in ipt:
    ans.append(i[:1])

counts = Counter(ans)
print(max(counts.values()))