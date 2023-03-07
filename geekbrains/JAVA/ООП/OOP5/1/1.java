import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    //можно использовать объект logger для записи логов. Например
    //logger.info("Начинаем выполнение операции: " + operation);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RationalNumber num1, num2;
        ComplexNumber complexNum1, complexNum2;
        int operation;

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");

            operation = scanner.nextInt();
            if (operation == 5) {
                break;
            }

            System.out.println("Введите первое число:");
            if (operation == 1 || operation == 2 || operation == 3 || operation == 4) {
                System.out.println("Дробное число: ");
                num1 = new RationalNumber(scanner.nextInt(), scanner.nextInt());
            } else {
                System.out.println("Комплексное число: ");
                complexNum1 = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());
            }

            System.out.println("Введите второе число:");
            if (operation == 1 || operation == 2 || operation == 3 || operation == 4) {
                System.out.println("Дробное число: ");
                num2 = new RationalNumber(scanner.nextInt(), scanner.nextInt());
            } else {
                System.out.println("Комплексное число: ");
                complexNum2 = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());
            }

            switch (operation) {
                case 1:
                    System.out.println("Результат: " + num1.add(num2));
                    break;
                case 2:
                    System.out.println("Результат: " + num1.subtract(num2));
                    break;
                case 3:
                    System.out.println("Результат: " + num1.multiply(num2));
                    break;
                case 4:
                    System.out.println("Результат: " + num1.divide(num2));
                    break;
                default:
                    System.out.println("Неверная операция");
                    break;
            }
        }
    }
}

class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }
    public RationalNumber divide(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return "" + numerator;
        }
        return numerator + "/" + denominator;
    }
}

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + "i";
        }
        return real + " + " + imaginary + "i";
    }
}

