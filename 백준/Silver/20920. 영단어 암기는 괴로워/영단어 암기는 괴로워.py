from collections import Counter
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
words = []
for _ in range(n) :
  w = input().strip()
  if len(w) >= m : words.append(w)

a = list(Counter(words).items())
a.sort(key=lambda x: (-x[1], -len(x[0]), x[0]))

for s in a :
  print(s[0])
