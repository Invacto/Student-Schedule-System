import enums.ClassType;
import enums.coursetype.CourseType;

import java.util.ArrayList;

public class ScheduleGenerator {

    private ScheduleGenerator() { }

    public static void generateSchedule(Student student) {

        ArrayList<CourseType> coursesToTake = new ArrayList<>();

        int grade = student.getGrade();

        if (grade == 9) {
            coursesToTake.add(CourseType.FRESHMAN_ADVISORY);
            coursesToTake.add(CourseType.DDP);
            coursesToTake.add(CourseType.PRE_AP_WORLD_HISTORY);
        }

        if (grade == 10) {
            coursesToTake.add(CourseType.HEALTH);
            coursesToTake.add(CourseType.AP_CSP);
        }

        //MATH, ELA, SCIENCE, LANG, GYM









    }
}
