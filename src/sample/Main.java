package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {

    private Text text1 = new Text();
    private Text text2 = new Text();

    @Override
    public void start(Stage primaryStage) {

        text1.setFont(Font.font("", FontWeight.BOLD, 80));
        text1.setFill(Color.RED);
        text2.setFill(Color.BLUE);
        BorderPane bp = new BorderPane();

        bp.setTop(text1);
        bp.setCenter(text2);


        MainChar character = new MainChar(text1);
        Log log = new Log(text2);

        TextLogger logger = new TextLogger();
        logger.addObserver(log);
        logger.addObserver(character);

        Scene scene = new Scene(bp, 1000, 400);

        scene.getRoot().setOnKeyPressed(e -> {
            String s = e.getCode().getName();
            logger.setText(s);
        });

        scene.getRoot().requestFocus();
        primaryStage.setTitle("project");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}
