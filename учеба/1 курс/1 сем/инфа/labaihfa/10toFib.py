num = int(input("Введите число в 10-чной сс:"))

fib = [1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,
       2584,4181,6765,10946,17711,28657,46368,75025,121393,196418,317811,514229,832040,1346269]

for i in range(len(fib)):     
    if num <= fib[i]:
        len_new_num = i
        break

new_num = [0]*len_new_num
new_num[0] = 1

new_fib = fib[:len_new_num]
new_fib = new_fib[::-1]

count = 0

while num != 0:
    if new_fib[count] <= num:
        new_num[count] = 1
        num -= new_fib[count]
    count += 1    

print(*new_num,sep='')
        