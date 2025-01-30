from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int,input().split())
h = 100

maze = [0 for _ in range(h+1)]
visited = [0 for _ in range(h+1)]

ladder = {}
snake = {}
for _ in range(n):
  index,value = map(int, input().split())
  ladder[index] = value
for _ in range(m):
  index,value = map(int, input().split())
  ladder[index] = value

q = deque()
q.append(1)
while q:
  now = q.popleft()
  if now > h : break
  for i in range(1,7):
    next = now+i
    if next <= h and not visited[next]:
      if ladder.get(next):
        next = ladder[next]
      if snake.get(next):
        next = snake[next]
      if not visited[next]:
        visited[next] = 1
        maze[next] += maze[now]+1
        q.append(next)
print(maze[h])