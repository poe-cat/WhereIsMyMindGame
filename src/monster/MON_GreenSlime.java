package monster;

import entity.Entity;
import main.GamePanel;

public class MON_GreenSlime extends Entity {

    public MON_GreenSlime(GamePanel gamePanel) {
        super(gamePanel);

        name = "Green Slime";
        speed = 1;
        maxLife = 4;
        life = maxLife;

        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }

    public void getImage() {

        up1 = setup("/monster/monster1");
        up2 = setup("/monster/monster2");
        down1 = setup("/monster/monster1");
        down2 = setup("/monster/monster2");
        left1 = setup("/monster/monster1");
        left2 = setup("/monster/monster2");
        right1 = setup("/monster/monster1");
        right2 = setup("/monster/monster2");
    }

    public void setAction() {

    }

}
