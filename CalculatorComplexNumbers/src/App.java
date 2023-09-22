public class App {
    public static void main(String[] args) throws Exception {
        ComplexNumber num1 = new ComplexNumber(1, 2);
        ComplexNumber num2 = new ComplexNumber(3, 4);
        ComplexCalculator calculator = new ComplexCalculator();
        calculator.addObserver(new ConsoleLogger());
        calculator.addObserver(new FileLogger());

        ComplexOperation addition = new Addition();
        ComplexOperation multiplication = new Multiplication();
        ComplexOperation division = new Division();

        calculator.calculate(num1, num2, addition);
        calculator.calculate(num1, num2, multiplication);
        calculator.calculate(num1, num2, division);
        

    }
}
