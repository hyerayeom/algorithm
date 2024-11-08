import sys
input = sys.stdin.readline

n = int(input())

fibo_sum = [-1] * (n+1)
fibo_sum[0] = 0
fibo_sum[1] = 1

def fibonacci(x) :
  i = 2
  while i <= x :
    fibo_sum[i] = fibo_sum[i-2] + fibo_sum[i-1]
    i += 1

fibonacci(n)

print(fibo_sum[n])