print("Урок 1")
print("\nЗадание 1")
day = int(input("Введите день недели в цифрах:"))
if day < 1 or day > 7:
    print("Вы ввели неверное число!")
elif day > 5:
    print("Выходной")
else:
    print("Будни")

print("\nЗадание 2")
for x in range(2):
    for y in range(2):
        for z in range(2):
            if not (x or y or z) == (not x and not y and not z):
                print(f'Утверждение ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z истинно при x = {x}, y={y}, z={z}')
print("\nЗадание 3")
x = int(input('Введите число x≠0:'))
y = int(input('Введите число y≠0:'))
if x == 0 and y == 0:
    print('Вы не услышали условия')
elif x > 0 and y > 0:
    print(
        f'При координатах x = {x} и y = {y} ваша точка находится в плоскости 1 ')
elif x < 0 and y > 0:
    print(
        f'При координатах x = {x} и y = {y} ваша точка находится в плоскости 2 ')
elif x < 0 and y < 0:
    print(
        f'При координатах x = {x} и y = {y} ваша точка находится в плоскости 3 ')
elif x > 0 and y < 0:
    print(
        f'При координатах x = {x} и y = {y} ваша точка находится в плоскости 4 ')
print("\nЗадание 4")
a = int(input('Введите номер четверти в которой бы хотели узнать диапозон возможных координат: '))
if a == 1:
    print('В первой четверти - x > 0 y > 0')
elif a == 2:
    print('Во второй четверти - x < 0 y > 0')
elif a == 3:
    print('В третьей четверти - x < 0 y < 0')
elif a == 4:
    print('В четвертой четверти - x > 0 y < 0')
else:
    print('Такой четверти нет :(')
print("\nЗадание 5")
ax = float(input('Введите координаты точки a по оси x:'))
ay = float(input('Введите координаты точки a по оси y:'))
bx = float(input('Введите координаты точки b по оси x:'))
by = float(input('Введите координаты точки b по оси y:'))

import math
distans = math.sqrt((ax-bx)**2+(ay-by)**2)
print(f'Растояние между точкой A до точки B = {distans}' )
