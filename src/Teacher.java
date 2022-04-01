import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Teacher {

    private Name fullName;
    private int id;
    private LocalDate dob;
    private ArrayList<Period> assignedPeriods;

    private TeacherSchedule schedule;

    public Teacher(Name fullName, int id, LocalDate dob, ArrayList<Period> assignedPeriods) {
        this.fullName = fullName;
        this.id = id;
        this.dob = dob;
        this.assignedPeriods = assignedPeriods;

        schedule = null;
    }

    public Teacher(Name fullName, int id, LocalDate dob) {
        this.fullName = fullName;
        this.id = id;
        this.dob = dob;

        schedule = null;
    }

    public Name getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }
}
