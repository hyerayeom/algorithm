import sys
input = sys.stdin.readline

n,m = map(int, input().split())
tree = list(map(int, input().split()))

start = 0
end = 10 ** 9 + 1

while start < end - 1 :
  mid = (start + end) // 2
  l = 0
  for i in tree :
    l += i - mid if(i - mid > 0) else 0
  if l < m :
    end = mid
  else :
    start = mid
print(start)