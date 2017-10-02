
package dip.lab3.student.solution1;

/**
 *
 * @author Mitch
 */
public class Startup {
    public static void main(String[] args) {
        
        //Console Test
        MessageService consoleMessageTest = new MessageService();
        
        String consoleInputTestString = consoleMessageTest.getConsoleMessageInput();
        consoleMessageTest.consoleMessageOutput(consoleInputTestString);
        
        
        //GUI Test
        MessageService guiMessageTest = new MessageService();
       
        String guiInputTestString = guiMessageTest.getGuiMessageInput();
        guiMessageTest.guiMessageOutput(guiInputTestString);
        
    }
}
