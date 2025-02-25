import sys
input = sys.stdin.readline

n = int(input())
A = sorted(list(map(int,input().split())),reverse=True)
B = sorted(list(map(int,input().split())))

answer = 0
for i in range(n):
  answer += A[i]*B[i]
print(answer)