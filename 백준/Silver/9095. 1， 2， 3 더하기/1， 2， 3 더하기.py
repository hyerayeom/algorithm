import sys
input = sys.stdin.readline

def dyp(x) : 
  dp[1] = 1
  dp[2] = 2
  dp[3] = 4

  i = 4
  while(i <= x) :
    dp[i] = dp[i-3] + dp[i-2] + dp[i-1]
    i += 1

n = int(input())
num_inputs = [0] * n
dp = [0] * (100)

for i in range(n) :
  num_inputs[i] = int(input())

dyp(max(num_inputs))

for i in num_inputs :
  print(dp[i])
