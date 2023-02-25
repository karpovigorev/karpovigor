print("Урок 3")
print("\nЗадание 1")
from random import randint
number = int(input('Введите размер списка '))
list = []
list2 = []

for i in range(number):
    list.append(randint(0, 9))

for i in range(len(list)):
    while i < len(list)/2 and number > len(list)/2:
        number = number - 1
        a = list[i] * list[number]
        list2.append(a)
        i += 1

print(list)
print(list2)


print("\nЗадание 2")
lst = [1.1, 1.2, 3.1, 5, 10.01]
new_lst = [round(i%1,2) for i in lst]
print(lst, '=>', max(new_lst) - min(new_lst))

print("\nЗадание 3")
a = int(input('Введите число '))
b = ''
while a > 0:
    b = str(a%2) + b
    a = a // 2
print(b)
print("\nЗадание 4")
n = int(input('Введите размер числа Фибоначчи '))
if n < 0: n = n*-1
f1 = f2 = 1
list1 = [f1, f2]
for i in range(2, n):
    f1,f2 = f2, f1 + f2
    list1.append(f2)
print(list1)
f1=f2=1
for i in range(-n, 1):
    f1,f2 = f2, f1 - f2
    list1.insert(0, f2)
print(list1)