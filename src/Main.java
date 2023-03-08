import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class Main extends Application {
    int currentImage;


    @Override
    public void start(Stage primaryStage) throws Exception {

        // Construct your controls
        FileInputStream input1 = new FileInputStream("PBS.jpg");
        Image image1 = new Image(input1);
        ImageView imageView = new ImageView(image1);
        imageView.setFitHeight(200);
        imageView.setFitHeight(500);

        FileInputStream input2 = new FileInputStream("Quannt.jpeg");
        Image image2 = new Image(input2);
        imageView.setImage(image2);

        currentImage = 2;

        Button button1 = new Button("Rubberband man");
        button1.setText("RubberBandMan");
        button1.setOnAction (actionEvent -> {
            if (currentImage == 2) {
                imageView.setImage(image1);
                        currentImage =1;
            }
        });





        // Layout your controls
        HBox hbox = new HBox(imageView,button1);
        Scene scene = new Scene(hbox, 400, 200);

        // Put the layout into the scene
        primaryStage.setTitle("ImageView Experiment 1");
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First JavaFX App");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}