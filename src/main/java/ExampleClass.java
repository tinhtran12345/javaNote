public class ExampleClass {
    String username;
    int age;

    public static void main(String[] args) {
        ExampleClass people = new ExampleClass();
        people.setUsernameAndAge("User2", 20);
        System.out.println(people.username + ":" + people.age);
        people.username = "User1";
        people.age = 18;
        disPlayUsingReference(people.username, people.age);
    }

    static void disPlayUsingReference(String name, int age) {
        System.out.println(name + ":" + age);
    }

    void setUsernameAndAge(String username, int age) {
        this.username = username;
        this.age = age;
    }

}
