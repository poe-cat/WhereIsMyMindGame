package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Key extends SuperObject {

    GamePanel gamePanel;

    public OBJ_Key(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        name = "Key";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
            uTool.scaleImage(image, gamePanel.tileSize, gamePanel.tileSize);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
