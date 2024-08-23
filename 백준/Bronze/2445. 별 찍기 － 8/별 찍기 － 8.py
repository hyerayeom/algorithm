n = int(input())
answer = ""

for i in range(n) :
  answer += "*" * (i+1) + " " *  (2 * n - (2 * (i+1))) + "*" * (i+1)  + "\n"

for i in reversed(range(n-1)) :
  answer += "*" * (i+1) + " " *  (2 * n - (2 * (i+1))) + "*" * (i+1)  + "\n"
  
print(answer)