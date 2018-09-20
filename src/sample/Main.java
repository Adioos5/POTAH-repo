package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
        launch(args);
        System.out.println("chuj");
    }

    public Pane createMenu(){
        root = new Pane();

        Button play = new Button("New game");
        play.setPrefHeight(50);
        play.setPrefWidth(200);
        play.setTranslateX(100);
        play.setTranslateY(150);
        play.setOnMouseClicked(event -> {
            createNewGameWindow();
        });

        Button load = new Button("Load game");
        load.setPrefHeight(50);
        load.setPrefWidth(200);
        load.setTranslateX(100);
        load.setTranslateY(250);
        load.setOnMouseClicked(event -> {
            createLoadGameWindow();
        });

        Button settings = new Button("Settings");
        settings.setPrefHeight(50);
        settings.setPrefWidth(200);
        settings.setTranslateX(100);
        settings.setTranslateY(350);
        settings.setOnMouseClicked(event -> {
            createSettingsWindow();
        });

        Button quit = new Button("Quit game");
        quit.setPrefHeight(50);
        quit.setPrefWidth(200);
        quit.setTranslateX(100);
        quit.setTranslateY(450);

        quit.setOnMouseClicked(event -> {
            System.exit(0);
        });

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
