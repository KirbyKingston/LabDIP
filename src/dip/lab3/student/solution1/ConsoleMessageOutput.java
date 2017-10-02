
package dip.lab3.student.solution1;

/**
 *
 * @author Mitch
 */
public class ConsoleMessageOutput implements MessageOutputService{
    
    public final void ConsolMessageeOutput(String messageOutput) {
        outputMessage(messageOutput);
    }

    @Override
    public final void outputMessage(String messageOutput) {
        System.out.println("Message: " + messageOutput);
    }
    
}
