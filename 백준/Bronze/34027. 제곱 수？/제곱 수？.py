import sys
input = sys.stdin.readline
 
perfect_squares = dict((i**2, i) for i in range(2**15))
 
test_case = int(input())
for _ in range(test_case):
  num = int(input())
  if(num in perfect_squares):
    print(1)
  else:
    print(0)