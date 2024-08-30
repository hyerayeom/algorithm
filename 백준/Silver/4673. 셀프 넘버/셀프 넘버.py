n = 10000
check = [False] * (n+1)

for i in range(n+1) :
  j = i+1
  x = j
  while True :
    if(j == 0) :
      break
    x += j % 10
    j //= 10
  if(x <= n):
    check[x] = True

for idx, i in enumerate(check[1:], start=1):
    if i == False:
        print(idx)