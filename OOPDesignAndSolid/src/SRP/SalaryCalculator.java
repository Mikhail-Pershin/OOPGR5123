package SRP;

public class SalaryCalculator {
  public int calculateNetSalary(Employee employee) {
    int tax = (int) (employee.baseSalary * 0.25); // calculate in other way
    return employee.baseSalary - tax;
  }
}