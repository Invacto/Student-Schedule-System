import enums.ClassType;
import enums.coursetype.ArtCourse;

import java.util.ArrayList;

public class Course {

    private String name;
    private ClassType classType;

    private ArrayList<Course> prerequisites;
    private ArrayList<ArtCourse> enums;

    public Course() {
        enums = new ArrayList<>();
        enums.add(ArtCourse.BAND);

        System.out.println(enums.get(0));
        System.out.println(enums.get(0).getLabel());
    }

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
