from queue import PriorityQueue
import sys
input = sys.stdin.readline

n = int(input())
pq = PriorityQueue(maxsize=n)

for _ in range(n) :
  inp = int(input())
  if inp == 0 :
    if pq.empty() :
      print(0)
    else : print(pq.get()[1])
  else :
    pq.put((abs(inp), inp))