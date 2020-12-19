import object.Direction;
import object.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GameClient extends JComponent {
    private int screenWidth;
    private int screenHeight;
    private Tank playerTank;

    public GameClient() {
        this(800, 600);

    }

    public GameClient(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

    }

    public void init() {
        playerTank = new Tank(400, 100, Direction.DOWN);
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }



    @Override
    public void paintComponent(Graphics g){
        g.drawImage(new ImageIcon("assets/images/itankD.png").getImage(),400,100,null);
    };
    public void keyPressed(KeyEvent e){
        Direction dirs=playerTank.getDirection();
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                dirs(0)=true;
                break;
            case KeyEvent.VK_DOWN:
                dirs(1)=true;
                break;
            case KeyEvent.VK_LEFT:
                dirs(2)=true;
                break;
            case KeyEvent.VK_RIGHT:
                dirs(3)=true;
                break;
        }
    }
    public void keyReleased(KeyEvent e) {
        boolean[] dirs = playerTank.getDirs();
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                dirs[0] = false;
                break;
            case KeyEvent.VK_DOWN:
                dirs[1] = false;
                break;
            case KeyEvent.VK_LEFT:
                dirs[2] = false;
                break;
            case KeyEvent.VK_RIGHT:
                dirs[3] = false;
                break;
        }
    }
    }


