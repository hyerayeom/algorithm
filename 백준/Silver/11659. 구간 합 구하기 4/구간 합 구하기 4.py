import sys
input = sys.stdin.readline

n,m = map(int, input().split())
nums = list(map(int, input().split()))
sum_nums = [0]
for i in range(n) :
  sum_nums.append(sum_nums[i]+nums[i])

for i in range(m) :
  start,end = map(int, input().split())
  print(sum_nums[end]-sum_nums[start-1])