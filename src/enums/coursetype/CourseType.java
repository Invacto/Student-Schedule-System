package enums.coursetype;

import enums.ClassType;

public enum CourseType {
    DDP(ClassType.ART, false),
    BAND(ClassType.ART, true),
    CREATIVE_WRITING(ClassType.ENGLISH, true),
    CAPSTONE(ClassType.ENGLISH, true),
    ENGLISH09(ClassType.ENGLISH, false),
    ENGLISH10(ClassType.ENGLISH, false),
    ENGLISH11(ClassType.ENGLISH, false),
    ENGLISH12(ClassType.ENGLISH, false),
    HEALTH(ClassType.HEALTH, false),
    GYM(ClassType.HEALTH, false),
    POOL_GYM(ClassType.HEALTH, true),
    SPANISH(ClassType.FOREIGN_LANGUAGE, false),
    ITALIAN(ClassType.FOREIGN_LANGUAGE, false),
    FRENCH(ClassType.FOREIGN_LANGUAGE, false),
    CHINESE(ClassType.FOREIGN_LANGUAGE, false),
    ALGEBRA_1(ClassType.MATH, false),
    ALGEBRA_2(ClassType.MATH, false),
    PRE_CALCULUS(ClassType.MATH, false),
    CALCULUS_AB(ClassType.MATH, true),
    CALCULUS_BC(ClassType.MATH, true),
    AP_CSA(ClassType.MATH, true),
    LIVING_ENVIRONMENT(ClassType.SCIENCE, false),
    PHYSICS(ClassType.SCIENCE, false),
    CHEMISTRY(ClassType.SCIENCE, false),
    BIOLOGY(ClassType.SCIENCE, true),
    WORLD_HISTORY(ClassType.SOCIAL_STUDIES, false),
    GLOBAL_HISTORY(ClassType.SOCIAL_STUDIES, false),
    US_HISTORY(ClassType.SOCIAL_STUDIES, false),
    EUROPEAN_HISTORY(ClassType.SOCIAL_STUDIES, true),
    US_GOVERNMENT(ClassType.SOCIAL_STUDIES, true),
    ECONOMICS(ClassType.SOCIAL_STUDIES, true),
    CAFE(ClassType.LUNCH, false),
    MEZZ(ClassType.LUNCH, false);

    private final ClassType classType;
    private final boolean isElective;

    CourseType(ClassType classType, boolean isElective) {
        this.classType = classType;
        this.isElective = isElective;
    }

    public ClassType getClassType() {
        return classType;
    }

    public boolean isElective() {
        return isElective;
    }
}
