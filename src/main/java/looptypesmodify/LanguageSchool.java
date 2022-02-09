package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Nagy Tibor");
        students.add(s1);
        Student s2 = new Student("Kiss Béla");
        students.add(s2);
        Student s3 = new Student("Ka Pál");
        students.add(s3);
        Student s4 = new Student("Szabó Zita");
        students.add(s4);

        for (Student s: students) {
            System.out.println(s.getName() + " | " + s.isActive());
        }
        System.out.println();

        s2.setActive(false);
        s3.setActive(false);

        List<Student> removeStudents = new ArrayList<>();
        for (Student student: students) {
            if(!student.isActive())
                removeStudents.add(student);
        }
        students.removeAll(removeStudents);

        for (Student s: students)
            System.out.println(s.getName() + " | " + s.isActive());
    }
}

