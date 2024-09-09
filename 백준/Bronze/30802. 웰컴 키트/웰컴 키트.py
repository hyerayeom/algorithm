# 30802
import sys
input = sys.stdin.readline

n = int(input())
order = list(map(int, input().split()))
t,p = input().split()
t = int(t)
p = int(p)

countT = 0

for i in order :
  countT += i//t + (1 if i%t > 0 else 0)
print(countT)
print(n//p, n%p)
