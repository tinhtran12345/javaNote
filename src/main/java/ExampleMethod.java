public class ExampleMethod {
    String name;
    int age;

    void setProfile(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayProfile(){
        System.out.println(this.name + " : " + this.age);
    }




    public static void main(String[] args) {
        ExampleMethod obj1 = new ExampleMethod();
        obj1.setProfile("User1", 19);
        obj1.displayProfile();
        ExampleMethod obj2 = new ExampleMethod();
        obj2.setProfile("User2", 9);
        obj2.displayProfile();
    }
}