import sys
input = sys.stdin.readline

# 풍선 요청 m = 10**6
# 풍선 제작 a = 10**6
# 최악 10**12
# log 10**12 = log 2**40 = 40

n,m = map(int,input().split())
minutes = list(map(int, input().split()))
minutes.sort()

start = 0
end = 10**12

while start < end-1:
  mid = (start+end) // 2
  count = 0
  for minute in minutes:
    count += mid // minute
  
  if count < m:
    start = mid
  else:
    end = mid
print(end)
