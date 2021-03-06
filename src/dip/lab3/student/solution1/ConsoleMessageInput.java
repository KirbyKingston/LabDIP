
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class ConsoleMessageInput implements MessageInputService{
    
    public final String ConsoleMessageInput() {
        return getMessageInput();
    }
    
    @Override
    public final String getMessageInput() {
        
        MessageValidationService v = new MessageValidationService();
        Scanner keyboard = new Scanner(System.in);
      
        System.out.print("Enter Message: ");
        
        String messageInput = keyboard.nextLine();
        v.validateMessage(messageInput);
        return messageInput;       
    }
    
}
