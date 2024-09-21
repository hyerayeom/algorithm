import sys
sys.setrecursionlimit(10**7)
input = sys.stdin.readline

n=int(input())
num1 = list(map(int, input().split()))
m=int(input())
num2 = list(map(int, input().split()))

num1.sort()

def binary_search(arr, start, end, target) :
  if start >= end - 1 : return arr[start]
  center = (start + end) // 2
  if arr[center] > target :
    return binary_search(arr, start, center, target)
  else :
    return binary_search(arr, center, end, target)


for i in num2 :
  result = binary_search(num1,0,len(num1), i)
  if i == result :
    print(1)
  else :
    print(0)
