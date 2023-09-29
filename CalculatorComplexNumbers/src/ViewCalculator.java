import java.util.Scanner;

/*
 * Реализация операций ввода-вывода
 */
public class ViewCalculator {
  private ComplexOperator calculator;
  private Logger logger;

  public ViewCalculator(ComplexOperator calculator, Logger logger) {
    this.calculator = calculator;
    this.logger = logger;
  }

  public void run() {
    while (true) {
      double realPart1 = promptDouble("Введите действительную часть первого комплексного числа: ");
      double imaginaryPart1 = promptDouble("Введите мнимую часть первого комплексного числа: ");
      ComplexNumber number1 = new ComplexNumber(realPart1, imaginaryPart1);

      double realPart2 = promptDouble("Введите действительную часть второго комплексного числа: ");
      double imaginaryPart2 = promptDouble("Введите мнимую часть второго комплексного числа: ");
      ComplexNumber number2 = new ComplexNumber(realPart2, imaginaryPart2);

      String operation = prompt("Введите операцию (+, *, /): ");

      ComplexNumber result;
      switch (operation) {
        case "+":
          result = calculator.sum(number1, number2);
          logger.log("Результат сложения: " + result);
          break;
        case "*":
          result = calculator.multiply(number1, number2);
          logger.log("Результат умножения: " + result);
          break;
        case "/":
          result = calculator.divide(number1, number2);
          logger.log("Результат деления: " + result);
          break;
      }

      String cmd = prompt("Еще посчитать (Y/N)?");
      if (!cmd.equals("Y")) {
        break;
      }
    }
  }

  private String prompt(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(message);
    return scanner.nextLine();

  }

  private double promptDouble(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(message);
    return Double.parseDouble(scanner.nextLine());

  }

}
