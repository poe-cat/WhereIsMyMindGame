package main;

import entity.NPC_OldMan;
import object.OBJ_Door;

public class AssetSetter {

    GamePanel gamePanel;

    public AssetSetter(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setObject() {

        gamePanel.obj[0] = new OBJ_Door(gamePanel);
        gamePanel.obj[0].worldX = gamePanel.tileSize * 21;
        gamePanel.obj[0].worldY = gamePanel.tileSize * 22;

        gamePanel.obj[1] = new OBJ_Door(gamePanel);
        gamePanel.obj[1].worldX = gamePanel.tileSize * 23;
        gamePanel.obj[1].worldY = gamePanel.tileSize * 25;

    }

    public void setNPC() {
        gamePanel.npc[0] = new NPC_OldMan(gamePanel);
        gamePanel.npc[0].worldX = gamePanel.tileSize * 21;
        gamePanel.npc[0].worldY = gamePanel.tileSize * 21;

        gamePanel.npc[1] = new NPC_OldMan(gamePanel);
        gamePanel.npc[1].worldX = gamePanel.tileSize * 11;
        gamePanel.npc[1].worldY = gamePanel.tileSize * 21;

        gamePanel.npc[2] = new NPC_OldMan(gamePanel);
        gamePanel.npc[2].worldX = gamePanel.tileSize * 31;
        gamePanel.npc[2].worldY = gamePanel.tileSize * 21;

        gamePanel.npc[3] = new NPC_OldMan(gamePanel);
        gamePanel.npc[3].worldX = gamePanel.tileSize * 21;
        gamePanel.npc[3].worldY = gamePanel.tileSize * 11;

        gamePanel.npc[4] = new NPC_OldMan(gamePanel);
        gamePanel.npc[4].worldX = gamePanel.tileSize * 21;
        gamePanel.npc[4].worldY = gamePanel.tileSize * 31;

    }
}
