import sys
input = sys.stdin.readline

n,m = map(int, input().split())
scanner = [int(input()) for _ in range(n)]
scanner.sort()

start = 0
end = scanner[n-1]*m

while start < end-1:
  mid = (start+end) // 2
  count = 0
  for s in scanner:
    count += mid // s
  
  if count < m:
    start = mid
  else:
    end = mid
print(end)
