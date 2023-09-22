/*
 * класс-наблюдатель для логирования операций
 */
public class ConsoleLogger implements CalculationObserver {
    public void onCalculation(ComplexNumber num1, ComplexNumber num2, ComplexOperation operation, ComplexNumber result) {
        System.out.println("Calculation: " + num1 + " " + operation + " " + num2 + " = " + result);
    }
}

