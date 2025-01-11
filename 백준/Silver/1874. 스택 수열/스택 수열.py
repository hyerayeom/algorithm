import sys
input = sys.stdin.readline

n = int(input())
log = []
stack = []
index = 1
flag = False

for _ in range(n) :
  target = int(input())
  while index <= target :
    stack.append(index)
    index += 1
    log.append("+")
  
  if stack.pop() == target :
    log.append("-")
  else :
    flag = True
    break

if flag : 
  print("NO")
else : 
  for l in log: print(l)