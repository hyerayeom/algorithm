import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**5)

n = 5
maze = [list(map(int,input().split())) for _ in range(n)]
directions = ((0,1),(0,-1),(1,0),(-1,0))
answer = []

def dfs(x,y,count,ans):
  if count == n+1:
    answer.append(ans)
    return
  for dx,dy in directions:
    next_x = x+dx
    next_y = y+dy
    if next_x < 0 or next_y < 0 or next_x >= n or next_y >= n:
      continue 
    next_count = count+1
    next_ans = ans + str(maze[next_x][next_y])

    dfs(next_x,next_y,next_count,next_ans)

for i in range(n):
  for j in range(n):
    dfs(i,j,0,"")

print(len(set(answer)))