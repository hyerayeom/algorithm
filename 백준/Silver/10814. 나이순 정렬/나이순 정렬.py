# 10814
import sys
input = sys.stdin.readline

n = int(input())
arr = [input().split() for _ in range(n)]
for i in arr :
  i[0] = int(i[0])
arr.sort(key=lambda x:x[0])

for i in arr :
  print(*i)  