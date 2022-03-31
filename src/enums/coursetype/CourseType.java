package enums.coursetype;

import enums.ClassType;

import java.util.ArrayList;

public enum CourseType {
    DDP(ClassType.ART, false),
    BAND(ClassType.ART, true),
    CREATIVE_WRITING(ClassType.ENGLISH, true),
    CAPSTONE(ClassType.ENGLISH, true),
    ENGLISH09(ClassType.ENGLISH, false, 1),
    ENGLISH10(ClassType.ENGLISH, false, new CourseType[]{CourseType.ENGLISH09}, 2),
    ENGLISH11(ClassType.ENGLISH, false, new CourseType[]{CourseType.ENGLISH10}, 3),
    ENGLISH12(ClassType.ENGLISH, false, new CourseType[]{CourseType.ENGLISH11}, 4),
    HEALTH(ClassType.HEALTH, false),
    GYM(ClassType.HEALTH, false),
    POOL_GYM(ClassType.HEALTH, true),
    SPANISH(ClassType.FOREIGN_LANGUAGE, false),
    ITALIAN(ClassType.FOREIGN_LANGUAGE, false),
    FRENCH(ClassType.FOREIGN_LANGUAGE, false),
    CHINESE(ClassType.FOREIGN_LANGUAGE, false),
    ALGEBRA_1(ClassType.MATH, false, 1),
    GEOMETRY(ClassType.MATH, false, new CourseType[]{CourseType.ALGEBRA_1}, 2),
    ALGEBRA_2(ClassType.MATH, false, new CourseType[]{CourseType.GEOMETRY}, 3),
    PRE_CALCULUS(ClassType.MATH, false, new CourseType[]{CourseType.ALGEBRA_2}, 4),
    CALCULUS_AB(ClassType.MATH, true, new CourseType[]{CourseType.PRE_CALCULUS}, 5),
    CALCULUS_BC(ClassType.MATH, true, new CourseType[]{CourseType.CALCULUS_AB}, 6),
    AP_CSP(ClassType.MATH, false),
    AP_CSA(ClassType.MATH, true, new CourseType[]{CourseType.AP_CSP}),
    LIVING_ENVIRONMENT(ClassType.SCIENCE, false, 1),
    PHYSICS(ClassType.SCIENCE, false, new CourseType[]{CourseType.LIVING_ENVIRONMENT}, 2),
    CHEMISTRY(ClassType.SCIENCE, false, new CourseType[]{CourseType.PHYSICS}, 3),
    BIOLOGY(ClassType.SCIENCE, true, new CourseType[]{CourseType.CHEMISTRY}),
    PRE_AP_WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false, 1),
    WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false, new CourseType[]{CourseType.PRE_AP_WORLD_HISTORY}, 2),
    GLOBAL_HISTORY(ClassType.SOCIAL_STUDIES, false, new CourseType[]{CourseType.WORLD_HISTORY}, 3),
    US_HISTORY(ClassType.SOCIAL_STUDIES, false, new CourseType[]{CourseType.GLOBAL_HISTORY},4),
    US_GOVERNMENT(ClassType.SOCIAL_STUDIES, false, 5),
    EUROPEAN_HISTORY(ClassType.SOCIAL_STUDIES, true),
    ECONOMICS(ClassType.SOCIAL_STUDIES, true),
    CAFE(ClassType.LUNCH, false),
    MEZZ(ClassType.LUNCH, false),
    FRESHMAN_ADVISORY(ClassType.HEALTH, false);

    private final ClassType classType;
    private final boolean isElective;
    private final CourseType[] prerequisites;
    private final int level;

    CourseType(ClassType classType, boolean isElective, CourseType[] prerequisites, int level) {
        this.classType = classType;
        this.isElective = isElective;
        this.prerequisites = prerequisites;
        this.level = level;
    }

    CourseType(ClassType classType, boolean isElective, CourseType[] prerequisites) {
        this.classType = classType;
        this.isElective = isElective;
        this.prerequisites = prerequisites;

        level = -1;
    }

    CourseType(ClassType classType, boolean isElective, int level) {
        this.classType = classType;
        this.isElective = isElective;
        this.level = level;

        prerequisites = null;
    }

    CourseType(ClassType classType, boolean isElective) {
        this.classType = classType;
        this.isElective = isElective;

        level = -1;
        prerequisites = null;
    }

    public ClassType getClassType() {
        return classType;
    }

    public boolean isElective() {
        return isElective;
    }

    public CourseType[] getPrerequisites() {
        return prerequisites;
    }

    public int getLevel() {
        return level;
    }

    public static CourseType getClassTypeWithLevel(ClassType classType, int level) {

        for (CourseType courseType : CourseType.values()) {

            if (courseType.getClassType() == classType) {

                if (courseType.getLevel() == level) return courseType;
            }
        }

        return null;
    }

    public static ArrayList<CourseType> getCoursesWithClassTypeWithALevel(ClassType classType) {

        ArrayList<CourseType> results = new ArrayList<>();

        for (CourseType courseType : CourseType.values()) {

            if (courseType.getClassType() == classType && courseType.getLevel() != -1) {

                results.add(courseType);
            }
        }

        return results;
    }
}
