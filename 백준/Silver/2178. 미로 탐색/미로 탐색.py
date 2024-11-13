import sys
input = sys.stdin.readline

n,m = map(int, input().split())
maze = []
# count_maze = [[0] * m for _ in range(n)] 
visited = [[False] * m for _ in range(n)] 

for i in range(n) :
  inp = list(map(int, input().strip()))
  maze.append(inp)

dx = [0,-1,0,1] # 상 좌 하 우
dy = [-1,0,1,0] # 상 좌 하 우

q = [[0,0]]
# count_maze[0][0] = 1
visited[0][0] = True

while len(q) :
  now = q.pop(0)
  now_x = now[0]
  now_y = now[1]
  for i in range(4) :
    next_x = now_x + dx[i]
    next_y = now_y + dy[i]
    if(next_x < 0 or next_y < 0 or next_x >= n or next_y >= m) :
      continue
    if maze[next_x][next_y] != 0 and visited[next_x][next_y] == False:
      q.append([next_x, next_y])
      visited[next_x][next_y] = True
      maze[next_x][next_y] = maze[now_x][now_y] + 1

print(maze[n-1][m-1])