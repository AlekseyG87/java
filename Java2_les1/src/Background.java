import java.awt.*;

public class Background extends Sprite  {

    private final Color color;
    double col;
    double newCol;


    Background() {
        color = new Color(
                (int) (newCol=Math.random() * 255), //r
                (int) (newCol=Math.random() * 255), //g
                (int) (newCol=Math.random() * 255)  //b
        );
    }

    public void update(GameCanvas canvas, float deltaTime) {
        newCol += col * deltaTime;
    }


    public void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
    }
}