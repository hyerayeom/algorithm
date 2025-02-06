import sys
input = sys.stdin.readline

n,m = map(int, input().split())
maks = [int(input()) for _ in range(n)]

start = 0
end = 2**31-1

while start < end-1:
  mid  = (start+end) // 2
  count = 0
  for mak in maks:
    count += mak // mid
  if count >= m:
    start = mid
  else:
    end = mid
print(start)