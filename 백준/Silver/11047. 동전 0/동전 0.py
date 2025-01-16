import sys
input = sys.stdin.readline

n,k = map(int, input().split())
coin = [int(input()) for _ in range(n)]
count = 0

for i in range(n,0,-1) :
  count += k // coin[i-1]
  k %= coin[i-1]
print(count)
