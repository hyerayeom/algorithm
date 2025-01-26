import sys
input = sys.stdin.readline

while True :
  n,m = map(int, input().split())
  if n == m == 0 : break
  print("Yes") if n>m else print("No")