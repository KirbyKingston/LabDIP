package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee_old. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Mitch
 */
public class SalariedEmployee implements Employee {
    
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private double annualSalary;
    private double annualBonus;

    public final double getAnnualSalary() {
        return annualSalary;
    }

    public final void setAnnualSalary(double annualSalary) {
        if(annualSalary < 0 || annualSalary > 1000000000) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.annualSalary = annualSalary;
    }

    public final double getAnnualBonus() {
        return annualBonus;
    }
    //Did not make it required in case they suck at their job.
    public final void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualSalary(annualBonus);
    }
    
    @Override
    public final double getAnualWages() {
        return annualSalary + annualBonus;
    }

}
