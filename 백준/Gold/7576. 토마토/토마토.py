import sys
from collections import deque
input = sys.stdin.readline

n,m = list(map(int,input().split()))
tomato = []
visited = [[False for _ in range(n)] for _ in range(m)]
q = deque()

for i in range(m) :
  inp = list(map(int, input().split()))
  tomato.append(inp)
  for j in range(n) :
    if tomato[i][j] == 1 :
      q.append([i,j])
      visited[i][j] = True

dx = [0,1,0,-1]
dy = [1,0,-1,0]

while q :
  now = q.popleft()
  now_x = now[0]
  now_y = now[1]

  for i in range(4) :
    next_x = now_x + dx[i]
    next_y = now_y + dy[i]
    if next_x < 0 or next_y < 0 or next_x >= m or next_y >= n:
      continue
    if visited[next_x][next_y] :
      continue
    visited[next_x][next_y] = True
    if tomato[next_x][next_y] == -1 :    
      continue
    tomato[next_x][next_y] = tomato[now_x][now_y] + 1
    q.append([next_x, next_y])
    
answer = max(list(map(max, tomato))) -1
for t in tomato :
  if 0 in t : answer = -1
print(answer)
