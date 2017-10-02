
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mitch
 */
public class GuiMessageOutput implements MessageOutputService{

   public final void GuiMessageeOutput(String messageOutput) {
        outputMessage(messageOutput);
    }

    @Override
    public final void outputMessage(String messageOutput) {
        JOptionPane.showMessageDialog( null, messageOutput );
    }
    
}
