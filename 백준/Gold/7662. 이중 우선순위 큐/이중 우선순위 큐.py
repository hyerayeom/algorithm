import heapq
import sys
input = sys.stdin.readline

def found_heap(n):
  min_heap = []
  max_heap = []
  index = {}
  for i in range(n):
    op, num = input().strip().split()
    if op == "I": # I(입력)인 경우
      heapq.heappush(max_heap, (-int(num),i))
      heapq.heappush(min_heap, (int(num), i))
    else: # D(삭제)인 경우
      now_heap = max_heap if int(num) == 1 else min_heap
      while len(now_heap) > 0:
        v,i = heapq.heappop(now_heap)
        if not index.get(i):
          index[i] = 1
          break

  max_num = ""
  min_num = ""
  while len(max_heap):
    v,i = heapq.heappop(max_heap)
    if not index.get(i):
      max_num = -int(v)
      break
  while len(min_heap):
    v,i = heapq.heappop(min_heap)
    if not index.get(i):
      min_num = int(v)
      break
  if max_num == "" or min_num == "": print("EMPTY")
  else: print(max_num,min_num)

test_case = int(input())
for _ in range(test_case):
  n = int(input())
  found_heap(n)