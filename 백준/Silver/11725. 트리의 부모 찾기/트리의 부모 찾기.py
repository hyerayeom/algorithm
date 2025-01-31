from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
graph = [[] for _ in range(n+1)]
for _ in range(n-1):
  x,y = map(int, input().split())
  graph[x].append(y)
  graph[y].append(x)

visited = [0 for _ in range(n+1)]
answer = {}

def bfs(x, graph, visited):
  q = deque()
  q.append(x)
  while q:
    parent = q.popleft()
    children = graph[parent]
    for child in children:
      if not visited[child]:
        answer[child] = parent
        visited[child] = 1
        q.append(child)

for i in range(1,n+1):
  if not visited[i]:
    bfs(i, graph, visited)

for i in range(1,n):
  print(answer[i+1])