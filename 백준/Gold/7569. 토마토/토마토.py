import sys
from collections import deque

input = sys.stdin.readline

derections = ((-1,0,0),(1,0,0),(0,-1,0),(0,1,0),(0,0,-1),(0,0,1))

m,n,h = map(int, input().split())
tomato = [[] for _ in range(h)]
visited= [[[False for _ in range(m)] for _ in range(n)] for _ in range(h)]

q = deque()

for i in range(h) :
  for j in range(n) :
    inp = list(map(int, input().split()))
    tomato[i].append(inp)
    for k in range(m) :
      if tomato[i][j][k] == 1:
        q.append((i,j,k))
        visited[i][j][k] = True

while len(q) :
  now_x, now_y, now_z = q.popleft()

  for d in derections :
    next_x = now_x + d[0]
    next_y = now_y + d[1]
    next_z = now_z + d[2]

    if next_x < 0 or next_x >= h or next_y < 0 or next_y >= n or next_z < 0 or next_z >= m :
      continue
    if visited[next_x][next_y][next_z] :
      continue
    if tomato[next_x][next_y][next_z] == 0 :
      tomato[next_x][next_y][next_z] = tomato[now_x][now_y][now_z] + 1
      q.append((next_x,next_y,next_z))
    visited[next_x][next_y][next_z] = True

count = 0
check_zero = False
for t in tomato :
  if check_zero :
    break
  for j in t :
    if 0 in j :
      count = -1
      check_zero = True
      break
    count = max(j)-1 if max(j) > count else count

print(count)