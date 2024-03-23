import re

def fun(x):
    return 4 * x**2 - 7
f = '20 + 22 = 42'

s = re.split("\D+",f)
s = list(map(int,s))


for i in range(0, len(s)):
    s[i] = fun(s[i])

print(f"{s[0]} + {s[1]} = {s[2]}")
