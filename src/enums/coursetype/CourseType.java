package enums.coursetype;

import enums.ClassType;

public enum CourseType {
    DDP(ClassType.ART, false),
    BAND(ClassType.ART, true),
    CREATIVE_WRITING(ClassType.ENGLISH, true),
    CAPSTONE(ClassType.ENGLISH, true),
    ENGLISH09(ClassType.ENGLISH, false),
    ENGLISH10(ClassType.ENGLISH, false, new CourseType[]{CourseType.ENGLISH09}),
    ENGLISH11(ClassType.ENGLISH, false, new CourseType[]{CourseType.ENGLISH10}),
    ENGLISH12(ClassType.ENGLISH, false, new CourseType[]{CourseType.ENGLISH11}),
    HEALTH(ClassType.HEALTH, false),
    GYM(ClassType.HEALTH, false),
    POOL_GYM(ClassType.HEALTH, true),
    SPANISH(ClassType.FOREIGN_LANGUAGE, false),
    ITALIAN(ClassType.FOREIGN_LANGUAGE, false),
    FRENCH(ClassType.FOREIGN_LANGUAGE, false),
    CHINESE(ClassType.FOREIGN_LANGUAGE, false),
    ALGEBRA_1(ClassType.MATH, false),
    GEOMETRY(ClassType.MATH, false, new CourseType[]{CourseType.ALGEBRA_1}),
    ALGEBRA_2(ClassType.MATH, false, new CourseType[]{CourseType.GEOMETRY}),
    PRE_CALCULUS(ClassType.MATH, false, new CourseType[]{CourseType.ALGEBRA_2}),
    CALCULUS_AB(ClassType.MATH, true, new CourseType[]{CourseType.PRE_CALCULUS}),
    CALCULUS_BC(ClassType.MATH, true, new CourseType[]{CourseType.CALCULUS_AB}),
    AP_CSP(ClassType.MATH, true),
    AP_CSA(ClassType.MATH, true, new CourseType[]{CourseType.AP_CSP}),
    LIVING_ENVIRONMENT(ClassType.SCIENCE, false),
    PHYSICS(ClassType.SCIENCE, false, new CourseType[]{CourseType.LIVING_ENVIRONMENT}),
    CHEMISTRY(ClassType.SCIENCE, false, new CourseType[]{CourseType.PHYSICS}),
    BIOLOGY(ClassType.SCIENCE, true, new CourseType[]{CourseType.CHEMISTRY}),
    PRE_AP_WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false),
    WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false, new CourseType[]{CourseType.PRE_AP_WORLD_HISTORY}),
    GLOBAL_HISTORY(ClassType.SOCIAL_STUDIES, false, new CourseType[]{CourseType.WORLD_HISTORY}),
    US_HISTORY(ClassType.SOCIAL_STUDIES, false, new CourseType[]{CourseType.GLOBAL_HISTORY}),
    EUROPEAN_HISTORY(ClassType.SOCIAL_STUDIES, true),
    US_GOVERNMENT(ClassType.SOCIAL_STUDIES, true),
    ECONOMICS(ClassType.SOCIAL_STUDIES, true),
    CAFE(ClassType.LUNCH, false),
    MEZZ(ClassType.LUNCH, false),
    FRESHMAN_ADVISORY(ClassType.HEALTH, false);

    private final ClassType classType;
    private final boolean isElective;
    private final CourseType[] prerequisites;

    CourseType(ClassType classType, boolean isElective, CourseType[] prerequisites) {
        this.classType = classType;
        this.isElective = isElective;
        this.prerequisites = prerequisites;
    }

    CourseType(ClassType classType, boolean isElective) {
        this.classType = classType;
        this.isElective = isElective;

        prerequisites = null;
    }

    public ClassType getClassType() {
        return classType;
    }

    public boolean isElective() {
        return isElective;
    }
}
