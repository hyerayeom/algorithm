import sys
input = sys.stdin.readline

n = int(input())
memo = [0] * (10 ** 7 + 1)

for i in range(n) :
  index = i+1
  a = index+1
  b = index*2
  c = index*3
  memo[a] = memo[index]+1 if memo[a] == 0 or (memo[a] > memo[index]) else memo[a]
  memo[b] = memo[index]+1 if memo[b] == 0 or (memo[b] > memo[index]) else memo[b]
  memo[c] = memo[index]+1 if memo[c] == 0 or (memo[c] > memo[index]) else memo[c]

print(memo[n])