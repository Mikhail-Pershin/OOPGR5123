package Interfaces;
import java.lang.System.Logger;

import Classes.ComplexNumber;
import Classes.ConsoleLogger;

public class ComplexCalculator implements Calculator {
    private Logger logger; // Логгер для записи информации о выполненных операциях
    
    public ComplexCalculator(ConsoleLogger logger2) {
        this.logger = (Logger) logger2;
    }
    
    @Override
    public ComplexNumber add(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.add(number2);
        logger.log(null, "Выполнено сложение комплексных чисел: " + number1.toString() + " и " + number2.toString());
        return result;
    }
    
    @Override
    public ComplexNumber multiply(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.multiply(number2);
        logger.log(null, "Выполнено умножение комплексных чисел: " + number1.toString() + " и " + number2.toString());
        return result;
    }
    
    @Override
    public ComplexNumber divide(ComplexNumber number1, ComplexNumber number2) {
        ComplexNumber result = number1.divide(number2);
        logger.log(null, "Выполнено деление комплексных чисел: " + number1.toString() + " и " + number2.toString());
        return result;
    }
}