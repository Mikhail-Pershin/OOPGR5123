package Controllers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {

    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /**
     * Обобщенный метод averageAge для подсчета среднего возраста студентов,
     * учителей и работников.
     */
    public static <T extends Person> int averageAge(List<T> persons)
    {
        int sumAge = 0;
        for (int i = 0; i < persons.size(); i++) {
            sumAge += persons.get(i).getAge();
        }
        return sumAge/persons.size();
    }
}
