import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TankGame {
    public static void main(String[] args) {
        GameClient gameClient = new GameClient();
        JFrame frame = new JFrame();
        frame.add(gameClient);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        gameClient.repaint();


        };


    }


