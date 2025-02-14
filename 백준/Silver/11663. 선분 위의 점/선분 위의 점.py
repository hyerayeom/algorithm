import sys
input = sys.stdin.readline

n,m = map(int, input().split())
spot = list(map(int, input().split()))
spot.sort()

for i in range(m):
  s,e = map(int, input().split())

  if s > spot[n-1] or e < spot[0]:
    print(0)
    continue

  #  가장 가까운 점 찾기기
  s1 = -1
  e1 = n-1
  while s1+1 < e1:
    mid = (s1+e1) // 2
    if spot[mid] < s:
      s1 = mid
    else:
      e1 = mid

  #  가장 먼 점 찾기기
  s2 = 0
  e2 = n
  while s2 < e2-1:
    mid = (s2+e2) // 2
    if spot[mid] > e:
      e2 = mid
    else:
      s2 = mid
  print(s2-e1+1)