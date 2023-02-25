print("Урок 7")
def Insert_Numbers():
    # Function invite user for insert two komplex numbers and operation between it 
    print('Type of complex number: a + bi\n')
    user_komplex1 = input('Insert first complex number: ')
    user_komplex2 = input('Insert second complex number: ')
    operation = input('What do you want to do with that? (+, -, *, / are available only)')
    with open('results.txt', 'a') as data:
        data.write(f'({user_komplex1}){operation}({user_komplex2}) = ')
    return [user_komplex1, user_komplex2, operation]

def Take_Rational_Part(user_number):
    # Function return rational part from komplex
    rational_part = []
    for k in range(0, len(user_number)):
        if user_number[k] != ' ':
            rational_part.append(user_number[k])
        else:
            break
    rational_part = float(''.join(rational_part))
    return rational_part

def Take_Imaginary_Part(user_number):
    # Function return imaginary part
    imaginary_part = []
    for i in range(0, len(user_number)):
        if user_number[i] == 'i':
            while user_number[i] != ' ':
                imaginary_part.insert(0,user_number[i - 1])
                i-= 1
    imaginary_part.pop(0)
    imaginary_part = float(''.join(imaginary_part))
    return imaginary_part

def Take_Symbol(user_number):
    #Function return - or + between rational and imaginary parts
    symbol = []
    for l in range(0, len(user_number)):
        if user_number[l] == '-' and l !=0 or user_number[l] == '+' and l != 0:
            symbol.append(user_number[l])
    symbol = ''.join(symbol)
    return symbol

def Addition(r1, s1, i1, r2, s2, i2):
    # Function add two komplex numbers
    result = []
    result.append(r1+r2)
    if s1 == '+' and s2 == '+':
        result.append(i1+i2)
    elif s1 == '+' and s2 == '-':
        result.append(i1-i2)
    elif s1 == '-' and s2 == '+':
        result.append(i2-i1)
    else:
        result.append(-(i1+i2))
    return result

def Deduction(r1, s1, i1, r2, s2, i2):
    # Function deduction second komplex number from first
    result = []
    result.append(r1-r2)
    if s1 == '+' and s2 == '+':
        result.append(i1-i2)
    elif s1 == '+' and s2 == '-':
        result.append(i1+i2)
    elif s1 == '-' and s2 == '+':
        result.append(-i2-i1)
    else:
        result.append(i2-i1)
    return result

def Multiply(r1, s1, i1, r2, s2, i2):
    # Function multiply two komplex numbers
    result = []
    result.append(r1*r2)
    if s1 == "+" and s2 == "+" or s1 == "-" and s2 == "-":
        result.append(-i1*i2)
    else:
        result.append(i1*i2)
    if s1 == "+":
        result.append(r2*i1)
    else:
        result.append(-r2*i1)
    if s2 == "+":
        result.append(r1*i2)
    else:
        result.append(-r1*i2)
    result[0] = result[0] + result[1]
    result[1] = result[2] + result[3]
    result.pop(3)
    result.pop(2)
    return result    
    
def division(r1, s1, i1, r2, s2, i2):
    # Function divide two komplex numbers
    numerator = []
    denominator = []
    result = []
    numerator.append(r1*r2)
    if s1 == "+" and s2 == "+" or s1 == "-" and s2 == "-":
        numerator.append(i1*i2)
    else:
        numerator.append(-i1*i2)
    if s1 == "-":
        numerator.append(-r2*i1)
    else:
        numerator.append(r2*i1)
    if s2 == "+":
        numerator.append(-r1*i2)
    else:
        numerator.append(r1*i2)
    numerator[0] = numerator[0] + numerator[1]
    numerator[1] = numerator[2] + numerator[3]
    numerator.pop(3)
    numerator.pop(2)
    denominator.append(r2**2+i2**2)
    result.append(numerator[0]/denominator[0])
    result.append(numerator[1]/denominator[0])
    return result

def record_in_file(result):
    # Added results in file'''
    with open('results.txt', 'a') as data:
        if result[1] != 0:
            for i in range(0, 2):
                if result[i] > 0 and i == 1:
                    data.write('+ ')
                elif result[i] < 0 and i == 1:
                    result[i] = -result[i]
                    result[i] = str(result[i])
                    data.write('- ')
                    data.write(result[i])
                else:
                    result[i] = str(result[i])
                    data.write(result[i])
                if i != 1:
                    data.write(' ')
            data.write('i\n')
        else:
            result[0] = str(result[0])
            data.write(f'{result[0]}\n')

def Repeat_Or_No():
    '''Function for asking user to continue or no'''
    user_choice = 'Bad answer'
    while user_choice != 'Y' or user_choice != 'N':
        user_choice = input('Do you want continue work with komplex numbers? (Y or N)')
        if user_choice == 'N':
            return False
        elif user_choice == 'Y':
            return True
        else:
            print('Illegal answer! Do you want continue work with komplex numbers? Insert Y or N')


import operations_rational as op
import sys

def x():
    firstnum = float(input('Choose first float number: ').replace(',', '.'))
    return firstnum

def y():
    secondnum = float(input('Choose second float number: ').replace(',', '.'))
    return secondnum

def selectoperation():
    global operation
    operation = (input(f'Select operation: +, -, *, /: '))
    if operation == '+' or '-' or '/' or '*':
        return operation
    else:
        print('Invalid syntax')

def res(firstnum, secondnum):
    if  operation == '+':
        res = firstnum + secondnum
        result = round(res, 3)
        return result
    elif operation == '-':
        res = firstnum - secondnum
        result = round(res, 3)
        return result
    elif operation == '*':
        res = firstnum * secondnum
        result = round(res, 3)
        return result
    elif operation == '/':
        res = firstnum / secondnum
        result = round(res, 3)
        return result
    else:
        print('invalid syntax')

def mainterminal():
    global file
    x = op.x()
    while True:
        y = op.y()
        oper = op.selectoperation()
        res = op.res(x, y)
        file = 'results.txt'
        with open('results.txt', 'a') as data:
            data.write(f'The result of {x} {oper} {y} = {res}\n')
        print(f'The result of {x} {oper} {y} = {res}\n(already written to txt file)' )
        again = input('Do you want calculate another numbers? Yes/No: ').lower()
        if again == 'yes':
            useresult = input('Do you want to use the result of the last operation? (Yes/No): ').lower()
            if useresult == 'yes':
                x = res
                continue
            elif useresult == 'no':
                break
            else:
                sys.exit()           
        else:   
            sys.exit()

def type():
    type = input('What numbers are you going to work with? (Complex/Rational): ').lower()
    return type

import operations_rational as op
import calculatortype as ty
import operations_complex as opCom

type = ty.type()

while type ==  'rational':
    op.mainterminal()
    
if type == 'complex':
    repeat = True
    while repeat == True:
        operands = opCom.Insert_Numbers()
        if operands[2] == "+":
            opCom.record_in_file(opCom.Addition(opCom.Take_Rational_Part(operands[0]), opCom.Take_Symbol(operands[0]), opCom.Take_Imaginary_Part(operands[0]), opCom.Take_Rational_Part(operands[1]), opCom.Take_Symbol(operands[1]), opCom.Take_Imaginary_Part(operands[1])))
        elif operands[2] == "-":
            opCom.record_in_file(opCom.Deduction(opCom.Take_Rational_Part(operands[0]), opCom.Take_Symbol(operands[0]), opCom.Take_Imaginary_Part(operands[0]), opCom.Take_Rational_Part(operands[1]), opCom.Take_Symbol(operands[1]), opCom.Take_Imaginary_Part(operands[1])))
        elif operands[2] == "*":
            opCom.record_in_file(opCom.Multiply(opCom.Take_Rational_Part(operands[0]), opCom.Take_Symbol(operands[0]), opCom.Take_Imaginary_Part(operands[0]), opCom.Take_Rational_Part(operands[1]), opCom.Take_Symbol(operands[1]), opCom.Take_Imaginary_Part(operands[1])))
        else:
            opCom.record_in_file(opCom.division(opCom.Take_Rational_Part(operands[0]), opCom.Take_Symbol(operands[0]), opCom.Take_Imaginary_Part(operands[0]), opCom.Take_Rational_Part(operands[1]), opCom.Take_Symbol(operands[1]), opCom.Take_Imaginary_Part(operands[1])))
        repeat = opCom.Repeat_Or_No()
