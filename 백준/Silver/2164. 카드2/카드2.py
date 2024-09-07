# 2164
import sys 
from collections import deque
input = sys.stdin.readline

n = int(input())
q = deque(range(1,n+1))

if n == 1:
  print(1)
else :
  while True :
    q.popleft()
    if len(q) == 1 :
      print(q[0])
      break
    q.append(q.popleft())