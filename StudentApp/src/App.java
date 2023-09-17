import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.Employee;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 21);
        Student s3 = new Student("Степан", 22);
        Student s4 = new Student("Алексей",  23);
        Student s5 = new Student("Даша",  24);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Алина",  23);
        Student s8 = new Student("Света",  22);
        Student s9 = new Student("Николай",  21);
        Student s10 = new Student("Андрей",  26);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s7);
        listStud.add(s8);
        listStud.add(s9);
        listStud.add(s10);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);
        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

         Collections.sort(group4580.getGroup());
         for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        listStud3.add(s10);

        System.out.println("=========== Список групп ============");
        System.out.println();

        StudentGroup group5123 = new StudentGroup(listStud1, 5123);
        System.out.println(group5123);
        StudentGroup group4670 = new StudentGroup(listStud2, 4670);
        System.out.println(group4670);
        StudentGroup group4850 = new StudentGroup(listStud3, 4850);
        System.out.println(group4850);

        // for (Student std : group5123) {
        //     System.out.println(std);
        // }

        System.out.println("=========================================================");

        System.out.println("Группа 5123");
        System.out.println();
        Collections.sort(group5123.getGroup());
        System.out.println();
        System.out.println("Группа 4670");
        System.out.println();
        Collections.sort(group4670.getGroup());
        System.out.println();
        System.out.println("Группа 4850");
        System.out.println();
        Collections.sort(group4850.getGroup());
        System.out.println();

        
        System.out.println("========== Cортировка групп студентов в потоке ==============");

        System.out.println("Группа 5123");
        for (Student std : group5123.getGroup()) {
            System.out.println(std);
        }

        System.out.println("Группа 4670");
        for (Student std : group4670.getGroup()) {
            System.out.println(std);
        }

        System.out.println("Группа 4850");
        for (Student std : group4850.getGroup()) {
            System.out.println(std);
        }

        // System.out.println(new PersonComparator<Student>().compare(s1, s3));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);
        

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");
        Teacher t3 = new Teacher("Иван", 50, "Professor");
        Teacher t4 = new Teacher("Андрей", 65, "Professor");
        Teacher t5 = new Teacher("Сергей", 57, "Professor");

        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(t1);
        listTeachers.add(t2);
        listTeachers.add(t3);
        listTeachers.add(t4);
        listTeachers.add(t5);

        Employee Em1 = new Employee("Лариса", 43, "Повар");
        Employee Em2 = new Employee("Василий", 58, "Кладовщик");
        Employee Em3 = new Employee("Антон", 38, "Охранник");
        Employee Em4 = new Employee("Семен", 30, "Охранник");


        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add(Em1);
        listEmployees.add(Em2);
        listEmployees.add(Em3);
        listEmployees.add(Em4);
        System.out.println();

        System.out.println("========== Список учителей ==============");

         
        for(Teacher tchr : listTeachers)
        {
            System.out.println(tchr);
        }
        System.out.println();
        

        System.out.println("========== Зарплата учителей ==============");
        
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(t2, 55000);
        AccountController.paySalary(t3, 63000);
        AccountController.paySalary(t4, 70000);
        AccountController.paySalary(t5, 65000);
        System.out.println();
        
       
        System.out.println("========== Подсчет среднего возраста студентов, учителей и работников ==============");
        int averageAgeStudents1 = AccountController.averageAge(listStud1);
        int averageAgeStudents2 = AccountController.averageAge(listStud2);
        int averageAgeStudents3 = AccountController.averageAge(listStud3);

        System.out.println("Средний возраст студентов из потока -> " + (averageAgeStudents1 + 
        averageAgeStudents2 + averageAgeStudents3)/3 + " лет");

        int averageAgeTeachers = AccountController.averageAge(listTeachers);
        System.out.println("Средний возраст учителей -> " + averageAgeTeachers + " лет");

        int averageAgeEmployee = AccountController.averageAge(listEmployees);
        System.out.println("Средний возраст персонала -> " + averageAgeEmployee + " лет");
        System.out.println();

    }
}
