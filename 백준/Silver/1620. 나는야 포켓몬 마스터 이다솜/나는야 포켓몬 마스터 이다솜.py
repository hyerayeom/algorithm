import sys
input = sys.stdin.readline

n,m = map(int, input().split())
pokemon_k = {}
pokemon_v = {}

for i in range(n) :
  inp = input().strip()
  pokemon_k[inp] = i+1
  pokemon_v[i+1] = inp

search = [input().strip() for _ in range(m)]

for s in search :
  if s.isdigit() :
    print(pokemon_v[int(s)])
  else :
    print(pokemon_k[s])