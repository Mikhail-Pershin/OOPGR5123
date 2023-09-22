package Classes;

/*
 * класс ComplexNumber, который будет представлять комплексное число.
 */
public class ComplexNumber {
    private double real; // Вещественная часть комплексного числа
    private double imaginary; // Мнимая часть комплексного числа
    
    // Конструкторы
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Методы сложения, умножения и деления комплексных чисел
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }
    
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = Math.pow(other.real, 2) + Math.pow(other.imaginary, 2);
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}

