package Services;

import java.util.ArrayList;
import java.util.List;
import Domen.Teacher;
import Domen.PersonComparator;



/**
 * Класс TeacherService согласно заданию
 */
public class TeacherService implements iPersonService<Teacher> {
  private int count;
  private List<Teacher> teachers;

  public TeacherService() {
    this.teachers = new ArrayList<>();
  }

  @Override
  public List<Teacher> getAll() {
    return teachers;
  }

  @Override
  public void create(String name, int age) {
    Teacher teach = new Teacher(name, age, "acadDegree");
    count++;
    teachers.add(teach);
  }

  /**
   * Метод вывода списка учителей отсортированного
   * обобщенным классом PersonComparator
   */
  public void SortByFIO() {
    PersonComparator<Teacher> teachComp = new PersonComparator<Teacher>();
    teachers.sort(teachComp);
  }

}