import sys
input = sys.stdin.readline

line = input().strip()

line = line.replace("XXXX", "AAAA")
line = line.replace("XX", "BB")

for l in line :
  if l == "X" :
    line = "-1"

print(line)