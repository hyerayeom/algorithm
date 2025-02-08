import sys
input = sys.stdin.readline

k = int(input())
n = 10**7
visited = [0,0]+[1 for _ in range(n-1)]
prime = []

i = 1
count = 0
while len(prime) < k:
  count += 1
  i += 1
  if not visited[i]: continue
  prime.append(i)
  for j in range(2*i,n+1,i):
    visited[j] = 0
print(prime[k-1])