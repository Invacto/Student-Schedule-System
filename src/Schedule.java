import java.util.ArrayList;

public class Schedule {

    private Period[][] schedule;

    private int numOfPeriods;
    private int totalDayCycles;

    /**
     * Instantiates a new Schedule Object to be assigned to a Student object
     *
     * @param numOfPeriods Number of Periods in a day
     * @param totalDayCycles Total number of day cycles
     */
    public Schedule(int numOfPeriods, int totalDayCycles) {
        schedule = new Period[numOfPeriods][totalDayCycles];
    }

    /**
     * Returns Schedule 2D array
     *
     * @return Schedule 2D array
     */
    public Period[][] getSchedule() {
        return schedule;
    }

    /**
     * Returns number of periods
     *
     * @return number of periods
     */
    public int getNumOfPeriods() {
        return numOfPeriods;
    }

    /**
     * Returns number of day cycles
     *
     * @return number of day cycles
     */
    public int getTotalDayCycles() {
        return totalDayCycles;
    }

    /**
     * Sets the Period at a specific location in the Schedule based on Period and Day Cycle
     *
     * @param period Period object
     * @param dayPeriod period of day
     * @param dayCycles array of specific day cycles
     * @return if Period was set successfully
     */
    public boolean setPeriod(Period period, int dayPeriod, int[] dayCycles) {

        for (int dayCycle : dayCycles) {
            try {
                schedule[dayPeriod - 1][dayCycle - 1] = period;
            } catch (IndexOutOfBoundsException err) {
                return false;
            }
        }

        return true;
    }

    /**
     * Sets the Period at a specific location in the Schedule based on Period and all Day Cycles
     *
     * @param period Period object
     * @param dayPeriod period of day
     * @return if Period was set successfully
     */
    public boolean setPeriod(Period period, int dayPeriod) {

        for (int i = 0; i < schedule[0].length; i++) {
            schedule[dayPeriod - 1][i] = period;
        }

        return true;
    }

    /**
     * Returns Period based on period of day and day cycle
     *
     * @param dayPeriod period of day
     * @param dayCycle day cycle
     * @return Period object
     */
    public Period getPeriod(int dayPeriod, int dayCycle) {
        try {
            return schedule[dayPeriod - 1][dayCycle - 1];
        } catch (IndexOutOfBoundsException err) {
            return null;
        }
    }

    /**
     * Prints a 2D version of the Schedule displaying the Course name, Teacher's last name, and room number
     */
    public void printSchedule() {
        for (int i = 0; i < schedule.length; i++) {

            System.out.print(i + 1 + ") ");

            for (int j = 0; j < schedule[0].length; j++) {
                try {
                    System.out.print("[" + schedule[i][j].getName());

                    try {
                        System.out.print(", " + schedule[i][j].getTeacher().getFullName().getLastName());
                    } catch (NullPointerException err) {
                        System.out.print(" N/A");
                    }

                    System.out.print(", " + schedule[i][j].getRoomNumber() + "]");

                } catch (NullPointerException err) {
                    System.out.print("N/A ");
                }
            }

            System.out.println();
        }
    }
}
