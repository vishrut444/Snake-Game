package snakegame;

import javax.swing.*;

/**
 *
 * @author vishrut
 */
public class SnakeGame extends JFrame {
    
      SnakeGame() {
        super("Snake Game");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
        
    }
    
}
