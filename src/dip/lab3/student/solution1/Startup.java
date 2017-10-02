
package dip.lab3.student.solution1;

/**
 *
 * @author Mitch
 */
public class Startup {
    public static void main(String[] args) {
        
        //Console Test
//        MessageInputService testCI = new ConsoleMessageInput();
//        String consoleMessageTest = testCI.getMessageInput();
//        
//        MessageOutputService testCO = new ConsoleMessageOutput();
//        testCO.outputMessage(consoleMessageTest);
//        
//        
//        //GUI Test
//        MessageInputService testGI = new GuiMessageInput();
//        String guiMessageTest = testGI.getMessageInput();
//        
//        MessageOutputService testGO = new GuiMessageOutput();
//        testGO.outputMessage(guiMessageTest);
        
        
        
        
        MessageService guiMessageTest = new MessageService();
       
        String guiInputTestString = guiMessageTest.getGuiMessageInput();
        guiMessageTest.guiMessageOutput(guiInputTestString);

    }
}
