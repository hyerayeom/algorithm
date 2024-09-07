n = int(input())
word = [input() for _ in range(n)]

sorted_word = sorted(list(set(word)))
sorted_word.sort(key=len)

for i in sorted_word:
  print(i)
