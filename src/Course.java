import enums.CourseType;

public class Course {

    private String name;
    private CourseType courseType;

    public Course(String name, CourseType courseType) {
        this.name = name;
        this.courseType = courseType;
    }

    public Course(CourseType courseType) {
        this.courseType = courseType;
        this.name = courseType.name();
    }

    public String getName() {
        return name;
    }

    public CourseType getCourseType() {
        return courseType;
    }
}
