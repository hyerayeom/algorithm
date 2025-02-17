from collections import deque
import sys
input = sys.stdin.readline

def f(oper, nums):
  flag = False
  for op in oper:
    if op =="R":
      flag = not flag
    else:
      if len(nums) == 0: 
        return "error"
      nums.pop() if flag else nums.popleft()
  if len(nums) == 0: 
    return "[]"  
  answer = "["
  if flag:
    while nums:
      answer += (nums.pop())+","
  else:
    while nums:
      answer += (nums.popleft())+","
  answer = answer[:len(answer)-1] + "]"
  return answer

test_case = int(input())
for _ in range(test_case):
  oper = list(input().strip())
  n = int(input())
  
  num_str = input().strip()
  num_split = num_str[1:len(num_str)-1].split(",")
  nums = deque()
  if n != 0:
    for s in num_split:
      nums.append(s)

  print(f(oper, nums))