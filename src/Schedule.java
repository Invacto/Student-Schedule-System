public class Schedule {

    private Course[] courses;

    public Schedule(int numOfPeriods) {
        courses = new Course[numOfPeriods];
    }

    public int getNumOfPeriods() {
        return courses.length;
    }



}
