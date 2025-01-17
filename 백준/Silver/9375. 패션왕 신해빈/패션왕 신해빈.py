import sys
input = sys.stdin.readline

test_case = int(input())
for _ in range(test_case) :
  wear = {}
  n = int(input())
  for _ in range(n) :
    name, type = input().split()
    if wear.get(type) : wear[type] += 1
    else : wear[type] = 1
  count = 1
  for v in wear.values() :
    count *= v+1
  print(count-1)