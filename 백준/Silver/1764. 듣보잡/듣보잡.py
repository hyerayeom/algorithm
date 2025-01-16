import sys
input = sys.stdin.readline

n,m = map(int, input().split())
not_listen = {}
count = 0

for i in range(n) :
  not_listen[input().strip()] = 1
  
names = []
for i in range(m) :
  not_meet = input().strip()
  if not_listen.get(not_meet) :
    names.append(not_meet)
names.sort()
print(len(names))
for name in names :
  print(name)