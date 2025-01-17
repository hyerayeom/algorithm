import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
nums.sort()
count = [0]
for i in range(n) :
  count.append(nums[i]+count[i])
print(sum(count))