package sample;

plugins {
        id 'application'
        id 'org.openjfx.javafxplugin' version '0.0.9'
}

javafx {
        version = "15.0.1"
        modules = [ 'javafx.controls' ]
}

dependencies {
        implementation 'com.google.code.gson:gson:2.8.6'
}

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("First JavaFX Application");
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}

public void start(Stage stage) throws Exception {
        stage.setTitle("First JavaFX Application");
        Label label = new Label("Hello World, JavaFX!");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.show();
}

Gson gson = new Gson();

class SomeObject {
    private int value1 = 1;
    private String value2 = "abc";
    SomeObject() {} // no-args constructor req'd
}

SomeObject obj = new SomeObject();
String json = gson.toJson(obj);