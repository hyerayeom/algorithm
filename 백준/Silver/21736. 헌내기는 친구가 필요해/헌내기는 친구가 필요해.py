from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
maze = [[0 for _ in range(m)] for _ in range(n)]
visited = [[0 for _ in range(m)] for _ in range(n)]
q = deque()
directions = ((0,1),(0,-1),(1,0),(-1,0))
count = 0

for i in range(n) :
  line = list(input())
  for j in range(m) :
    maze[i][j] = line[j]
    if line[j] == "I" : q.append((i,j))

while q :
  now_x, now_y = q.pop()
  for d in directions :
    next_x = now_x + d[0]
    next_y = now_y + d[1]

    if next_x < 0 or next_y < 0 or next_x >= n or next_y >= m :
      continue
    if visited[next_x][next_y] : continue
    visited[next_x][next_y] += 1
    if maze[next_x][next_y] == "X" : 
      continue
    if maze[next_x][next_y] == "P" : count += 1
    q.append((next_x,next_y))

print(count if count > 0 else "TT")