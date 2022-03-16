import enums.ClassType;
import enums.coursetype.CourseType;

import java.util.ArrayList;

public class Course {

    private String name;
    private CourseType courseType;

    private ArrayList<Course> prerequisites;

    public Course(String name, CourseType courseType, ArrayList<Course> prerequisites) {
        this.name = name;
        this.courseType = courseType;
        this.prerequisites = prerequisites;
    }

    public Course(CourseType courseType, ArrayList<Course> prerequisites) {
        this.courseType = courseType;
        this.prerequisites = prerequisites;

        this.name = courseType.name();
    }

    public Course(String name, CourseType courseType) {
        this.name = name;
        this.courseType = courseType;

        prerequisites = null;
    }

    public Course(CourseType courseType) {
        this.courseType = courseType;

        name = courseType.name();
        prerequisites = null;
    }

    public String getName() {
        return name;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }
}
