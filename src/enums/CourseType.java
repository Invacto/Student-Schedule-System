package enums;

import java.util.ArrayList;

public enum CourseType {
    DDP(ClassType.ART, false),
    BAND(ClassType.ART, true),
    CREATIVE_WRITING(ClassType.ENGLISH, true),
    CAPSTONE(ClassType.ENGLISH, true),
    ENGLISH09(ClassType.ENGLISH, false, 1),
    ENGLISH10(ClassType.ENGLISH, false, 2),
    ENGLISH11(ClassType.ENGLISH, false, 3),
    ENGLISH12(ClassType.ENGLISH, false, 4),
    HEALTH(ClassType.HEALTH, false),
    GYM(ClassType.HEALTH, false),
    POOL_GYM(ClassType.HEALTH, true),
    SPANISH1(ClassType.FOREIGN_LANGUAGE, ForeignLangType.SPANISH, false, 1),
    SPANISH2(ClassType.FOREIGN_LANGUAGE, ForeignLangType.SPANISH, false, 2),
    SPANISH3(ClassType.FOREIGN_LANGUAGE, ForeignLangType.SPANISH, false, 3),
    SPANISH4(ClassType.FOREIGN_LANGUAGE, ForeignLangType.SPANISH, true, 4),
    ITALIAN1(ClassType.FOREIGN_LANGUAGE, ForeignLangType.ITALIAN, false, 1),
    ITALIAN2(ClassType.FOREIGN_LANGUAGE, ForeignLangType.ITALIAN, false, 2),
    ITALIAN3(ClassType.FOREIGN_LANGUAGE, ForeignLangType.ITALIAN, false, 3),
    ITALIAN4(ClassType.FOREIGN_LANGUAGE, ForeignLangType.ITALIAN, false, 4),
    FRENCH1(ClassType.FOREIGN_LANGUAGE, ForeignLangType.FRENCH, false, 1),
    FRENCH2(ClassType.FOREIGN_LANGUAGE, ForeignLangType.FRENCH, false, 2),
    FRENCH3(ClassType.FOREIGN_LANGUAGE, ForeignLangType.FRENCH, false, 3),
    FRENCH4(ClassType.FOREIGN_LANGUAGE, ForeignLangType.FRENCH, false, 4),
    CHINESE1(ClassType.FOREIGN_LANGUAGE, ForeignLangType.CHINESE, false, 1),
    CHINESE2(ClassType.FOREIGN_LANGUAGE, ForeignLangType.CHINESE, false, 2),
    CHINESE3(ClassType.FOREIGN_LANGUAGE, ForeignLangType.CHINESE, false, 3),
    CHINESE4(ClassType.FOREIGN_LANGUAGE, ForeignLangType.CHINESE, false, 4),
    ALGEBRA_1(ClassType.MATH, false, 1),
    GEOMETRY(ClassType.MATH, false, 2),
    ALGEBRA_2(ClassType.MATH, false, 3),
    PRE_CALCULUS(ClassType.MATH, false, 4),
    CALCULUS_AB(ClassType.MATH, false, 5),
    CALCULUS_BC(ClassType.MATH, false,  6),
    AP_CSP(ClassType.MATH, false),
    AP_CSA(ClassType.MATH, true),
    LIVING_ENVIRONMENT(ClassType.SCIENCE, false, 1),
    PHYSICS(ClassType.SCIENCE, false, 2),
    CHEMISTRY(ClassType.SCIENCE, false,  3),
    BIOLOGY(ClassType.SCIENCE, true),
    PRE_AP_WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false, 1),
    WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false, 2),
    GLOBAL_HISTORY(ClassType.SOCIAL_STUDIES, false, 3),
    US_HISTORY(ClassType.SOCIAL_STUDIES, false, 4),
    US_GOVERNMENT(ClassType.SOCIAL_STUDIES, false, 5),
    EUROPEAN_HISTORY(ClassType.SOCIAL_STUDIES, true),
    ECONOMICS(ClassType.SOCIAL_STUDIES, true),
    CAFE(ClassType.LUNCH, false),
    MEZZ(ClassType.LUNCH, false),
    FRESHMAN_ADVISORY(ClassType.HEALTH, false);

    private final ClassType classType;
    private final ForeignLangType foreignLangType;
    private final boolean isElective;
    private final int level;

    CourseType(ClassType classType, ForeignLangType foreignLangType, boolean isElective, int level) {
        this.classType = classType;
        this.foreignLangType = foreignLangType;
        this.isElective = isElective;
        this.level = level;
    }

    CourseType(ClassType classType, boolean isElective, int level) {
        this.classType = classType;
        this.isElective = isElective;
        this.level = level;

        foreignLangType = null;
    }

    CourseType(ClassType classType, boolean isElective) {
        this.classType = classType;
        this.isElective = isElective;

        foreignLangType = null;
        level = -1;
    }

    public ClassType getClassType() {
        return classType;
    }

    public int getLevel() {
        return level;
    }

    public ForeignLangType getForeignLangType() {
        return foreignLangType;
    }

    public boolean isElective() {
        return isElective;
    }

    /**
     * Returns a CourseType with a specific ClassType object attached and a specific level attached
     *
     * @param classType ClassType object
     * @param level level
     * @return CourseType object
     */
    public static CourseType getClassTypeWithLevel(ClassType classType, int level) {

        for (CourseType courseType : CourseType.values()) {

            if (courseType.getClassType() == classType) {

                if (courseType.getLevel() == level) return courseType;
            }
        }

        return null;
    }

    /**
     * Returns a list of CourseType object with a specific ClassType object attached
     *
     * @param classType ClassType object
     * @return ArrayList of CourseType
     */
    public static ArrayList<CourseType> getCoursesWithClassTypeWithALevel(ClassType classType) {

        ArrayList<CourseType> results = new ArrayList<>();

        for (CourseType courseType : CourseType.values()) {

            if (courseType.getClassType() == classType && courseType.getLevel() != -1) {

                results.add(courseType);
            }
        }

        return results;
    }

    /**
     * Returns a CourseType object with a specific ForeignLangType object attached and a specific level
     *
     * @param foreignLangType ForeignLangType object attached to CourseType
     * @param level level of CourseType
     * @return CourseType object
     */
    public static CourseType getForeignLangCourseWithTypeAndLevel(ForeignLangType foreignLangType, int level) {

        for (CourseType courseType : CourseType.values()) {

            if (courseType.getClassType() == ClassType.FOREIGN_LANGUAGE) {

                if (courseType.getForeignLangType() == foreignLangType) {
                    if (courseType.getLevel() == level) return courseType;
                }
            }
        }

        return null;
    }
}
