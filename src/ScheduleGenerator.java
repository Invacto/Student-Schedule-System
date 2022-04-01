import enums.CourseType;

import java.time.LocalDate;
import java.util.ArrayList;

public class ScheduleGenerator {

    private ScheduleGenerator() { }

    /**
     * Generates a Schedule based on the current Courses attached to the Student object
     *
     * @param student Student object to attach the schedule to
     */
    public static void generateSchedule(Student student) {

        Teacher defaultTeacher = new Teacher(new Name("Bob", "Ross"), 123456789, LocalDate.of(1900, 1, 1));

        int amountOfCourses = student.getCurrentCourses().size();

        ArrayList<CourseType> courseTypes = student.getCurrentCourses();

        Schedule schedule = new Schedule(10, 10);

        for (int i = 0; i < amountOfCourses; i++) {
            schedule.setPeriod(new Period(new Course(courseTypes.get(i)), defaultTeacher, "1W8"), i + 1);
        }

        student.setSchedule(schedule);

    }
}
