import enums.ClassType;
import enums.coursetype.CourseType;

import java.util.ArrayList;

public class CourseGenerator {

    private static final CourseType[] COURSE_TYPES_LIST = CourseType.values();
    private static ArrayList<CourseType> coursesToTake;

    private CourseGenerator() { }

    public static void generateSchedule(Student student) {

        int coursesLimit = 10;
        int currentNumOfCourses = 0;

        coursesToTake = new ArrayList<>();

        boolean hasMath = false, hasScience = false, hasEnglish = false, hasSocialStudies = false;
        boolean isMathDone = false, isScienceDone = false;

        int grade = student.getGrade();

        if (grade == 9) {
            coursesToTake.add(CourseType.FRESHMAN_ADVISORY);
            coursesToTake.add(CourseType.DDP);

            currentNumOfCourses += 2;
        }

        if (grade == 10) {
            coursesToTake.add(CourseType.HEALTH);
            coursesToTake.add(CourseType.AP_CSP);

            currentNumOfCourses += 2;
        }

        for (CourseType courseType : student.getCompletedCourses()) {

            if (courseType.getClassType() == ClassType.MATH) {

                CourseType potentialCourse = CourseType.getClassTypeWithLevel(ClassType.MATH, courseType.getLevel() + 1);

                if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {
                    coursesToTake.add(potentialCourse);
                    currentNumOfCourses++;
                    hasMath = true;
                } else {
                    isMathDone = true;
                }
            }

            if (courseType.getClassType() == ClassType.ENGLISH) {

                CourseType potentialCourse = CourseType.getClassTypeWithLevel(ClassType.ENGLISH, courseType.getLevel() + 1);

                if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {
                    coursesToTake.add(potentialCourse);
                    currentNumOfCourses++;
                    hasEnglish = true;
                }
            }

            if (courseType.getClassType() == ClassType.SCIENCE) {

                CourseType potentialCourse = CourseType.getClassTypeWithLevel(ClassType.SCIENCE, courseType.getLevel() + 1);

                if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {
                    coursesToTake.add(potentialCourse);
                    currentNumOfCourses++;
                    hasScience = true;
                } else {
                    isScienceDone = true;
                }
            }

            if (courseType.getClassType() == ClassType.SOCIAL_STUDIES) {

                CourseType potentialCourse = CourseType.getClassTypeWithLevel(ClassType.SOCIAL_STUDIES, courseType.getLevel() + 1);

                if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {
                    coursesToTake.add(potentialCourse);
                    currentNumOfCourses++;
                    hasSocialStudies = true;
                }
            }
        }

        if (!hasMath && !isMathDone) {
            coursesToTake.add(CourseType.getClassTypeWithLevel(ClassType.MATH, 1));
            currentNumOfCourses++;
        }
        if (!hasEnglish) {
            coursesToTake.add(CourseType.getClassTypeWithLevel(ClassType.ENGLISH, 1));
            currentNumOfCourses++;
        }
        if (!hasScience && !isScienceDone) {
            coursesToTake.add(CourseType.getClassTypeWithLevel(ClassType.SCIENCE, 1));
            currentNumOfCourses++;
        }
        if (!hasSocialStudies) {
            coursesToTake.add(CourseType.getClassTypeWithLevel(ClassType.SOCIAL_STUDIES, 1));
            currentNumOfCourses++;
        }

        coursesToTake.add(CourseType.CAFE);
        coursesToTake.add(CourseType.GYM);

        currentNumOfCourses += 2;

        if (student.getElectives() != null) {

            for (CourseType elective : student.getElectives()) {

                if (currentNumOfCourses < coursesLimit) {

                    coursesToTake.add(elective);
                    currentNumOfCourses++;
                }
            }
        }

        student.setCurrentCourses(coursesToTake);
    }

    public static void printCourses(Student student) {
        for (CourseType courseType : student.getCurrentCourses()) {
            System.out.println(courseType.toString());
        }
    }

}
