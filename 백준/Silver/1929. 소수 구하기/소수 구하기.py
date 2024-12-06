import sys

input = sys.stdin.readline

m,n = map(int, input().split())
prime = [False, False] + [True for _ in range(n-1)]

for i in range(2, n+1) :
  if prime[i] :
    for x in range(i*2, n+1, i) :
      prime[x] = False

for i in range(m,n+1) :
  if prime[i] :
    print(i)