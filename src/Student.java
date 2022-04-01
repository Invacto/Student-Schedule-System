import enums.CourseType;
import enums.ForeignLangType;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private final int ID;
    private final Name fullName;
    private LocalDate dob;
    private int grade;

    private ArrayList<CourseType> completedCourses;
    private ForeignLangType langTypePreference;

    private ArrayList<CourseType> electives;
    private ArrayList<CourseType> currentCourses;
    private Schedule schedule;

    public Student(Name fullName, int ID, LocalDate dob, int grade, ArrayList<CourseType> completedCourses) {
        this.fullName = fullName;
        this.ID = ID;
        this.dob = dob;
        this.completedCourses = completedCourses;

        electives = new ArrayList<>();
        currentCourses = null;
        schedule = null;
    }


    public Student(Name fullName, int ID, LocalDate dob, int grade) {
        this.fullName = fullName;
        this.ID = ID;
        this.dob = dob;
        this.grade = grade;

        electives = new ArrayList<>();
        currentCourses = null;
        completedCourses = null;
        schedule = null;
    }

    public Name getFullName() {
        return fullName;
    }

    public int getID() {
        return ID;
    }

    public int getGrade() {
        return grade;
    }

    public LocalDate getDob() {
        return dob;
    }

    public ArrayList<CourseType> getCurrentCourses() {
        return currentCourses;
    }

    public ArrayList<CourseType> getCompletedCourses() {
        return completedCourses;
    }

    public ForeignLangType getLangTypePreference() {
        return langTypePreference;
    }

    public ArrayList<CourseType> getElectives() {
        return electives;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setElectives(ArrayList<CourseType> electives) {
        this.electives = electives;
    }

    public void setLangTypePreference(ForeignLangType langTypePreference) {
        this.langTypePreference = langTypePreference;
    }

    public void setCurrentCourses(ArrayList<CourseType> currentCourses) {
        this.currentCourses = currentCourses;
    }

    public void setCompletedCourses(ArrayList<CourseType> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public void appendCompletedCourse(CourseType courseType) {
        completedCourses.add(courseType);
    }

    public void appendElective(CourseType courseType) {
        electives.add(courseType);
    }

    public void appendSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String toString() {
        String str = "";

        str += "Name: " + fullName;
        str += "\nOSIS: " + ID;
        str += "\nDate Of Birth: " + dob;
        str += "\nGrade: " + grade;

        return str;
    }
}
