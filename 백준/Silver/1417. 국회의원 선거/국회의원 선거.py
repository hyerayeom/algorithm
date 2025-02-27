import heapq
import sys
input = sys.stdin.readline

n = int(input())
my = int(input())
if n == 1:
  print(0)
else:
  candidate = [-int(input()) for _ in range(n-1)]
  answer = 0
  heapq.heapify(candidate)
  while True:
    a = -heapq.heappop(candidate)
    if my > a:
      break
    heapq.heappush(candidate, -(a-1))
    my += 1
    answer += 1
  print(answer)