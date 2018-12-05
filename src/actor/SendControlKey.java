/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kyokuto
 */
public class SendControlKey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mouse.mouseClick(Integer.parseInt("100"),Integer.parseInt("100"));
        try {
            Robot robot = new Robot();
           // robot.mouseMove(100, 100);
           // robot.mousePress(1);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_1);
        } catch (AWTException ex) {
            Logger.getLogger(SendControlKey.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void testSendKey(){
                Mouse.mouseClick(Integer.parseInt("100"),Integer.parseInt("100"));
        try {
            Robot robot = new Robot();
           // robot.mouseMove(100, 100);
           // robot.mousePress(1);
            robot.keyPress(KeyEvent.VK_0);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_1);
        } catch (AWTException ex) {
            Logger.getLogger(SendControlKey.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
