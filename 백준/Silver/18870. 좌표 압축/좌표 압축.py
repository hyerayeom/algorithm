import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
sorted_nums = sorted(set(nums))
count = {}

for i in range(len(sorted_nums)) :
  count[sorted_nums[i]] = i

for i in nums :
  print(count[i], end=" ")