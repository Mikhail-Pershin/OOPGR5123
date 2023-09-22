import java.util.ArrayList;
import java.util.List;

/*
 *  класс калькулятора комплексных чисел для логирования операций
 */
public class ComplexCalculator {
    private List<CalculationObserver> observers = new ArrayList<>();

    public void addObserver(CalculationObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CalculationObserver observer) {
        observers.remove(observer);
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2, ComplexOperation operation) {
        ComplexNumber result = operation.calculate(num1, num2);

        for (CalculationObserver observer : observers) {
            observer.onCalculation(num1, num2, operation, result);
        }

        return result;
    }
}

