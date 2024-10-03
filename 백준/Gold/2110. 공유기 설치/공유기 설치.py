import sys
input = sys.stdin.readline

n,c = map(int, input().split())
home = [int(input()) for _ in range(n)]
home.sort()

start = 1
end = 10 ** 9 + 1

while start < end-1 :
  mid = (start + end) // 2
  count = 1
  now_x = 0
  for i in range(n-1) :
    if home[i + 1]-home[now_x] >= mid :
      count += 1
      now_x = i+1

  if count >= c : 
    start = mid
  else :
    end = mid

print(start)