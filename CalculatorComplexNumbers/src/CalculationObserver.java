public interface CalculationObserver {
    void onCalculation(ComplexNumber num1, ComplexNumber num2, ComplexOperation operation, ComplexNumber result);
}