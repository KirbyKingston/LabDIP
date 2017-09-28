package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Mitch
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    
    public final static String REQUIRED_MSG = "This is a required field.";
    
    private double serviceQualityAdditionalRate;
    private double baseTipPerBag;
    private int bagCount;
    
    public final double getServiceQualityAdditionalRate() {
        return serviceQualityAdditionalRate;
    }

    public final void setServiceQualityAdditionalRate(double serviceQualityAdditionalRate) {
        if(serviceQualityAdditionalRate < 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.serviceQualityAdditionalRate = serviceQualityAdditionalRate;
    }
    
    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    @Override
    public final double calcTip() {
        return (baseTipPerBag+serviceQualityAdditionalRate)*bagCount;
    }   

}


