package datastructurePackage;

public class ExampleArray {
    public static void main(String[] args) {
        // declare
        int[] arr1;
        int[] arr2;
        // allocating memory to array
        arr1 = new int[3];
        arr2 = new int[5];
        // Array literal in javas
        int[] array3 = new int[]{1, 2, 3, 4};


        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            System.out.println(sum);
        }

    }
}
