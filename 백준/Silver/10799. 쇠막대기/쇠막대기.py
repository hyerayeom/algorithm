# 10799
import sys 
from collections import deque
input = sys.stdin.readline

st = list(input().strip())
state = 0
count = 0
flag = False

for ch in st :
  if ch == '(' :
    state += 1
    flag = False
  else :
    state -= 1
    if flag :
      count += 1
    else :
      count += state
    flag = True

print(count)