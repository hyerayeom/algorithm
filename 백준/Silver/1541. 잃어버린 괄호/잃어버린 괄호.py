import sys
input = sys.stdin.readline

line = input().strip().split("-")

nums = []
for l in line :
  n = sum(map(int, l.split("+")))
  nums.append(n)

count = nums[0]
for i in range(1, len(nums)) :
  count -= nums[i]
print(count)
