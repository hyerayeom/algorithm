import sys
input = sys.stdin.readline

n = int(input())
card = list(map(int, input().split()))
m = int(input())
num = list(map(int, input().split()))

card.sort()
check = 0

for target in num :
  start = 0
  end = n
  while start < end-1 :
    mid = (start + end) // 2
    if card[mid] > target :
      end = mid
    else :
      start = mid
  if target == card[start] : 
    print(1,end=" ")
  else : 
    print(0,end=" ")
  check = start