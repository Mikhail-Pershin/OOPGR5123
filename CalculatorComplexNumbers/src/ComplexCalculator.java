/*
 * Реализуем операции сложения, умножения и деления комплексных чисел
 */
class ComplexCalculator implements ComplexOperator {
    @Override
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        double real = a.getRealPart() + b.getRealPart();
        double imaginary = a.getImaginaryPart() + b.getImaginaryPart();
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = (a.getRealPart() * b.getRealPart()) - (a.getImaginaryPart() * b.getImaginaryPart());
        double imaginary = (a.getRealPart() * b.getImaginaryPart()) + (a.getImaginaryPart() * b.getRealPart());
        return new ComplexNumber(real, imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = (b.getRealPart() / b.getRealPart()) + (b.getImaginaryPart() / b.getImaginaryPart());
        double real = ((a.getRealPart() / b.getRealPart()) + (a.getImaginaryPart() / b.getImaginaryPart())) / denominator;
        double imaginary = ((a.getImaginaryPart() / b.getRealPart()) - (a.getRealPart() / b.getImaginaryPart())) / denominator;
        return new ComplexNumber(real, imaginary);
    }

            
}
