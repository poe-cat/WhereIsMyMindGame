package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Chest extends SuperObject {

    GamePanel gamePanel;

    public OBJ_Chest(GamePanel gamePanel) {
        name = "Chest";
        this.gamePanel = gamePanel;

        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
            uTool.scaleImage(image, gamePanel.tileSize, gamePanel.tileSize);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
