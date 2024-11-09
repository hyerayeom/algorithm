import sys
input = sys.stdin.readline

n = int(input())

s = []
e = []

def hanoi(num, start, end, via) :
  if num == 1 :
    s.append(start)
    e.append(end)
  else :
    hanoi(num-1, start, via, end)
    s.append(start)
    e.append(end)
    hanoi(num-1, via, end, start)

hanoi(n,1,3,2)

count = len(s)
print(count)
for i in range(count) :
  print(s[i], e[i])