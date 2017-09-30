package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Mitch
 */
public class FoodServiceTipCalculator implements TipCalculator{
   
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private double billAmt;
    private double serviceQualityTipPercent;
 
    
    public final double getBillAmt() {
        return billAmt;
    }
    
    public final void setBillAmt(double billAmt) {
        if(billAmt < 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.billAmt = billAmt;
    }
    
    public final double getServiceQualityTipPercent() {
        return serviceQualityTipPercent;
    }
    
    public final void setServiceQualityTipPercent(double serviceQualityTipPercent) {
        if(serviceQualityTipPercent < 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.serviceQualityTipPercent = serviceQualityTipPercent;
    }
    
    @Override
    public final double calcTip() {
         return billAmt * serviceQualityTipPercent;
    }

}
