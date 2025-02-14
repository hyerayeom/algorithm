import sys
input = sys.stdin.readline

n = int(input())
nums = [int(input()) for _ in range(n)]
fivo = {}

memo = [0,1] + [0]*(10**5-1)
for i in range(2,10**5+1):
  memo[i] = memo[i-1] + memo[i-2]
  fivo[memo[i]] = i

for i in nums:
  print(fivo[i])