
package dip.lab2.student.solution1;

/**
 *
 * @author Mitch
 */
public class TipService {
    private TipCalculator calc;

    public TipService(TipCalculator calc) {
        this.calc = calc;
    }
    
    public double calcTip(){
        return calc.calcTip();
    }
    
    public TipCalculator getCalc() {
        return calc;
    }

    public final void setCalc(TipCalculator calc) {
        this.calc = calc;
    }    
}
