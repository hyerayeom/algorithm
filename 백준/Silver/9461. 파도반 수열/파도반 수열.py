import sys
input = sys.stdin.readline

test_case = int(input())
nums = [int(input()) for _ in range(test_case)]
max_num = max(nums)

memo = {0:0,1:1,2:1,3:1,4:2,5:2}

def f(n, memo) :
  memo[n] = memo[n-1] + memo[n-5]

for i in range(6, max_num+1) :
  f(i, memo)

for i in nums :
  print(memo[i])