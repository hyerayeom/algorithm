import sys
input = sys.stdin.readline

n = int(input())
candy = list(map(int, input().split()))

max_count = 0
left = 0
count_candy = {}
candy_type = 0

for right in range(n):
  now = candy[right]
  if now in count_candy:
    count_candy[now] += 1
  else:
    count_candy[now] = 1
    candy_type += 1
  
  while candy_type > 2:
    count_candy[candy[left]] -= 1
    if count_candy[candy[left]] == 0:
      del count_candy[candy[left]]
      candy_type -= 1
    left += 1
  max_count = max(max_count, right-left+1)

print(max_count)