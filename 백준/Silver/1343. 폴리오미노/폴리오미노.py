import sys
input = sys.stdin.readline

line = input().strip()
answer = ""
strA = "AAAA"
strB = "B"

count = 0
for l in line :
  if l == "X" : 
    count += 1
  else :
    if count % 2 : 
      answer = "-1"
      break
    if count != 0 :
      answer += strA*(count//4)
      answer += strB*(count%4)
      count = 0
    answer += "."
    
if count != 0 :
  if count % 2 : 
    answer = "-1"
  else :
    answer += strA*(count//4)
    answer += strB*(count%4)    
print(answer)