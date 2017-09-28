package dip.lab1.student.solution1;

/**
 * An implementation sub-class of an Employee_old. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Mitch
 */
public class HourlyEmployee implements Employee {
    
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private double hourlyRate;
    private double totalHrsForYear;

    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 1000) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }
    /*
    Set the cap too 2500 after looking up highest total hours being worked in a week.
    Highest in the world was mexico with 2,228.
    */
    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 2500) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.totalHrsForYear = totalHrsForYear;
    }

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    @Override
    public final double getAnualWages() {
        return hourlyRate * totalHrsForYear;
    }

}
