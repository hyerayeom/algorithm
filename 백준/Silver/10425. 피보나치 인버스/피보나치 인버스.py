import sys
input = sys.stdin.readline

n = int(input())
nums = [int(input()) for _ in range(n)]
max_n = 10**5

memo = [0,1] + [0]*(max_n-1)
for i in range(2, max_n+1):
  memo[i] = memo[i-1] + memo[i-2]

for num in nums:
  start = -1
  end = max_n
  while start < end-1:
    mid = (start+end) // 2
    if memo[mid] < num:
      start = mid
    else:
      end = mid
  if end == 1:
    end = 2
  print(end)