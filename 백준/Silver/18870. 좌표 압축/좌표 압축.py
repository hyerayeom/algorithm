import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
sorted_nums = sorted(nums)
count = {sorted_nums[0]:0}

for i in range(1,n) :
  if sorted_nums[i] == sorted_nums[i-1] :
    continue
  count[sorted_nums[i]] = count[sorted_nums[i-1]] + 1

answer =[]
for i in nums :
  answer.append(count[i])
print(*answer)