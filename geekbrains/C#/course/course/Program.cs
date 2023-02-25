string hello = "Привет мир";
Console.WriteLine(hello);

Console.WriteLine("Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.");
Console.WriteLine("Введите число a");
var a = Decimal.Parse(Console.ReadLine());
Console.WriteLine("Введите число b");
var b = Decimal.Parse(Console.ReadLine());
if (a > b)
    Console.WriteLine("{0} большее число", a);
else
    Console.WriteLine("{0} большее число", b);


Console.WriteLine("Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.");
Console.WriteLine("Введите число a1");
var a1 = Decimal.Parse(Console.ReadLine());
Console.WriteLine("Введите число b1");
var b1 = Decimal.Parse(Console.ReadLine());
Console.WriteLine("Введите число c1");
var c1 = Decimal.Parse(Console.ReadLine());
if (a1 > b1)
    if (a1 > c1)   /*a1 - наибольшее*/
        Console.WriteLine("{0} наибольшее число (a1)", a1);
    else /*c1 - наибольшее*/
        Console.WriteLine("{0} наибольшее число (c1)", c1);
else
    if (b1 > c1)   /*b1 - наибольшее*/
        Console.WriteLine("{0} наибольшее число (b1)", b1);
    else /*c1 - наибольшее*/
        Console.WriteLine("{0} наибольшее число (c1)", c1);



Console.WriteLine("Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).");
Console.WriteLine("Введите n число");
var n = Decimal.Parse(Console.ReadLine());
Console.WriteLine(n % 2 == 0 ? "Четное" : "Не четное");


Console.WriteLine("Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.");
Console.Write("Введите начальное число диапазона: ");
int n1 = int.Parse(Console.ReadLine());
Console.Write("Введите конечное число диапазона: ");
int m1 = int.Parse(Console.ReadLine());
for (int i = n1; i <= m1; i++)
{
    if (i % 2 == 0)
    {
        Console.Write(i + " ");
    }
}

Console.WriteLine("Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.");
int number = ReadInt("Введите трехзначное число: ");
int amount = number.ToString().Length;

if (amount < 3 || amount > 3)
{
    Console.WriteLine("Вы ввели не трехзначное число");
}
else
{
    Console.WriteLine(InCenter(number));
}
int ReadInt(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}
int InCenter(int a)
{

    int result = ((a / 10) % 10);
    return result;
}


Console.WriteLine("Задача 13: Напишите программу, которая с помощью деления выводит третью цифру заданного числа или сообщает, что третьей цифры нет.");
Console.Write("Введи число: ");
int anyNumber = Convert.ToInt32(Console.ReadLine());
string anyNumberText = Convert.ToString(anyNumber);
if (anyNumberText.Length > 2)
{
    Console.WriteLine("третья цифра -> " + anyNumberText[2]);
}
else
{
    Console.WriteLine("-> третьей цифры нет");
}



Console.WriteLine("Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.");
Console.Write("Введи цифру, обозначающую день недели: ");
int dayNumber = Convert.ToInt32(Console.ReadLine());

void CheckingTheDayOfTheWeek(int dayNumber)
{
    if (dayNumber == 6 || dayNumber == 7)
    {
        Console.WriteLine("(этот день выходной) -> да");
    }
    else if (dayNumber < 1 || dayNumber > 7)
    {
        Console.WriteLine("это не день недели");
    }
    else Console.WriteLine("(этот день не выходной) -> нет");
}
CheckingTheDayOfTheWeek(dayNumber);


Console.WriteLine("Задача 19 Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.");
Console.WriteLine("Введите число: ");
string number19 = Console.ReadLine();
int len = number19.Length;
if (len == 5)
{
    if (number19[0] == number19[4] && number19[1] == number19[3])
    {
        Console.WriteLine($"{number} - Палиндром");
    }
    else
    {
        Console.WriteLine($"{number} - НЕ палиндром");
    }
}
else
{
    Console.WriteLine($"Ошибка {number} - не является пятизначным");
}


Console.WriteLine("Задача 21 (branch task_2) Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.");
int x1 = ReadInt21("Введите координату X первой точки: ");
int y1 = ReadInt21("Введите координату Y первой точки: ");
int z1 = ReadInt21("Введите координату Z первой точки: ");
int x2 = ReadInt21("Введите координату X второй точки: ");
int y2 = ReadInt21("Введите координату Y второй точки: ");
int z2 = ReadInt21("Введите координату Z второй точки: ");

int A = x2 - x1;
int B = y2 - y1;
int C = z1 - z2;

double length = Math.Sqrt(A * A + B * B + C * C);
Console.WriteLine($"Длинна отрезка {length}");
// Функция ввода сообщения
int ReadInt21(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}


Console.WriteLine("Задача 23 Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.");
int number1 = ReadInt23("Введите число N: ");
for (int i = 1; i <= number1; i++)
{
    Console.Write($"{i * i * i} ");
}
// Функция ввода сообщения
int ReadInt23(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}


Console.WriteLine("Задача 25: (branch task_1) Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.");
int numberA = ReadInt25("Введите число A: ");
int numberB = ReadInt25("Введите число B: ");
ToDegree(numberA, numberB);
// Функция возведения в степень
void ToDegree(int a, int b)
{
    int result = 1;
    for (int i = 1; i <= b; i++)
    {
        result = result * a;
    }
    Console.WriteLine(result);
}
// Функция ввода
int ReadInt25(string message)
{
    Console.WriteLine(message);
    return Convert.ToInt32(Console.ReadLine());
}


Console.WriteLine("Задача 27: (branch task_2) Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.");
int number27 = ReadInt27("Введите число: ");
int len27 = NumberLen(number27);
SumNumbers(number27, len27);
// Функция ввода
int ReadInt27(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}
// Функция подсчета цифр в числе
int NumberLen(int a)
{
    int index = 0;
    while (a > 0)
    {
        a /= 10;
        index++;
    }
    return index;
}
// Функция вывода суммы цифр в числе
void SumNumbers(int n, int len)
{
    int sum = 0;
    for (int i = 1; i <= len; i++)
    {
        sum += n % 10;
        n /= 10;
    }
    Console.WriteLine(sum);
}


Console.WriteLine("Задача 29: (branch task_3) Напишите программу, которая задаёт массив из N элементов и выводит их на экран.");
int lenArray = ReadInt29("Введите длинну массива: ");
int[] randomArray = new int[lenArray];
for (int i = 0; i < randomArray.Length; i++)
{
    randomArray[i] = new Random().Next(1, 9);
    Console.Write(randomArray[i] + " ");
}
// Функция ввода
int ReadInt29(string message)
{
    Console.Write(message);
    return Convert.ToInt32(Console.ReadLine());
}



Console.WriteLine("Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.");
Console.WriteLine("Введите размер массива");
int size = Convert.ToInt32(Console.ReadLine());
int[] numbers = new int[size];
int count = 0;
FillArrayRandomNumbers(numbers);
PrintArray(numbers);


for (int i = 0; i < numbers.Length; i++)
{
    if (numbers[i] % 2 == 0)
        count++;
}


Console.WriteLine($"количество чётных чисел в массиве -> {count} ");

void FillArrayRandomNumbers(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(100, 1000);
    }
}
void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
    Console.WriteLine();
}

Console.WriteLine("Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.");
int size1 = 4;
int[] numbers1 = new int[size1];
FillArrayRandomNumbers1(numbers);
PrintArray1(numbers);

int sumNumbersEvenIndex = 0;

for (int i = 1; i < numbers.Length; i += 2)
{
    sumNumbersEvenIndex += numbers[i];
}
Console.Write(sumNumbersEvenIndex);



void FillArrayRandomNumbers1(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(-100, 101);
    }
}

void PrintArray1(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
    Console.WriteLine();
}




Console.WriteLine("Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.");
int size2 = 10;
int[] numbers2 = new int[size2];
FillArrayRandomNumbers2(numbers);
PrintArray2(numbers);

int max = numbers[0];
int min = numbers[0];

for (int i = 0; i < numbers.Length; i++)
{
    if (numbers[i] > max)
    {
        max = numbers[i];
    }
    else if (numbers[i] < min)
    {
        min = numbers[i];
    }
}

Console.WriteLine($"Минимальное число: {min}");
Console.WriteLine($"Минимальное число: {max}");
Console.WriteLine($"Разница между максимальным и минимальным числами: {max - min}");



void FillArrayRandomNumbers2(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = new Random().Next(1, 555);
    }
}


void PrintArray2(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
    Console.WriteLine();
}


Console.Write("Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.");
Console.Write("Введите элементы(через пробел): ");
int[] arr = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
int count41 = 0;
 
for (int i = 0; i < arr.Length; i++)
{
    if (arr[i] > 0)
    {
        count41++;
    }
}
 
Console.WriteLine($"Кол-во элементов > 0: {count41}");


Console.Write("Задание 43 ");
Console.Write("Введите k1: ");
var k1_43 = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите b1: ");
var b1_43 = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите k2: ");
var k2_43 = Convert.ToDouble(Console.ReadLine());
Console.Write("Введите b2: ");
var b2_43 = Convert.ToDouble(Console.ReadLine());
 
 
var x_43 = -(b1_43 - b2_43) / (k1_43 - k2_43);
var y_43 = k1_43 * x_43 + b1_43;
 
x_43 = Math.Round(x_43, 3);
y_43 = Math.Round(y_43, 3);
 
Console.WriteLine($"Пересечение в точке: ({x_43};{y_43})");

Console.WriteLine("Задача 47: Задайте двумерный массив размером m×n, заполненный случайными вещественными числами, округлёнными до одного знака.");
Console.WriteLine("Задайте количество строк двумерного массива:");
int m47 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Задайте количество столбцов двумерного массива:");
int n47 = Convert.ToInt32(Console.ReadLine());
double[,] twoDimArray47 = new double[m47, n47];
Random rnd = new Random();
void PrintArray47(double[,] matr)
{
    for (int i = 0; i < m47; i++)
    {
        for (int j = 0; j < n47; j++)
        { Console.Write($"{matr[i, j]} "); }
        Console.WriteLine();
    }
}

void FillArray47(double[,] matr)
{
    for (int i = 0; i < m47; i++)
    {
        for (int j = 0; j < n47; j++)
        { matr[i, j] = Convert.ToDouble(rnd.Next(-100, 100) / 10.0); }
    }
}
FillArray47(twoDimArray47);
Console.WriteLine();
PrintArray47(twoDimArray47);



Console.WriteLine("Задача 50: Напишите программу, которая на вход принимает индексы элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.");
Console.WriteLine("Введите размеры массива");
int m50 = Convert.ToInt32(Console.ReadLine());
int n50 = Convert.ToInt32(Console.ReadLine());
int[,] array = new int[m50, n50];

for (int i = 0; i < array.GetLength(0); i++)
{
    for (int j = 0; j < array.GetLength(1); j++)
        array[i, j] = Convert.ToInt32(new Random().Next(0, 21));
}

for (int i = 0; i < array.GetLength(0); i++)
{
    for (int j = 0; j < array.GetLength(1); j++)
        Console.Write(array[i, j] + "\t  ");
    Console.WriteLine();
}

Console.WriteLine("Введите координаты начиная с число 0");
int a50 = Convert.ToInt32(Console.ReadLine());
int b50 = Convert.ToInt32(Console.ReadLine());
if (a > m50 && b > n50)
    Console.WriteLine("Такого числа нет");
else
{
    object c = array.GetValue(a50, b50);
    Console.WriteLine(c);
}


Console.WriteLine("Задача 52: Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.");
Console.WriteLine("Задайте количество строк двумерного массива:");
int m52 = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Задайте количество столбцов двумерного массива:");
int n52 = Convert.ToInt32(Console.ReadLine());
int[,] twoDimArray52 = new int[m52, n52];
Random rnd52 = new Random();
void PrintArray52(int[,] matr)
{
    for (int i = 0; i < m52; i++)
    {
        for (int j = 0; j < n52; j++)
        { Console.Write($"{matr[i, j]} "); }
        Console.WriteLine();
    }
}

void FillArray52(int[,] matr)
{
    for (int i = 0; i < m52; i++)
    {
        for (int j = 0; j < n52; j++)
        { matr[i, j] = Convert.ToInt32(rnd.Next(0, 100) / 10); }
    }
}
void ArithmeticNumber(int[,] matr)
{

    double[] s = new double[n52];
    //сумма по столбцу
    Console.WriteLine("Среднее арифметическое число каждого столбца");
    for (int i = 0; i < n52; i++)
    {
        for (int j = 0; j < m52; j++)
            s[i] += matr[j, i];
        Console.Write($"{s[i] / m52} ");
    }

}
FillArray52(twoDimArray52);
Console.WriteLine();
PrintArray52(twoDimArray52);
ArithmeticNumber(twoDimArray52);



Console.WriteLine("Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.");
int[,] table54 = new int[3, 4];
FillArrayRandom54(table54);
PrintArray54(table54);
SortToLower54(table54);
Console.WriteLine();
PrintArray54(table54);



void FillArrayRandom54(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(1, 10);
        }
    }
}

void SortToLower54(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(1) - 1; k++)
            {
                if (array[i, k] < array[i, k + 1])
                {
                    int temp = array[i, k + 1];
                    array[i, k + 1] = array[i, k];
                    array[i, k] = temp;
                }
            }
        }
    }
}

void PrintArray54(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}


Console.WriteLine("Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.");
Console.WriteLine("Введите размер массива m x n и диапазон случайных значений:");
int m56 = InputNumbers56("Введите m: ");
int n56 = InputNumbers56("Введите n: ");
int range56 = InputNumbers56("Введите диапазон: от 1 до ");

int[,] array56 = new int[m56, n56];
CreateArray56(array56);
WriteArray56(array56);

int minSumLine56 = 0;
int sumLine56 = SumLineElements56(array56, 0);
for (int i56 = 1; i56 < array56.GetLength(0); i56++)
{
    int tempSumLine = SumLineElements56(array56, i56);
    if (sumLine56 > tempSumLine)
    {
        sumLine56 = tempSumLine;
        minSumLine56 = i56;
    }
}

Console.WriteLine($"\n{minSumLine56 + 1} - строкa с наименьшей суммой ({sumLine56}) элементов ");


int SumLineElements56(int[,] array, int i)
{
    int sumLine = array[i, 0];
    for (int j = 1; j < array.GetLength(1); j++)
    {
        sumLine += array[i, j];
    }
    return sumLine;
}

int InputNumbers56(string input)
{
    Console.Write(input);
    int output = Convert.ToInt32(Console.ReadLine());
    return output;
}

void CreateArray56(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(range56);
        }
    }
}

void WriteArray56(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write(array[i, j] + " ");
        }
        Console.WriteLine();
    }
}



Console.WriteLine("Задача 58: Напишите программу, которая заполнит спирально массив 4 на 4. \n");
int n58 = 4;
int[,] sqareMatrix58 = new int[n58, n58];

int temp58 = 1;
int i58 = 0;
int j58 = 0;

while (temp58 <= sqareMatrix58.GetLength(0) * sqareMatrix58.GetLength(1))
{
    sqareMatrix58[i58, j58] = temp58;
    temp58++;
    if (i58 <= j58 + 1 && i58 + j58 < sqareMatrix58.GetLength(1) - 1)
        j58++;
    else if (i58 < j58 && i58 + j58 >= sqareMatrix58.GetLength(0) - 1)
        i58++;
    else if (i58 >= j58 && i58 + j58 > sqareMatrix58.GetLength(1) - 1)
        j58--;
    else
        i58--;
}

WriteArray58(sqareMatrix58);

void WriteArray58(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            if (array[i, j] / 10 <= 0)
                Console.Write($" {array[i, j]} ");

            else Console.Write($"{array[i, j]} ");
        }
        Console.WriteLine();
    }
}

Console.WriteLine("");
Console.WriteLine("Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1.");
int n64 = InputNumbers64("Введите n: ");
int count64 = 2;
PrintNumber64(n64, count64);
Console.Write(1);

void PrintNumber64(int n, int count)
{
    if (count > n) return;
    PrintNumber64(n, count + 1);
    Console.Write(count + ", ");
}

int InputNumbers64(string input)
{
    Console.Write(input);
    int output = Convert.ToInt32(Console.ReadLine());
    return output;
}

Console.WriteLine("");
Console.WriteLine("Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N");
int m66 = InputNumbers66("Введите m: ");
int n66 = InputNumbers66("Введите n: ");
int temp66 = m66;

if (m66 > n66)
{
    m66 = n66;
    n66 = temp66;
}

PrintSumm66(m66, n66, temp66 = 0);

void PrintSumm66(int m, int n, int summ)
{
    summ = summ + n;
    if (n <= m)
    {
        Console.Write($"Сумма элементов= {summ} ");
        return;
    }
    PrintSumm66(m, n - 1, summ);
}

int InputNumbers66(string input)
{
    Console.Write(input);
    int output = Convert.ToInt32(Console.ReadLine());
    return output;
}

Console.WriteLine("");
Console.WriteLine("Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.");
int m68 = InputNumbers68("Введите m: ");
int n68 = InputNumbers68("Введите n: ");

int functionAkkerman68 = Ack68(m68, n68);

Console.Write($"Функция Аккермана = {functionAkkerman68} ");

int Ack68(int m, int n)
{
    if (m == 0) return n + 1;
    else if (n == 0) return Ack68(m - 1, 1);
    else return Ack68(m - 1, Ack68(m, n - 1));
}

int InputNumbers68(string input)
{
    Console.Write(input);
    int output = Convert.ToInt32(Console.ReadLine());
    return output;
}

Console.ReadKey();