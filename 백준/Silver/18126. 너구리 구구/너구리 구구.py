from collections import deque
import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

n = int(input())
graph = [[] for _ in range(n+1)]
visited = [0 for _ in range(n+1)]
visited[1] = 1

for _ in range(n-1):
  a,b,c = map(int,input().split())
  graph[a].append((b,c))
  graph[b].append((a,c))

answer = list()
def dfs(x, depth, graph):
  now = graph[x]

  global answer
  answer.append(depth)
  for n in now:
    if visited[n[0]] : continue
    visited[n[0]] = 1
    dfs(n[0], depth+n[1], graph)
dfs(1,0, graph)
print(max(answer))