import enums.coursetype.CourseType;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        Student student = new Student(new Name("Nikita", "Masenzov"), 123456789, LocalDate.of(2005, 4, 15), 11);

        ArrayList<CourseType> completed = new ArrayList<>();
        completed.add(CourseType.ALGEBRA_2);
        completed.add(CourseType.CHEMISTRY);
        completed.add(CourseType.ENGLISH10);
        completed.add(CourseType.GLOBAL_HISTORY);

        ArrayList<CourseType> electives = new ArrayList<>();
        electives.add(CourseType.BIOLOGY);
        electives.add(CourseType.CREATIVE_WRITING);
        electives.add(CourseType.CHINESE1);
        electives.add(CourseType.CAPSTONE);
        electives.add(CourseType.BAND);

        student.setElectives(electives);

        student.setCompletedCourses(completed);

        CourseGenerator.generateCourse(student);

        for (CourseType courseType : student.getCurrentCourses()) {
            System.out.println(courseType.toString());
        }
    }
}
