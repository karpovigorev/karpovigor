print("Урок 5")
print("\nЗадание 1")
from encodings import utf_8

with open("words.txt", encoding='utf_8') as fin:
    for line in fin:
        words = line.split()
        for word in words:
            if 'абв' in word:
                words.remove(word)
        sentence = " ".join(words)
        print(sentence)
print("\nЗадание 2")
from random import randint

candies = 150
print(f'{candies} всего конфет')
count = randint(1, 2)
while candies > 0:
    count += 1
    if count % 2 == 0:
        if count == 2:
            print('ходит бот')
            quantity = 20
            print(f'конфет изымаете бот {quantity}')
        else:
            print('ходит бот')
            quantity = 29 - quantity
            print(f'конфет изымаете бот {quantity}')
    else:
        print('ходит игрок')
        quantity = int(input('Введите число конфет которое изымаете - '))
    if 0 < quantity < 29:
        candies -= quantity
        print(f'конфет осталось - {candies}')
    else:
        print('Вы ввели некоректное кол-во конфет, введите число от 1 до 28')
        count -= 1

if count % 2 == 0:
    print('победил бот')
else:
    print('победил игрок')
print("\nЗадание 3")
doska = list(range(1,10))

def draw_board(board):

 for i in range(3):
     print ("|", doska[0+i*3], "|", doska[1+i*3], "|",doska[2+i*3], "|")

def stavim_hod(hod):
 valid = False
 while not valid:
     otvet = input("Введите номер клетки куда поставить значение " + hod+"? ")
     otv = int(otvet)
     if otv >= 1 and otv <= 9:
         if (str(doska[otv-1]) not in "XO"):
             doska[otv-1] = hod
             valid = True
         else:
             print ("Эта клетка занята")
def kto_viigral(doska):
 pobeda = ((0,1,2),(3,4,5),(6,7,8),(0,3,6),(1,4,7),(2,5,8),(0,4,8),(2,4,6))
 for x in pobeda:
     if doska[x[0]] == doska[x[1]] == doska[x[2]]:
         return doska[x[0]]
 return False

def igra(doska):
 count = 0
 win = False
 while not win:
     draw_board(doska)
     if count % 2 == 0:
         stavim_hod("X")
     else:
         stavim_hod("O")
     count += 1
     if count > 4:
         m = kto_viigral(doska)
         if m:
             print (m, "Победил!")
             win = True
             break
     if count == 9:
         print ("Победила дружба!")
         break
 draw_board(doska)

igra(doska)
print("\nЗадание 4")
def Compression(text): #алгоритм сжатия
    compresdata = ''

    i = 0
    while i < len(text):
        count = 1
        while i + 1 < len(text) and text[i] == text[i + 1]:
            count += 1
            i += 1
        compresdata += str(count) + text[i]
        i += 1
    
    return compresdata


def Recovery(text): #алгоритм восстановления
    datarecovery = ''

    i = 0
    while i < len(text):
        datarecovery += str(text[i+1]) * int(text[i])
        i+=2
    
    return datarecovery


with open('Text1.txt', 'r') as t1:
    t1 = t1.read()    

with open('Text2.txt', 'w+') as t2:
    t2.write(Compression(t1))
    t2.seek(0)                     #возврат курсора на начало строки
    t2 = t2.read()
 
with open('Text3.txt', 'w') as t3:
    t3.write(Recovery(t2))