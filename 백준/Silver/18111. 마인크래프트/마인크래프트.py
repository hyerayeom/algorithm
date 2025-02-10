import sys
input = sys.stdin.readline

n,m,b = map(int, input().split())

floor = {}
for _ in range(n):
  line = list(map(int, input().split()))
  for l in line:
    if floor.get(l): floor[l] += 1
    else: floor[l] = 1

sorted_floor = sorted(floor.items())

min_height = sorted_floor[0][0]
max_height = sorted_floor[len(sorted_floor)-1][0]

min_sec = 10**8
max_block = 0

for h in range(min_height, max_height+1):
  sec = 0
  block_count = b
  for height,count in sorted_floor:
    if h < height: # cut
      sec += (height-h)*count*2 
      block_count += (height-h)*count
    elif h > height: # add
      block_count -= (h-height)*count
      sec += (h-height)*count
  
  if block_count < 0 : continue
  
  if min_sec > sec:
    min_sec = sec
    max_block = h
  elif min_sec == sec:
    max_block = max(max_block, h)

print(min_sec, max_block)