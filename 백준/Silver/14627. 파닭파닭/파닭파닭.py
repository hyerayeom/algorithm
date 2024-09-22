import sys
input = sys.stdin.readline

n,m = map(int, input().split())

pa = [int(input()) for _ in range(n)]

start = 1
end = int(1e9 + 1)

while start < end - 1 :
  mid = (start + end) // 2
  count = 0
  for i in pa :
    count += i // mid
  if count < m :
    end = mid
  else :
    start = mid

result = sum(pa) - m*start
print(result)