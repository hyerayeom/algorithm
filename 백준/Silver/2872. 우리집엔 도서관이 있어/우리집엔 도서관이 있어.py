
import sys
input = sys.stdin.readline

n = int(input())
books = []
count = 0

for _ in range(n) :
  books.append(int(input()))

while books :
  if books.pop() == n :
    n -= 1
  else :
    count += 1
print(count)