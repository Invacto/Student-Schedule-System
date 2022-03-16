public class Period {

    private String name;
    private Course course;
    private Teacher teacher;
    private String roomNumber;

    public Period(String name, Course course, Teacher teacher, String roomNumber) {
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.roomNumber = roomNumber;
    }

    public Period(Course course, Teacher teacher, String roomNumber) {
        this.course = course;
        this.teacher = teacher;
        this.roomNumber = roomNumber;

        name = course.getName();
    }

    public Period(Course course, String roomNumber) {
        this.course = course;
        this.roomNumber = roomNumber;

        name = course.getName();
        teacher = null;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}
