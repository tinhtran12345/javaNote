package arrayPackage;

public class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void showInfo() {
        System.out.println("Information of student: " + name + " and " + age);
    }
}
