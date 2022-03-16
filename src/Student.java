import java.time.LocalDate;

public class Student {

    private final int ID;
    private final Name fullName;
    private LocalDate dob;
    private int grade;

    private Schedule schedule;

    public Student(Name fullName, int ID, LocalDate dob, int grade) {
        this.fullName = fullName;
        this.ID = ID;
        this.dob = dob;
        this.grade = grade;

        schedule = null;
    }

    public Name getFullName() {
        return fullName;
    }

    public int getID() {
        return ID;
    }

    public LocalDate getDob() {
        return dob;
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
