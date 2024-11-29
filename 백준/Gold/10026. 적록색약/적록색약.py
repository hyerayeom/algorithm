from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
paint = [list(input().strip()) for _ in range(n)]

directions = [(-1, 0), (1, 0), (0, 1), (0, -1)]

visited_1 = [[False for _ in range(n)] for _ in range(n)]
visited_2 = [[False for _ in range(n)] for _ in range(n)]

count_1 = 0
count_2 = 0

def color_area_1(color,x,y) :
  global visited_1
  global paint

  q = deque()
  q.append((x,y))

  while len(q) :
    now_x, now_y = q.popleft()
    for d in directions :
      next_x = now_x + d[0]
      next_y = now_y + d[1]

      if next_x < 0 or next_y < 0 or next_x >= n or next_y >= n :
        continue
      if visited_1[next_x][next_y] :
        continue
      if paint[next_x][next_y] == color :
        q.append((next_x,next_y))
        visited_1[next_x][next_y] = True

def color_area_2(color,x,y) :
  global visited_2
  global paint

  q = deque()
  q.append((x,y))

  while len(q) :
    now_x, now_y = q.popleft()
    for d in directions :
      next_x = now_x + d[0]
      next_y = now_y + d[1]

      if next_x < 0 or next_y < 0 or next_x >= n or next_y >= n :
        continue
      if visited_2[next_x][next_y] :
        continue
      if paint[next_x][next_y] == color :
        q.append((next_x,next_y))
        visited_2[next_x][next_y] = True

for i in range(n) :
  for j in range(n) :
    if not visited_1[i][j] :
      color_area_1(paint[i][j], i, j)
      count_1 += 1

for i in range(n) :
  for j in range(n) :
    if paint[i][j] == "R" :
      paint[i][j] = "G"
      
for i in range(n) :
  for j in range(n) :
    if not visited_2[i][j] :
      color_area_2(paint[i][j], i, j)
      count_2 += 1
print(count_1, count_2)