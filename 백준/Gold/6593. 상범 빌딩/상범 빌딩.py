from collections import deque
import sys
input = sys.stdin.readline

directions = ((0,0,1),(0,0,-1),(0,1,0),(0,-1,0),(1,0,0),(-1,0,0))

while True:
  l,r,c = map(int, input().split())
  if l == r == c == 0 : break

  maze = [[] for _ in range(l)]
  visited = [[[0 for _ in range(c)] for _ in range(r)] for _ in range(l)]
  q = deque()
  flag = 0

  for i in range(l):
    for j in range(r):
      line = list(input().strip())
      maze[i].append(line)
      if not flag:
        for k in range(c):
          if line[k] == "S":
            maze[i][j][k] = 0
            q.append((i,j,k))
            visited[i][j][k] = 1
            flag = 1
    input()
  
  excape_flag = 0
  while q and not excape_flag:
    now_x,now_y,now_z = q.popleft()
    for d in directions:
      next_x = now_x + d[0]
      next_y = now_y + d[1]
      next_z = now_z + d[2]
      
      if next_x < 0 or next_y < 0 or next_z < 0 or next_x >= l or next_y >= r or next_z >= c: continue
      if visited[next_x][next_y][next_z]: continue
      visited[next_x][next_y][next_z] = 1
      if maze[next_x][next_y][next_z] == "E":
        print(f"Escaped in {maze[now_x][now_y][now_z]+1} minute(s).")
        excape_flag = 1
        break
      if maze[next_x][next_y][next_z] == ".":
        q.append((next_x,next_y,next_z))
        maze[next_x][next_y][next_z] = maze[now_x][now_y][now_z] + 1
  if not excape_flag: print("Trapped!")