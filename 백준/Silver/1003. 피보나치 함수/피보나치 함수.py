import sys
input = sys.stdin.readline

test_case = int(input())
nums = [int(input()) for _ in range(test_case)]
max_num = max(nums)

memo = [[1,0], [0,1]]

for i in range(2, max_num+1) :
  a0, a1 = memo[i-1]
  b0, b1 = memo[i-2]
  memo.append([a0+b0, a1+b1])

for i in nums :
  a,b = memo[i]
  print(a,b)