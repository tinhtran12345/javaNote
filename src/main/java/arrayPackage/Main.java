package arrayPackage;

public class Main {
    public static void main(String[] args) {
        Student person = new Student(19, "Alex");
        person.showInfo();

        Student[] p = new Student[3];
        p[0] = new Student(20, "Prov");
        p[1] = new Student(25, "Peter");
        p[2] = new Student(30, "Strange");
        for (int i = 0; i < 3; i++) {
            p[i].showInfo();

        }
        Parent newParent = new Parent();
        Parent newChild = new Child();
        newParent.show("MJ");
        newChild.show("Obama");
    }
}
