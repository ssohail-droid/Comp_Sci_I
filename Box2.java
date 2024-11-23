import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import java.lang.Math;

public class Box2 extends Application{

    public static void main(String[] args) {
        launch(args);
    }
 
    @Override //DONT MAKE ANY CHANGES HERE
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    //Write all changes to code in this method.
    public void drawShapes(GraphicsContext gc){
        int x, y;
        
        gc.setFill(Color.BLACK);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y,100, 100);
        
        gc.setFill(Color.GREEN);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.BLUE);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.RED);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.PINK);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.BROWN);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.YELLOW);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.PURPLE);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        gc.setFill(Color.TEAL);
        x = (int)(Math.random() * 401);
        y = (int)(Math.random() * 401);
        gc.fillRect(x, y, 100, 100);
        
        
        
        
        gc.restore();
    }
}
