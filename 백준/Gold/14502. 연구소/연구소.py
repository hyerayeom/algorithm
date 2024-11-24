import sys
from collections import deque
from itertools import combinations
import copy

input = sys.stdin.readline
n, m = map(int, input().split())
lap = []
save_zone = deque()
virus_zone = deque()

max_save = 0

for i in range(n) :
  inp = list(map(int, input().split()))
  lap.append(inp)
  for j in range(m) :
    if lap[i][j] == 0 : save_zone.append((i,j))
    if lap[i][j] == 2 : virus_zone.append((i,j))

walls = deque(combinations(save_zone, 3))

directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
def virus(lap) :
  q = copy.deepcopy(virus_zone)
  while len(q) :
    now_x, now_y = q.popleft()
    for dx, dy in directions :
      next_x = now_x + dx
      next_y = now_y + dy

      if next_x < 0 or next_y < 0 or next_x >= n or next_y >= m :
        continue
      if lap[next_x][next_y] == 0 :
        lap[next_x][next_y] = 2
        q.append((next_x, next_y))
  
  count = 0
  for i in lap :
    count += i.count(0)
  return count

while len(walls) != 0 :
  change_walls = walls.pop()
  test_lap = copy.deepcopy(lap)

  for w in change_walls :
    test_lap[w[0]][w[1]] = 1
    
  max_save = max(virus(test_lap), max_save)


print(max_save)
  