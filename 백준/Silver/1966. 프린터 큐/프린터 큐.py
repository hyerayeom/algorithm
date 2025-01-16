import sys
input = sys.stdin.readline

test_case = int(input())
for _ in range(test_case) :
  n,m = map(int, input().split())
  nums = list(map(int, input().split()))
  paper = {}
  pri = {}

  for i in range(n) :
    paper[i] = nums[i]
    if pri.get(nums[i]) :
      pri[nums[i]] += 1
    else :
      pri[nums[i]] = 1
  
  keys = list(paper.keys())
  flag = 0
  count = 1
  priority = dict(sorted(pri.items(), reverse=True))
  
  for k in priority.keys() :
    v = priority[k]
    if flag : break
    while v > 0 :
      if paper[keys[0]] == k :
        v -= 1
        if keys[0] == m :
          flag = 1
          break
        keys.pop(0)
        count += 1
      else :
        keys.append(keys.pop(0))
        
  print(count)
  