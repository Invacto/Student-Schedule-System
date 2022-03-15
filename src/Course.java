import enums.ClassType;

import java.util.ArrayList;

public class Course {

    private String name;
    private ClassType classType;

    private ArrayList<Course> prerequisites;

    public Course(String name, ClassType classType, ArrayList<Course> prerequisites) {
        this.name = name;
        this.classType = classType;
        this.prerequisites = prerequisites;
    }

    public Course(String name, ClassType classType) {
        this.name = name;
        this.classType = classType;

        prerequisites = null;
    }

}
