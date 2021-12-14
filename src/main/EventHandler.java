package main;

import java.awt.*;

public class EventHandler {

    GamePanel gamePanel;
    Rectangle eventRect;
    int eventRectDefaultX, eventRectDefaultY;

    public EventHandler(GamePanel gamePanel) {
        this.gamePanel = gamePanel;

        eventRect = new Rectangle();
        eventRect.x = 23;
        eventRect.y = 23;
        eventRect.width = 2;
        eventRect.height = 2;
        eventRectDefaultX = eventRect.x;
        eventRectDefaultY = eventRect.y;
    }

    public void checkEvent() {

        if(hit(27, 16, "right") == true) {damagePit(gamePanel.dialogueState);}
        if(hit(23,12,"up") == true) {healingPool(gamePanel.dialogueState);}

    }

    public boolean hit(int eventCol, int eventRow, String reqDirection) {

        boolean hit = false;

        gamePanel.player.solidArea.x = gamePanel.player.worldX + gamePanel.player.solidArea.x;
        gamePanel.player.solidArea.y = gamePanel.player.worldY + gamePanel.player.solidArea.y;
        eventRect.x = eventCol * gamePanel.tileSize + eventRect.x;
        eventRect.y = eventRow * gamePanel.tileSize + eventRect.y;

        if(gamePanel.player.solidArea.intersects(eventRect)) {
            if(gamePanel.player.direction.contentEquals(reqDirection) || reqDirection.contentEquals("any"))  {
                hit = true;
            }
        }

        gamePanel.player.solidArea.x = gamePanel.player.solidAreaDefaultX;
        gamePanel.player.solidArea.y = gamePanel.player.solidAreaDefaultY;
        eventRect.x = eventRectDefaultX;
        eventRect.y = eventRectDefaultY;

        return hit;
    }

    public void damagePit(int gameState) {
        gamePanel.gameState = gameState;
        gamePanel.ui.currentDialogue = "You fall into a pit!";
        gamePanel.player.life -= 1;
    }

    public void healingPool(int gameState) {
        if(gamePanel.keyHandler.enterPressed == true) {
            gamePanel.gameState = gameState;
            gamePanel.ui.currentDialogue = "Your life has been recovered!";
            gamePanel.player.life = gamePanel.player.maxLife;
        }
    }
}
