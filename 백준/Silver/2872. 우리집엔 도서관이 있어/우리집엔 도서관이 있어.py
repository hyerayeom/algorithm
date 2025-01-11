from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
nums = deque()

for _ in range(n) :
  nums.append(int(input()))
count = 0
while nums :
  if nums.pop() == n :
    n -= 1
  else :
    count += 1
print(count)