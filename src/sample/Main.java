package sample;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    private Pane root;

    @Override
    public void start(Stage stage) throws Exception {

        root = createMenu();

        Scene scene = new Scene(root);
        stage.getIcons().add(new Image("basiak.png"));
        stage.setScene(scene);
        stage.setTitle("Path Of The Ancient Hero");
        stage.setMinWidth(1300);
        stage.setMinHeight(700);
        stage.setX(30);
        stage.setY(0);
        stage.show();
    }


    public static void main(String[] args) {
        JFXPanel panel = new JFXPanel();

        final URL songPath = Main.class.getResource("/music/menu_theme.mp3");
        Media sound = new Media(songPath.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        launch(args);

    }

    public Pane createMenu(){
        root = new Pane();

        Button play = new Button("New game");
        play.setPrefHeight(50);
        play.setPrefWidth(200);
        play.setTranslateX(1000);
        play.setTranslateY(150);
        play.setOnMouseClicked(event -> {
            createNewGameWindow();
        });

        Button load = new Button("Load game");
        load.setPrefHeight(50);
        load.setPrefWidth(200);
        load.setTranslateX(1000);
        load.setTranslateY(250);
        load.setOnMouseClicked(event -> {
            createLoadGameWindow();
        });

        Button settings = new Button("Settings");
        settings.setPrefHeight(50);
        settings.setPrefWidth(200);
        settings.setTranslateX(1000);
        settings.setTranslateY(350);
        settings.setOnMouseClicked(event -> {
            createSettingsWindow();
        });

        Button quit = new Button("Quit game");
        quit.setPrefHeight(50);
        quit.setPrefWidth(200);
        quit.setTranslateX(1000);
        quit.setTranslateY(450);

        quit.setOnMouseClicked(event -> {
            System.exit(0);
        });

        Text title = new Text("Path Of The Ancient Hero");
        title.setFont(Font.font("Arial", 50));
        title.setX(200);
        title.setY(130);

        ImageView imgV = new ImageView(new Image("menu_image.png"));
        imgV.setX(0);
        imgV.setY(0);
        imgV.setFitWidth(1300);
        imgV.setFitHeight(700);

        root.getChildren().add(imgV);
        root.getChildren().add(title);
        root.getChildren().add(play);
        root.getChildren().add(load);
        root.getChildren().add(settings);
        root.getChildren().add(quit);

        return root;
    }

    private void createNewGameWindow(){
        root.getChildren().clear();
    }
    private void createLoadGameWindow(){
        root.getChildren().clear();
    }
    private void createSettingsWindow(){
        root.getChildren().clear();
    }

}
