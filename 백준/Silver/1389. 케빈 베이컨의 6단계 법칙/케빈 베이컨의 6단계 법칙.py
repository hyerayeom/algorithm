from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int, input().split())
graph = [[] for _ in range(n+1)]
for _ in range(m) :
  x,y = map(int, input().split())
  graph[x].append(y)
  graph[y].append(x)

min_count = {}

for i in range(n) :
  visited = [-1 for _ in range(n+1)]
  q = deque()
  index = i+1

  visited[index] += 1
  q.append(index)

  while q :
    now = q.popleft()
    for next in graph[now] :
      if visited[next] < 0 :
        visited[next] = visited[now] + 1
        q.append(next)
  min_count[index] = sum(visited[1:])

sorted_min_count = sorted(min_count.items(), key=lambda item:item[1])
print(sorted_min_count[0][0])