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

public class Student {
    private String firstName;
    private String lastName;

    public Student() {
        student() {}
    }
    public setFirstName(String first) {
        this.firstName = first;
    }
    public getFirstName() {
        return this.firstName;
    }
    public setLastName(String last) {
        this.lastName = last;
    }
    public getLastName() {
        return this.lastName;
    }
    public toString() {
        return this.firstName + " " + this.lastName;
    }
}

public class Course {
    private int number;
    private String subject;
    private String title;

    public Course() {
        Course() {}
    }
    public setNumber(int num) {
        this.number = num;
    }
    public getNumber() {
        return this.number;
    }
    public setSubject(String subject) {
        this.subject = subject;
    }
    public getSubject() {
        return this.subject;
    }
    public setTitle(String title) {
        this.title = title;
    }
    public getTitle() {
        return this.title;
    }
    public toString() {
        return (String) number + " " + subject + " " + title;
    }
}

public class IOManager {

    public static void readData(String[] args) {
        Student[] students
        for i in args {
            String[] str = args[i].split(" ");
            students[i].setFirstName(str[0]);
            students[i].setLastName(str[1]);
        }
        return students
    }
    public static void writeData(String[] args, Student[] students) {

    }

}