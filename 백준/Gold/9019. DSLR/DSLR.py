from collections import deque
import sys
input = sys.stdin.readline

def bfs(n,m):
  operation = ["D","S","L","R"]
  
  visited = {}
  visited[n] = 1

  q = deque()
  q.append((n,""))

  while q:
    now, oper = q.popleft()
    if now == m:
      return oper
    
    fNow = '{0:04d}'.format(now%(10**4))
    res = [(now*2)%(10**4), now-1 if now != 0 else 9999, int(fNow[1:]+fNow[0]), int(fNow[3:]+fNow[:3])]

    for i in range(4):
      if not visited.get(res[i]):
        q.append((res[i], oper+operation[i]))
        visited[res[i]] = 1

test_case = int(input())
for _ in range(test_case):
  n,m = map(int, input().split())
  print(bfs(n,m))