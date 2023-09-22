package Model;

import java.util.List;


import Controller.Interfaces.iGetModel;
import Model.Core.Student;

public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students2) {
        this.students = students2;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean delete (int id) {
       List <Student> students2 = students.stream()
                .filter(x->x.getId()==id)
                .toList();
       if (students2.isEmpty())
           return false;
        for (Student s:students2) {
            students.remove(s);
        }
        return true;
    }

    @Override
    public Integer key() {
        return 3;
    }
}