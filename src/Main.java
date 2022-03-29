import enums.coursetype.CourseType;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Student Schedule System\n");

        Teacher loomba = new Teacher(new Name("Rita", "Loomba"), 123456789, LocalDate.of(1900, 1, 1));
        Teacher costa = new Teacher(new Name("Mario", "Costa"), 123456789, LocalDate.of(1900, 1, 1));
        Teacher miller = new Teacher(new Name("Micheal", "Miller"), 123456789, LocalDate.of(1900, 1, 1));
        Teacher kaplan = new Teacher(new Name("Rachel", "Kaplan"), 123456789, LocalDate.of(1900, 1, 1));
        Teacher lev = new Teacher(new Name("Nancy", "Levey"), 123456789, LocalDate.of(1900, 1, 1));
        Teacher cicolini = new Teacher(new Name("Anthony", "Cicolini"), 123456789, LocalDate.of(1900, 1, 1));

        Course preCalc = new Course(CourseType.PRE_CALCULUS);
        Course cafe = new Course(CourseType.CAFE);
        Course gym = new Course(CourseType.GYM);
        Course italian = new Course(CourseType.ITALIAN);
        Course mezz = new Course(CourseType.MEZZ);
        Course apCSA = new Course(CourseType.AP_CSA);
        Course usHistory = new Course(CourseType.US_HISTORY);
        Course english11 = new Course(CourseType.ENGLISH11);

        Student student = new Student(new Name("Nikita", "Masenzov"), 123456789, LocalDate.of(2005, 4, 15), 11);

        ArrayList<CourseType> completedCourseTypes = new ArrayList<>();
        completedCourseTypes.add(CourseType.ENGLISH09);
        completedCourseTypes.add(CourseType.ENGLISH10);
        completedCourseTypes.add(CourseType.ALGEBRA_2);
        completedCourseTypes.add(CourseType.AP_CSP);
        completedCourseTypes.add(CourseType.CHEMISTRY);
        completedCourseTypes.add(CourseType.GLOBAL_HISTORY);

        student.setCompletedCourses(completedCourseTypes);

        Schedule schedule = new Schedule(10, 10);

        student.appendSchedule(schedule);

        Period period3 = new Period(preCalc, loomba, "6C04");
        Period period4CAFE = new Period(cafe, "CAFE");
        Period period4GYM = new Period(gym, cicolini, "GYM1");
        Period period5 = new Period(italian, costa, "6W24");
        Period period6 = new Period(mezz, "MEZZ");
        Period period7 = new Period(apCSA, miller, "1E10");
        Period period8 = new Period(apCSA, miller, "1E10");
        Period period9 = new Period(usHistory, kaplan, "5E18");
        Period period10 = new Period(english11, lev, "5E20");

        schedule.setPeriod(period3, 3);
        schedule.setPeriod(period4CAFE, 4, new int[]{1, 3, 5, 7, 9});
        schedule.setPeriod(period4GYM, 4, new int[]{2, 4, 6, 8, 10});
        schedule.setPeriod(period5, 5);
        schedule.setPeriod(period6, 6);
        schedule.setPeriod(period7, 7);
        schedule.setPeriod(period8, 8);
        schedule.setPeriod(period9, 9);
        schedule.setPeriod(period10, 10);

        schedule.printSchedule();

        //System.out.println(schedule.getPeriod(7, 9).getName());


    }
}
