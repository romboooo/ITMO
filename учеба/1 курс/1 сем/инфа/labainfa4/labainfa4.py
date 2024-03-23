# import time

# input = open("labainfa4.txt", 'r', encoding='utf-8')
# output = open('yml.txt', 'w', encoding='utf-8')
# start_time = time.perf_counter()

# strings = input.read().split('\n')
# input.close()
# for i in range(len(strings)):
#     if ':' in strings[i]:
#         strings[i] = strings[i].replace('[', '')
#         strings[i] = strings[i].replace('{', '')
#         strings[i] = strings[i].replace('}', '')
#         strings[i] = strings[i].replace('"', '')
#         strings[i] = strings[i].replace(']', '')
#         output.write('\n')
#         output.write(strings[i])
#     else:
#         continue

# print(f"t = {time.perf_counter() - start_time}")    
# output.close()

print(2%40)