import sys
input = sys.stdin.readline

n,m = map(int, input().split())
video = list(map(int, input().split()))

start = max(video) - 1
end = sum(video)

while start + 1 < end :
  mid = (start + end) // 2
  count = 0
  save = 1
  for i in video :
    if count + i > mid :
      count = 0
      save += 1
    count += i
  if save > m :
    start = mid
  else :
    end = mid

print(end)