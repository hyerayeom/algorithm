import sys

input = sys.stdin.readline

i1 = input().strip()
i2 = input().strip()
i3 = input().strip()
num = 0
if i1.isdigit() :
  i1 = int(i1)
  num = i1 + 3
elif i2.isdigit() :
  i2 = int(i2)  
  num = i2 + 2
elif i3.isdigit() :
  i3 = int(i3)
  num = i3 + 1

if num % 3 == 0 and num % 5 != 0 :
  print("Fizz")
elif num % 3 != 0 and num % 5 == 0 :
  print("Buzz")
elif num % 3 == 0 and num % 5 == 0 :
  print("FizzBuzz")
else :
  print(num)
