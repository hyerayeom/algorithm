import sys
from itertools import combinations

input = sys.stdin.readline
dwarf = []
for i in range(9) :
  dwarf.append(int(input()))

candidate = list(combinations(dwarf, 7))
for i in candidate :
  if sum(i) == 100 :
    answer = list(i)
    answer.sort()
    for j in answer :
      print(j)
    break