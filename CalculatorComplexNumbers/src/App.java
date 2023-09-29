public class App {
    public static void main(String[] args) {
        ComplexOperator operator = new ComplexCalculator();
        Logger logger = new Logger();
        ViewCalculator viewCalculator = new ViewCalculator(operator, logger);
        viewCalculator.run();
    }
}
