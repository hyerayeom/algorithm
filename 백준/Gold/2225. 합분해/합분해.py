import sys
input = sys.stdin.readline

n, k = map(int, input().split())

dp = [[i+1 for i in range(k)]]
for i in range(n-1) :
  dp.append([1] + [0 for _ in range(k-1)])

for i in range(1,n) :
  for j in range(1,k) :
    dp[i][j] = dp[i-1][j] + dp[i][j-1]

print(dp[n-1][k-1] % 1000000000)