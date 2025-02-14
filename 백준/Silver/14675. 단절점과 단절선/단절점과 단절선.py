import sys
input = sys.stdin.readline

n = int(input())
graph = [[] for _ in range(n+1)]

for _ in range(n-1):
  x,y = map(int, input().split())
  graph[x].append(y)
  graph[y].append(x)

q = int(input())
for _ in range(q):
  t,k = map(int,input().split())
  if t == 2:
    print("yes")
  else:
    print("no" if len(graph[k]) == 1 else "yes")