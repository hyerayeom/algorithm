import sys
input = sys.stdin.readline

n,k = map(int, input().split())
visited = [0,0] + [1 for _ in range(n-1)]

def check(x):
  if not x: return 1
  return 0

for i in range(2,n+1):
  if visited[i]:
    k -= 1
    if check(k):
      print(i)
      break

  for j in range(2*i,n+1,i):
    if visited[j]:
      visited[j] = 0
      k -= 1
      if check(k):
        print(j)