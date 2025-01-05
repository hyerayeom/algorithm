import sys
input = sys.stdin.readline

n = int(input())
answer = input().split()
student_answer = input().split()

index = []  
for i in student_answer :
  index.append(answer.index(i))

count = 0
for i in range(len(index)) :
  for j in range(i+1, len(index)) :
    if index[i] < index[j] : 
      count += 1

print(f'{count}/{n*(n-1)//2}')
