import enums.ClassType;
import enums.CourseType;
import enums.ForeignLangType;

import java.util.ArrayList;

public class CourseGenerator {

    private static final CourseType[] COURSE_TYPES_LIST = CourseType.values();

    private CourseGenerator() { }

    /**
     * Assigns the student an ArrayList of Courses based on students criteria of information
     *
     * @param student The Student object to assign the Courses
     */
    public static void generateCourse(Student student) {

        int coursesLimit = 10;
        int currentNumOfCourses = 0;

        ArrayList<CourseType> coursesToTake = new ArrayList<>();

        boolean hasMath = false, hasScience = false, hasEnglish = false, hasSocialStudies = false, hasLang = false;
        boolean isMathDone = false, isScienceDone = false;

        int grade = student.getGrade();

        ForeignLangType langTypePreference = student.getLangTypePreference();

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

            if (courseType.getForeignLangType() != null) {

                hasLang = true;

                if (courseType.getForeignLangType() == ForeignLangType.ITALIAN) {

                    CourseType potentialCourse = CourseType.getForeignLangCourseWithTypeAndLevel(ForeignLangType.ITALIAN, courseType.getLevel() + 1);

                    if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {

                        coursesToTake.add(potentialCourse);
                        currentNumOfCourses++;
                    }

                }

                if (courseType.getForeignLangType() == ForeignLangType.CHINESE) {

                    CourseType potentialCourse = CourseType.getForeignLangCourseWithTypeAndLevel(ForeignLangType.CHINESE, courseType.getLevel() + 1);

                    if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {

                        coursesToTake.add(potentialCourse);
                        currentNumOfCourses++;
                    }

                }

                if (courseType.getForeignLangType() == ForeignLangType.FRENCH) {

                    CourseType potentialCourse = CourseType.getForeignLangCourseWithTypeAndLevel(ForeignLangType.FRENCH, courseType.getLevel() + 1);

                    if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {

                        coursesToTake.add(potentialCourse);
                        currentNumOfCourses++;
                    }
                }

                if (courseType.getForeignLangType() == ForeignLangType.SPANISH) {

                    CourseType potentialCourse = CourseType.getForeignLangCourseWithTypeAndLevel(ForeignLangType.SPANISH, courseType.getLevel() + 1);

                    if (!student.getCompletedCourses().contains(potentialCourse) && potentialCourse != null) {

                        coursesToTake.add(potentialCourse);
                        currentNumOfCourses++;
                    }
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

        if (!hasLang) {

            if (langTypePreference != null) {
                coursesToTake.add(CourseType.getForeignLangCourseWithTypeAndLevel(langTypePreference, 1));
            } else {
                coursesToTake.add(CourseType.getForeignLangCourseWithTypeAndLevel(ForeignLangType.SPANISH, 1));
            }
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
