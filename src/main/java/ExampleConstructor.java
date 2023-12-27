public class ExampleConstructor {
    int x;

    public static void main(String[] args) {
        ExampleConstructor obj = new ExampleConstructor(6);
        obj.displayNumber();

    }

    public void displayNumber(){
        System.out.println("This number is: " + this.x);
    }

    public ExampleConstructor(int x){
        this.x = x;
    }
}

