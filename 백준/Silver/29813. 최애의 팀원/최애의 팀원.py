from collections import deque
import sys

input = sys.stdin.readline 

n = int(input())
student = deque()

for _ in range(n) :
  name,num = input().split()
  student.append((name,int(num)))

while len(student) > 1 :
  now_name, now_num = student.popleft()
  for _ in range(now_num-1) : 
    student.append(student.popleft())
  student.popleft()
print(student[0][0])