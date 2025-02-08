from itertools import combinations
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
cows = list(map(int, input().split()))

count = 10**4
visited = [0,0]+[1 for _ in range(count-1)]
primes = {}
for i in range(2, count+1):
  if visited[i]: primes[i] = 1
  for j in range(2*i, count+1, i):
    visited[j] = 0

combi = list(combinations(cows, m))
sums = set()
for c in combi:
  if primes.get(sum(c)): 
    sums.add(sum(c))
answer = sorted(list(sums))
if answer:
  print(*answer)
else:
  print(-1)