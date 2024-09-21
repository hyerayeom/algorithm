import sys
input = sys.stdin.readline

n = int(input())
card = list(map(int, input().split()))
m = int(input())
num = list(map(int, input().split()))

d = dict()

for i in card :
  if i in d.keys() :
    d[i] += 1
  else :
    d[i] = 1
    
card = list(set(card))
card.sort()

for target in num :
  start = 0
  end = len(card)
  while start < end-1 :
    mid = (start + end) // 2
    if card[mid] > target :
      end = mid
    else :
      start = mid
  if target == card[start] : 
    print(d[target], end=" ")
  else : 
    print(0,end=" ")