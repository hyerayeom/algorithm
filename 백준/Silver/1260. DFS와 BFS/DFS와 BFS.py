n,m,v = map(int,input().split())

gragp = [[] for _ in range(n+1)]

for i in range(m) :
  x,y = map(int,input().split())
  gragp[x].append(y)
  gragp[y].append(x)

for i in gragp :
  i.sort()

# print(gragp)

answer_dfs = [v]
answer_bfs = [v]
visited_dfs = [False] * (n+1)
visited_bfs = [False] * (n+1)

def dfs(node) :
  global answer_dfs
  
  for i in gragp[node] : 
    if (visited_dfs[i] == False) :
      visited_dfs[i] = True
      answer_dfs.append(i)
      dfs(i)

def bfs(node) :
  global answer_bfs
  queue = [node]

  while queue :
    x = queue.pop(0)
    for i in gragp[x]:
      if (visited_bfs[i] == False) : 
        queue.append(i)
        visited_bfs[i] = True
        answer_bfs.append(i)

visited_dfs[v] = True
dfs(v)

visited_bfs[v] = True
bfs(v)

print(*answer_dfs)
print(*answer_bfs)