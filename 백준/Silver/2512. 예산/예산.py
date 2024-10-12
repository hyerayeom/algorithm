import sys
input = sys.stdin.readline

n = int(input())
cost = list(map(int, input().split()))
m = int(input())

start = 1
end = max(cost) + 1

while (start + 1 < end) :
  mid = (start + end) // 2
  check = 0
  for i in cost :
    check += mid if(i > mid) else i

  if (check > m) :
    end = mid
  else :
    start = mid

print(start)