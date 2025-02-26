from collections import deque
import sys
input = sys.stdin.readline

n,m,k = map(int,input().split())
maze = [[0 for _ in range(m)] for _ in range(n)]
visited = [[0 for _ in range(m)] for _ in range(n)]
directions = ((0,1),(0,-1),(1,0),(-1,0))
answer = 0

for i in range(k):
  x,y = map(int,input().split())
  maze[x-1][y-1] = 1

def bfs(x,y):
  global maze
  global visited
  global answer

  q = deque([(x,y)])
  count = 0
  while q:
    now_x,now_y = q.popleft()
    for dx,dy in directions:
      next_x = now_x + dx
      next_y = now_y + dy
      if next_x < 0 or next_y < 0 or next_x >= n or next_y >= m:
        continue
      if visited[next_x][next_y]:
        continue
      visited[next_x][next_y] = 1
      if maze[next_x][next_y]:
        q.append((next_x,next_y))
        count += 1
  answer = max(answer,count)

for i in range(n):
  for j in range(m):
    if maze[i][j] and not visited[i][j]:
      bfs(i,j)
print(answer)