# 10845
import sys
import queue
input = sys.stdin.readline

n = int(input())
q = list()

for i in range(n) :
  inp = input().split()
  command = inp[0]

  if(command == "push") :
    q.append(inp[1])
  elif(command == "pop") :
    if len(q) > 0 : print(q.pop(0))
    else : print("-1")
  elif(command == "front"):
    print(q[0] if len(q) != 0 else -1)
  elif(command == "back"):
    idx = len(q) - 1
    print(q[idx] if len(q) != 0 else -1)
  elif(command == "size"):
    print(len(q))
  elif(command == "empty"):
    print("1" if len(q) == 0 else "0")