package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    void printStudyGroups(List<String> students){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).length() <= 10)
                System.out.println("1. team: " + students.get(i));
            else
                System.out.println("2. team: " + students.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Nagy Tibor", "Kiss Béla", "Lukovszky Erika");
        StudyGroup sg = new StudyGroup();
        sg.printStudyGroups(students);
    }

}
