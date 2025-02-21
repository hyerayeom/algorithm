import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int,input().split()))
dp = [0] + [0 for _ in range(max(nums))]

for i in nums:
  dp[i] = max(dp[i], dp[i-1]+1)

print(max(dp))