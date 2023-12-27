public class ExampleReference {
    private int x;
    private int y;

    private void displayValue(){
        System.out.println(this.x +  ":" + this.y);

    }

    public static void main(String[] args) {
        ExampleReference obj = new ExampleReference();
        obj.x = 5;
        obj.y = 10;
        obj.displayValue();
    }
}
