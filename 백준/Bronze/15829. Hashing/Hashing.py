# 15829
import sys
input = sys.stdin.readline

n = int(input())
st = list(input().strip())
count = 0 

for i in range(n) :
  count += (ord(st[i]) - 96) * (31 ** i)
print(count)