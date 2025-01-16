import sys
input = sys.stdin.readline

def round(num) :
  if num - int(num) >= 0.5 :
    return int(num) + 1
  else : return int(num)

n = int(input())
if n == 0 :
  print(0)
else :
  nums = [int(input()) for _ in range(n)]
  nums.sort()

  a = round(n * 15/100)
  answer = round(sum(nums[a:n-a]) / (n-a*2))
  print(answer)