import sys
input = sys.stdin.readline

def DP(coins,money):
  dp = [1] + [0 for _ in range(money)]

  for c in coins:
    for i in range(1, money+1):
      if i-c >= 0:
        dp[i] += dp[i-c]
  return dp[money]

test_case = int(input())
for _ in range(test_case):
  n = int(input())
  coins = list(map(int,input().split()))
  money = int(input())
  print(DP(coins,money))