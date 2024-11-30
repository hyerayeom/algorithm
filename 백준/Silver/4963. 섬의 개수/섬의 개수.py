import sys
from collections import deque

input = sys.stdin.readline

w,h = map(int, input().split())
derections = ((-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1))

def dfs_island(map, visited, x, y) :
  global derections
  visited[x][y] = True

  q = deque()
  q.append((x, y))

  while len(q) :
    now_x, now_y = q.popleft()
    for d in derections :
      next_x = now_x + d[0] 
      next_y = now_y + d[1]

      if next_x < 0 or next_y < 0 or next_x >= h or next_y >= w :
        continue
      if visited[next_x][next_y] : 
        continue
      if map[next_x][next_y] == 1 :
        q.append((next_x, next_y))
        visited[next_x][next_y] = True

while w != 0 and h != 0 :
  count = 0
  visited_island = [[False for _ in range(w)] for _ in range(h)]
  map_island = []
  for i in range(h) :
    map_island.append(list(map(int, input().split())))

  for x in range(h) :
    for y in range(w) :
      if not visited_island[x][y] and map_island[x][y] == 1 :
        dfs_island(map_island, visited_island, x, y)
        count += 1
      else : visited_island[x][y] = True
  print(count)
  w,h = map(int, input().split())