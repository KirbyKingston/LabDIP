
package dip.lab3.student.solution1;

/**
 *
 * @author Mitch
 */
public class MessageService {

    MessageInputService consoleMessageInput = new ConsoleMessageInput();
    MessageInputService guiMessageInput = new GuiMessageInput();
        
    MessageOutputService consoleMessageOutput = new ConsoleMessageOutput();
    MessageOutputService guiMessageOutput = new GuiMessageOutput();
    
    public final String getConsoleMessageInput() {
        return consoleMessageInput.getMessageInput();
    }
    
    public final String getGuiMessageInput() {
        return guiMessageInput.getMessageInput();
    }
    
    public final void consoleMessageOutput(String messageOutput) {
        consoleMessageOutput.outputMessage(messageOutput);
    }
    
    public final void guiMessageOutput(String messageOutput) {
        guiMessageOutput.outputMessage(messageOutput);
    }
}