import sys
input = sys.stdin.readline

alphabet = [0 for _ in range(26)]
for w in input().strip():
  alphabet[ord(w)-97] += 1

for a in alphabet:
  print(a,end=" ")