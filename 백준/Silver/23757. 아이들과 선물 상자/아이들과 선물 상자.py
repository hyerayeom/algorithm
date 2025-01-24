import heapq
import sys
input = sys.stdin.readline

n,m = map(int, input().split())

present = []
for p in list(map(int, input().split())) :
  heapq.heappush(present, (-p, p))
children = list(map(int, input().split()))

count = 1

for c in children :
  p = heapq.heappop(present)[1] - c
  if p < 0 : 
    count = 0
    break
  heapq.heappush(present, (-p, p))

print(count)