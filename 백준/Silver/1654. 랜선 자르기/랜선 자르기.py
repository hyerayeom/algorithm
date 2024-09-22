# 1654
import sys
input = sys.stdin.readline

n,m = map(int,input().split())
lan = [int(input()) for _ in range(n)]

start = 1
end = 2**31

while start < end - 1 :
  mid = (start + end) // 2
  count = 0
  for i in lan :
    count += i//mid
  if count < m :
    end = mid
  else :
    start = mid

print(start)