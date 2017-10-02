
package dip.lab3.student.solution1;

/**
 *
 * @author Mitch
 */
public class MessageValidationService {
    
    public final static String REQUIRED_MSG = "The message cannot be empty, please enter a message.";
    
    public final boolean validateMessage(String messageInput) {
        if ((messageInput == null) || messageInput.equals("")) {
            throw new IllegalArgumentException(REQUIRED_MSG);       
        }
        return true;
    }
    
}
