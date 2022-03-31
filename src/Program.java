import enums.ClassType;
import enums.coursetype.CourseType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    private final Scanner SCANNER = new Scanner(System.in);

    public Program() { }

    public void start() {

        System.out.println("Hello !!");
        System.out.println("Welcome to the DEMO Student Scheduling System.");
        System.out.println("Due to this being the DEMO version, it will only include a sample of it's intended purpose,");
        System.out.println("because of the difficulty and logistic headache of the project :)");
        System.out.println("-----------------------------------");
        System.out.println("Welcome new Student ! Enter the following information:");
        System.out.print("What is your First name?");

        String firstName = SCANNER.nextLine();

        System.out.print("What is your Last name? ");

        String lastName = SCANNER.nextLine();

        System.out.print("Birth Year? ");

        int birthYear = SCANNER.nextInt();

        System.out.print("Month? (1-12)");

        int birthMonth = SCANNER.nextInt();

        System.out.print("Day of Month? (1-31)");

        int dayOfMonth = SCANNER.nextInt();

        System.out.println("What grade are you entering as? (9-12)");

        int grade = SCANNER.nextInt();

        Student student = new Student(new Name(firstName, lastName), 123456789, LocalDate.of(birthYear, birthMonth, dayOfMonth), grade);

        ArrayList<CourseType> completedCourses = new ArrayList<>();

        System.out.println("Okay, lets catch up with your completed courses. Let's Start with Math.");

        ArrayList<CourseType> mathCourses = CourseType.getCoursesWithClassTypeWithALevel(ClassType.MATH);

        for (int i = 0; i < mathCourses.size(); i++) {
            System.out.println((i + 1) + ") " + mathCourses.get(i).name());
        }

        System.out.print("Please select the LATEST math course you completed (Only one option) ");

        int mathLevel = SCANNER.nextInt();

        completedCourses.add(CourseType.getClassTypeWithLevel(ClassType.MATH, mathLevel));

        System.out.println("Now Science");

        ArrayList<CourseType> scienceCourses = CourseType.getCoursesWithClassTypeWithALevel(ClassType.SCIENCE);

        for (int i = 0; i < scienceCourses.size(); i++) {
            System.out.println((i + 1) + ") " + scienceCourses.get(i).name());
        }

        System.out.print("Please select the LATEST science course you completed (Only one option) ");

        int scienceLevel = SCANNER.nextInt();
        SCANNER.nextLine();

        completedCourses.add(CourseType.getClassTypeWithLevel(ClassType.SCIENCE, scienceLevel));

        System.out.println("Now Social Studies");

        ArrayList<CourseType> socialStudiesCourses = CourseType.getCoursesWithClassTypeWithALevel(ClassType.SOCIAL_STUDIES);

        for (int i = 0; i < socialStudiesCourses.size(); i++) {
            System.out.println((i + 1) + ") " + socialStudiesCourses.get(i).name());
        }

        System.out.print("Please select the LATEST social studies you completed (Only one option) ");

        int socialStudiesLevel = SCANNER.nextInt();
        SCANNER.nextLine();

        completedCourses.add(CourseType.getClassTypeWithLevel(ClassType.SOCIAL_STUDIES, socialStudiesLevel));

        if (grade != 9) {
            completedCourses.add(CourseType.getClassTypeWithLevel(ClassType.ENGLISH, grade - 9));
        }

        student.setCompletedCourses(completedCourses);

        CourseGenerator.generateCourse(student);

        CourseGenerator.printCourses(student);

    }
}
