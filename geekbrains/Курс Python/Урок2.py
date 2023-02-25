print("Урок 2")
print("\nЗадание 1")
num = input("Введите число: ")
sum = 0
for a in num:
    if a.isdigit():
        sum += int(a)
print(f"Сумма {num} равна: ", sum)

print("\nЗадание 2")
num1 = int(input("Введите число: "))
sum1 = [1]
for i in range(1, num1):
    sum1.append((i+1) * sum1[i-1])
print(sum1)

print("\nЗадание 3")
num2 = int(input("Введите число: "))
sum2 = {}
for e in range(0, num2):
    sum2[e+1] = (1+(1/(e+1)))**(e+1)
print(sum2)

print("\nЗадание 4")
import os
from random import randint

def list(n):
    list = []
    for i in range(n):
        list.append(randint(-n, n))
    return list

n = int(input("Введите число: "))
numbers = list(n)
print(numbers)
current_directory = os.getcwd()
contents = os.listdir(current_directory)
x = open('file.txt' in contents, 'r')
print("Выберите число(порядковый номер)")
n1 = numbers[int(x.readline())]
print("Выберите второе число(порядковый номер)")
n2 = numbers[int(x.readline(2))]
result = n1 * n2

print(f"{n1} * {n2} = {result}")
