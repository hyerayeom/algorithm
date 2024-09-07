# 18258
import sys 
from collections import deque
input = sys.stdin.readline
n = int(input())
q = deque()

def command_func(command) :
  if command[0] == 'front' :
    print(q[0] if len(q) != 0 else -1 )
  elif command[0] == 'back':
    print( q[len(q)-1] if len(q) != 0 else -1 )
  elif command[0] == 'push':
    q.append(int(command[1]))
  elif command[0] == 'pop':
    delete = q.popleft() if len(q) != 0 else -1 
    print(delete)
  elif command[0] == 'size':
    print(len(q))
  elif command[0] == 'empty':
    print(int(len(q) == 0))

for i in range(n) :
  command = list(input().split())
  command_func(command)