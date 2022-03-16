import java.time.LocalDate;

public class Teacher {

    private Name fullName;
    private int id;
    private LocalDate dob;

    //Might scrap the idea of a teacher Schedule,
    private TeacherSchedule schedule;

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
