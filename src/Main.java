import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Student Schedule System");

        Student student = new Student(new Name("John", "Winterland"), new OSIS(549873516), LocalDate.of(2005, 7, 18));

        System.out.println(student);


    }
}
