import Classes.ComplexNumber;
import Classes.ConsoleLogger;
import Interfaces.Calculator;
import Interfaces.ComplexCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Logger logger = new ConsoleLogger();
        Calculator calculator = new ComplexCalculator(logger);
        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(1, 2);
        
        ComplexNumber sum = calculator.add(number1, number2);
        ComplexNumber product = calculator.multiply(number1, number2);
        ComplexNumber quotient = calculator.divide(number1, number2);
        
        System.out.println("Сумма комплексных чисел: " + sum.toString());
        System.out.println("Произведение комплексных чисел: " + product.toString());
        System.out.println("Частное комплексных чисел: " + quotient.toString());
    }
}