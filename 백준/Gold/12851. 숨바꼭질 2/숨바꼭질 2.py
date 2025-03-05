from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
max_spot = n+m+1 

q = deque()
q.append(n)
visited = [-1 for _ in range(max_spot + 1)]
matching = [0 for _ in range(max_spot + 1)]
visited[n] = 0
matching[n] = 1

while q:
    now = q.popleft()
    move = [now + 1, now - 1, now * 2]
    for next in move:
        if next < 0 or next > max_spot:
            continue
        if visited[next] == -1:
            visited[next] = visited[now] + 1
            matching[next] = matching[now]
            q.append(next)
        elif visited[next] == visited[now] + 1:  
            matching[next] += matching[now]

print(visited[m])
print(matching[m])
