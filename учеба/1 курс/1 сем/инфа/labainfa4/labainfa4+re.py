import re
import time

input = open("labainfa4.txt", 'r', encoding='utf-8')
output = open('yml2.txt', 'w', encoding='utf-8')
start_time = time.perf_counter()

strings = input.read().split('\n')
input.close()
for i in range(len(strings)):
    if ':' in strings[i]:
        strings[i] = re.sub('[{}"",]', '', strings[i])
        output.write('\n')
        output.write(strings[i])
    else:
        continue

print(f"t = {time.perf_counter() - start_time}")   
output.close()
