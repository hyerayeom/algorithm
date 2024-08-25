n = int(input())
m = int(input())

count = 0

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for i in range (m) :
  a,b = map(int,input().split())
  graph[a].append(b)
  graph[b].append(a)

# print("graph", graph)

def DFS(node) : 
  global count
  for i in graph[node]:
    if(visited[i] == False) :
      visited[i] = True
      count += 1
      # print(i)
      DFS(i)
visited[1] = True
DFS(1)
print(count)
