
package dip.lab3.student.solution1;

/**
 *
 * @author Mitch
 */
public class Startup {
    public static void main(String[] args) {
        
        //Console Test
        MessageService consoleMessageTest = new MessageService();
        
        String consoleInputTestMessage = consoleMessageTest.getConsoleMessageInput();
        consoleMessageTest.consoleMessageOutput(consoleInputTestMessage);
        
        
        //GUI Test
        MessageService guiMessageTest = new MessageService();
       
        String guiInputTestMessage = guiMessageTest.getGuiMessageInput();
        guiMessageTest.guiMessageOutput(guiInputTestMessage);
        
    }
}
