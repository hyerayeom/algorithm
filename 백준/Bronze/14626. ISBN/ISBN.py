import sys
input = sys.stdin.readline

def main():
  isbn = input().strip()
  flag = 0
  nums_sum = 0
  for i in range(len(isbn)):
    if isbn[i] == "*":
      flag = i%2
    else:
      nums_sum += int(isbn[i]) if i%2 == 0 else int(isbn[i])*3
  nums_sum %= 10

  if not nums_sum:
    print(0)
  elif not flag:
    print(10-nums_sum)
  else:
    nums_sum = 10-nums_sum
    while True:
      if not nums_sum % 3:
        print(nums_sum // 3)
        break
      nums_sum += 10

if __name__ == "__main__":
  main()
