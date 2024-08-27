n = int(input())

for i in range(n) :
  temp = list(input())
  count = 0
  add = 0
  for i in temp :
    if i == 'O':
      add += 1
      count += add
    else :
      add = 0
  print(count)