package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

public class ViewClassEng implements iGetView {
    @Override
    public void printAllStudent(List<Student> students3) {
        System.out.println("----------- List Students -----------");
        for(Student s3 : students3)
        {
            System.out.println(s3);
        }
        System.out.println("----------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    @Override
    public void sendMessage(String message) {

    }
}