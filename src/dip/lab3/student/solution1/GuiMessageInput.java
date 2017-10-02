
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Mitch
 */
public class GuiMessageInput implements MessageInputService{
    
    public final String GuiMessageInput() {
        return getMessageInput();
    }

    @Override
    public final String getMessageInput() {
        
        MessageValidationService v = new MessageValidationService();
      
        //JOptionPane.showInputDialog("Enter Message: ");
        
        String messageInput = JOptionPane.showInputDialog("Enter A Message: ");
        v.validateMessage(messageInput);
        return messageInput;       
    }
}
