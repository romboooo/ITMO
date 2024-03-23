import re

smile = ':-{('

strings = ['abcdefghijklmnop', 'gipso:-{(fila', ':-{(:-{(:-{(', 's', '52']

for string in strings:
    if re.findall(r'[:][-][{(]', string):
        print('смайлик :-{( в строке', string, ' встречается ', len(re.findall(r'[:][-][{(]', string)), 'раз(а)')
    else:
        print('смайлик :-{( не встречается в строке', string)
        