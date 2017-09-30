
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Mitch
 */
public class ConsoleMessageInput implements MessageInputService{
    
    public String ConsoleMessageInput() {
        return getMessageInput();
    }
    
    @Override
    public String getMessageInput() {
        
        Scanner keyboard = new Scanner(System.in);
      
        System.out.print("Enter Message Input: ");
        
        String input = keyboard.nextLine();
        return input;       
    }
    
}
