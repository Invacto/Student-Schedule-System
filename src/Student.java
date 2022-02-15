import java.time.LocalDate;

public class Student {

    private Name fullName;
    private final OSIS ID;
    private LocalDate dob;
    private Schedule schedule;

    public Student(Name fullName, OSIS id, LocalDate dob) {
        this.fullName = fullName;
        this.ID = id;
        this.dob = dob;
    }

    public Name getFullName() {
        return fullName;
    }

    public OSIS getID() {
        return ID;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String toString() {
        String str = "";

        str += "Name: " + fullName;
        str += "\nOSIS: " + ID;
        str += "\nDate Of Birth: " + dob;

        return str;
    }
}
