# # 4344
n = int(input())
for i in range(n) :
  count = 0
  score = [int (i) for i in input().split()]
  average = (sum(score) - score[0]) / (score[0])
  for j in score[1:] :
    if j > average :
      count += 1

  print("{:.3f}%".format(count/(score[0]) * 100 , 3))