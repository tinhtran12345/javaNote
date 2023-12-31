package examplePackage;
import java.util.*;
public class ExampleLinkList {
    public static void main(String[] args) {
        Collection<String> list = new LinkedList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println(list);
        list.add("End");
        System.out.println(list);
    }

}
