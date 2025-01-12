import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Dot {
    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawDot(GraphicsContext gc) {
        gc.setFill(Color.BLACK); // Set the color of the dot
        gc.fillRect(x, y, 1, 1); // Draw a single pixel dot
    }
}
