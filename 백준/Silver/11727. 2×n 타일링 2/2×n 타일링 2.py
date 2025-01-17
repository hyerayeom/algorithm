import sys
input = sys.stdin.readline

n = int(input())
memo = [0,1,3]

for i in range(3, n+1) :
  memo.append(memo[i-1] + memo[i-2] * 2)
print(memo[n] % 10007)
