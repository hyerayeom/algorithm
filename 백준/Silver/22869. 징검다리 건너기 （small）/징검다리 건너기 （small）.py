import sys
input = sys.stdin.readline

n,k = map(int, input().split())
stones = list(map(int, input().split()))

def power_calc(prev, now):
  global stones, k
  power = (now-prev)*(1+abs(stones[prev]-stones[now]))
  if power > k:
    return 0
  return 1

dp = [0 for _ in range(n)]
dp[0] = 1
dp[1] = power_calc(0,1)
for i in range(2,n):
  for j in range(i):
    dp[i] += dp[j] if power_calc(j,i) else 0
print("YES" if dp[n-1] else "NO")