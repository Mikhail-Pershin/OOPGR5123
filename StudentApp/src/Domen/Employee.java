package Domen;

public class Employee extends Person{
    private String special;
    public String getSpecial() {
      return special;
    }
    public void setSpecial(String special) {
      this.special = special;
    }
    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}