
package snakegame;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author dellc
 */
public class SnakeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable()
            {
                public void run()
                {
                    JFrame frame= new JFrame();
                    frame.setTitle("Snake Game");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
    
}
