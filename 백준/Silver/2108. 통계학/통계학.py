import sys
input = sys.stdin.readline

n = int(input())
nums = [int(input()) for _ in range(n)]
nums.sort()

def count_mod(nums) :
  check = {}
  for i in nums :
    if check.get(i) :
      check[i] += 1
    else :
      check[i] = 1
  sorted_check = sorted(check.items(), key=lambda item:item[1], reverse=True)
  min_k, min_v = sorted_check[0]
  indexs =[]
  for k,v in sorted_check :
    if v != min_v : break
    indexs.append(k)
  indexs.sort()
  if len(indexs) > 1 : return indexs[1]
  else : return indexs[0]
  
avg = round(sum(nums) / n)
mid = nums[n//2] if n != 1 else nums[0]
mod = count_mod(nums)
ranges = 0 if n == 1 else nums[n-1]-nums[0]

print(avg)
print(mid)
print(mod)
print(ranges)