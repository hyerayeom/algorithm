from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
paper = [list(map(int, input().split())) for _ in range(n)]
visited = [[0 for _ in range(n)] for _ in range(n)]
count = [0,0]
next_q = deque()
next_q.append((0,0,n))

def check(x,y,n) :
  global next_q
  global paper
  for i in range(n) :
    for j in range(n) :
      if paper[x+i][y+j] != paper[x][y] :
        next_n = n//2
        next_q.append((x,y,next_n))
        next_q.append((x+next_n,y,next_n))
        next_q.append((x,y+next_n,next_n))
        next_q.append((x+next_n,y+next_n,next_n))
        return
  if paper[x][y] : count[1] += 1
  else : count[0] += 1

while next_q :
  a = next_q.pop()
  check(a[0],a[1],a[2])

print(count[0])
print(count[1])