num = str(input())

r1 = int(num[0])
r2 = int(num[1])
i1 = int(num[2])
r3 = int(num[3])
i2 = int(num[4])
i3 = int(num[5])
i4 = int(num[6])

s1 = str(r1 ^ i1 ^ i2 ^ i4)
s2 = str(r2 ^ i1 ^ i3 ^ i4)
s3 = str(r3 ^ i2 ^ i3 ^ i4)

err = s3 + s2 + s1

match err:
    case "000":
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Ошибок не допущено. Сообщение = {out}")
    case "001":
        r1 = r1^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в r1. Сообщение = {out}")
    case "010":
        r2 = r2^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в r2. Сообщение = {out}")
    case "011":
        i1 = i1^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в i1. Сообщение = {out}")
    case "100":
        r3 = r3^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в r3. Сообщение = {out}")  
    case "101":
        i2 = i2^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в i2. Сообщение = {out}")   
    case "110":
        i3 = i3^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в i3. Сообщение = {out}")  
    case "111":
        i4 = i4^1
        out = str(i1) + str(i2) + str(i3) + str(i4)
        print(f"Была допущена ошибка в i4. Сообщение = {out}")            
    




