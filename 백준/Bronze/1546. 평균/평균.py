n = int(input())

score = [int (i) for i in input().split()]
m = max(score)
sum = 0
for j in score :
  sum += j/m*100
print(sum/n)