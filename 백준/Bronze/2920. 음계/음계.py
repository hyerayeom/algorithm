# 2920
import sys 
input = sys.stdin.readline

num = (input().split())
sorted1 = sorted(num)
sorted2 = sorted(num, reverse=True)

if num == sorted1 :
  print("ascending")
elif num == sorted2 :
  print("descending")
else :
  print("mixed")