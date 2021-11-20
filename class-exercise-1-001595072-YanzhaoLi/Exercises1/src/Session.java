import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * session
 *
 * @author Yanzhao Li
 * @date 2021/10/23
 */
public class Session {
    private List<Student> students = new ArrayList<Student>();

    /**
     * Set Student in array Students
     *
     * @param student students
     */
    public void setStudents(Student student) {
        this.students.add(student);
    }

    /**
     * print all student average grade
     */
    public void printAverage() {
        for (Student i : students) {
            if (i instanceof PartTime) {
                System.out.println("name = " + i.getName() + ", average = " + ((PartTime) i).calculateAverage());
            } else {
                System.out.println("name = " + i.getName() + ", average = " + ((FullTime) i).calculateAverage());
            }

        }
    }

    /**
     * print all student and grade as a list
     */
    public void printAll() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.calculateAverage() > o2.calculateAverage() ? -1 : (o1.calculateAverage() == o2.calculateAverage() ? 0 : 1);
            }
        });
        System.out.println(students.toString());
    }

    /**
     * print all part-time student name
     */
    public void printAllPartTime() {
        for (Student i : students) {
            if (i instanceof PartTime) {
                System.out.println("name = " + i.getName());
            }
        }
    }

    /**
     * print all full time student exam grade
     */
    public void printAllExam() {
        for (Student i : students) {
            if (i instanceof FullTime) {
                FullTime a = (FullTime) i;
                System.out.println("name = " + a.getExam());
            }
        }
    }
}
