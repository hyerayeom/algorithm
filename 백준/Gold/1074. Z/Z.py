import sys
input = sys.stdin.readline

n,r,c = map(int, input().split())
count = 0

while n > 0 :
  n -= 1
  h = 2 ** n

  if r < h and c >= h : # 1
    c -= h
    count += h * h
  elif r >= h and c < h : # 3
    r -= h
    count += h * h * 2

  elif r >= h and c >= h : # 4
    c -= h
    r -= h
    count += h * h * 3
print(count)