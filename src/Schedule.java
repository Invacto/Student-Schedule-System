import java.util.ArrayList;

public class Schedule {

    private Period[][] schedule;
    private int numOfPeriods;
    private int totalDayCycles;

    public Schedule(int numOfPeriods, int totalDayCycles) {
        schedule = new Period[numOfPeriods][totalDayCycles];
    }

    public Period[][] getSchedule() {
        return schedule;
    }

    public int getNumOfPeriods() {
        return numOfPeriods;
    }

    public int getTotalDayCycles() {
        return totalDayCycles;
    }

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

    public boolean setPeriod(Period period, int dayPeriod) {

        for (int i = 0; i < schedule[0].length; i++) {
            schedule[dayPeriod - 1][i] = period;
        }

        return true;
    }

    public void printSchedule() {
        for (int i = 0; i < schedule.length; i++) {

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

    public Period getPeriod(int dayPeriod, int dayCycle) {
        try {
            return schedule[dayPeriod - 1][dayCycle - 1];
        } catch (IndexOutOfBoundsException err) {
            return null;
        }
    }
}
