import sys
input = sys.stdin.readline

test_case = int(input())
for _ in range(test_case):
  m,n,x,y = map(int, input().split())
  answer = -1
  
  while x <= m * n: 
    if (x-y) % n == 0:
      answer = x
      break
    x += m
  print(answer)