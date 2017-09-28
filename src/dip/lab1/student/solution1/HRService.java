package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author Mitch
 */
public class HRService {
    
    public enum WageType {
        SALARIED,
        HOURLY
    }

    public final double getAnnualCompensationForEmployee(Employee e){
        return e.getAnnualWages();
    }
}
