package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    private final int originalTileSize = 16;
    private final int scale = 3;

    private final int tileSize = originalTileSize * scale; //40x40 tile
    private final int maxScreenCol = 16;
    private final int maxScreenRow = 12;
    private final int screenWidth = tileSize * maxScreenCol; //760 pixels
    private final int screenHeight = tileSize * maxScreenRow; //576 pixels

    KeyHandler keyHandler = new KeyHandler();
    Thread gameThread;

    //set player's default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyHandler);
        this.setFocusable(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while(gameThread != null) {

            long currentTime = System.nanoTime();
            System.out.println("current time " + currentTime);


            update();
            repaint();
        }
    }

    public void update() {
        if(keyHandler.upPressed == true) {
            playerY -= playerSpeed;
        }
        else if(keyHandler.downPressed == true) {
            playerY += playerSpeed;
        }
        else if(keyHandler.leftPressed == true) {
            playerX -= playerSpeed;
        }
        else if(keyHandler.rightPressed == true) {
            playerX += playerSpeed;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(playerX, playerY, tileSize, tileSize);
        g2.dispose();
    }
}
