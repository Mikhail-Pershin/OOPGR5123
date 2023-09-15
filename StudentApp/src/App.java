import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;

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

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        // StudentGroup group5123 = new StudentGroup(listStud, 5123);
        // System.out.println(group5123);
        // for(Student std : group5123)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        //  Collections.sort(group5123.getGroup());
        //  for(Student std: group5123.getGroup())
        // {
        //     System.out.println(std);
        // }
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
        
    }
}
