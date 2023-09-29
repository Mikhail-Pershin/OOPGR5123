/*
 * Определяем интерфейс для операций сложения, умножения и деления комплексных чисел
 */
interface ComplexOperator {
  ComplexNumber sum(ComplexNumber a, ComplexNumber b);

  ComplexNumber multiply(ComplexNumber a, ComplexNumber b);

  ComplexNumber divide(ComplexNumber a, ComplexNumber b);
  
}
