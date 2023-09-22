package Interfaces;
import Classes.ComplexNumber;

/*
 * интерфейс Calculator, который будет определять основные операции калькулятора.
 */
public interface Calculator {
    ComplexNumber add(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber divide(ComplexNumber number1, ComplexNumber number2);
}

