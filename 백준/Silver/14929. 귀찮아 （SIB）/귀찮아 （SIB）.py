import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
nums_sum = sum(nums[1:])
answer = 0

for i in range(n-1):
  answer += nums[i] * nums_sum
  nums_sum -= nums[i+1]

print(answer)
