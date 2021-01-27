package sample;

public class Controller {
}

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