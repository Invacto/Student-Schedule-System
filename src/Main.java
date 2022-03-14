import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Student Schedule System");

        Student student = new Student(new Name("Nikita", "Masenzov"), 223473059, LocalDate.of(2005, 4, 15), 11);

        Course course = new Course();

        System.out.println(student);


    }
}
