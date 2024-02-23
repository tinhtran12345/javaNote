## I. Data structure là gì?

- Data structure chi ra cách tổ chức data trong memory
- Có 2 loại data structure

    - Primitive data structure: VD: int, char, float, double, ..., Primitive data structure có thể giữ single value.
    - Non-primitive data structure: Được chia thành 2 loại:

        - Linear data structure: Data được sắp xếp một cách tuần tự. VD: Array, LinkList, Queues, Stacks.(Note: một phần
          tử chỉ kết nối với một phẩn tử trong cùng một kiểu dữ liệu)
        - Non-linear data structure: Một phần tử có thể connect với n phẩn tử (elements). VD: trees, graphs (Note: Các
          phẩn tử được sắp xếp một cách ngẫu nhiên)

#### Note: Compile time vs run time?

- Link tham khảo: https://www.javatpoint.com/compile-time-vs-runtime


- Data structure được phân thành 2 loại:

    - Static data structure: là cấu trúc dữ liệu mà size của nó được cấp tại compile time. Mà maximum size được cố định
    - Dynamic data structure: Là cấu trúc dữ liệu mà size được cấp tại run time. Vì vậy maximum size của nó là flexible.

#### Note: Một số quy tắc đặt tên biến, hàm, class, package, ... trong java

- Tên packages: examplepackages,org.example.class ,...
- Tên Class: Customer, MyCustomer,...
- Tên Interface: INumerate
- Tên Method: getInformation
- Tên biến: orderNumber
- Tên hằng số: DEFAULT_WIDTH, MAX_HEIGHT

## II. Một số kiểu data structure phổ biến

### 1. Array

- All array are dynamically allocated
- Array may store in contiguous memory
- Array are objects in java, you can find length in object property
- A Java array variable can also be declared like other variables with [] after the data type.
- Variables in the array are ordered, and each has an index beginning with 0.
- Java array can also be used as a static field, a local variable, or a method parameter.

#### Note: Creating, Initializing and Accessing an Arrays

- Time Complexity: O(n)
- Auxiliary Space: O(1)

```java
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
```

### 2. Linked List

### 3. Stack

### 4. Queue

### 5. Tree

### 6. Graph

## III. OOPs, Interfaces, Classes

### 1. Method in Java

- Collection of statement to perform a certain task
- Advance: reusability, easy modification and readability
- Declare:

```java
public int sum(int a, int b) {

    // method body()
}
```

- Name of method such as: sum, areOfCircle, stringComparison

#### Note: Public vs Private vs Protect

- Public is accessible by all classes in application
- Private is accessible by self class where it is defined
- Protect is accessible within the same package or subclass in a different package

#### Note: Static method (is not object of class) vs Instance Method vs Abstract Method

- Instance method: Method of a class was called instance method. It's used to create a object of its class

```java

public class InstanceMethodExample {
    public static void main(String[] args) {
        InstanceMethodExample object = new InstanceMethodExample();
        System.out.println("This sum is :" + object.sum(12, 14));
    }

    int s;

    public int sum(int a, int b) {
        s = a + b;
        return s;
    }
}

```

        - Accessor method: using to read variables: such as getId, getUsers,...It returns the values of private field 
        - Mutator method: using to read and modify variables the value: such as setUsername, setRolls,... It does not return anything

- Abstract Method: no has method body and always declare abstract class

```java
abstract class People {
    abstract void disPlayName();
}

public class Man extends People {
    void disPlayName(String name) {
        System.out.println('Name of men is: ' + name);

    }

    public static void main(String[] args) {
        Man obj = new Man();
        man.disPlayName("User1");
    }
}

```

### 2. Class

- A class contains:

    - Fields
    - Methods
    - Constructors
    - Blocks
    - Nested class and interface

```java
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

    void setUsernameAndAge(String username, int age) {
        this.username = username;
        this.age = age;
    }

    static void disPlayUsingReference(String name, int age) {
        System.out.println(name + ":" + age);
    }

}
```

#### Note: `new` keyword is used to allocate memory in runtime (Heap memory area)

- Instance Variable: a variable is created inside class but outside method. It does not get memory in compile time, but
  get memory in run time when a object or instance is created

- Method: likely function

- 3 way to initialize object

`Initialization through reference`

```java
public class ExampleReference {
    private int x;
    private int y;

    private void displayValue() {
        System.out.println(this.x + ":" + this.y);

    }

    public static void main(String[] args) {
        ExampleReference obj = new ExampleReference();
        obj.x = 5;
        obj.y = 10;
        obj.displayValue();
    }
}

```

`Initialization through method`

```java
public class ExampleMethod {
    String name;
    int age;

    void setProfile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayProfile() {
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

```

`Initialization through constructor`

```java
public class ExampleConstructor {
    int x;

    public static void main(String[] args) {
        ExampleConstructor obj = new ExampleConstructor(6);
        obj.displayNumber();

    }

    public void displayNumber() {
        System.out.println("This number is: " + this.x);
    }

    public ExampleConstructor(int x) {
        this.x = x;
    }
}

```

### 3. Package in Java, Module in java

- Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces.
- Packages are used for:

    - Preventing name config. For example: For example: there can be 2 classes with name Employee in 2 packages such as
      college.staff.ecs.Employee and college.staff.ec.Employee
    - Making searching and usage of classes, interface, enumerations,...
    - Providing controller access: protected and default have package level access control. A protect member is
      accessible by classes in same packages and its subclasses. A default member is accessible by classes in the same
      packages only.
    - Packages can be considered as data encapsulation


- A package is a container of group of related class.
- Subpackages: Packages that is are inside another package (protected and default access)
- There are 2 type of packages:

    - Built-in packages

        - java.lang: Contain language support classes (primitive data, types math operations). This package is
          automatically imported.
        - java.io: Contain classes support input and output operation
        - java.util: Contain classes which implement data structures as linked list, queue,...
        - java.applet: Contain classes for creating Applets
        - java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus
          etc).
        - java.net: Contain classes for supporting network operations
    - User-defined packages

- Using static imported:
- Handling name configs:
- Directory structure

```java
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
```

#### Link tham khảo: https://docs.oracle.com/javase/tutorial/java/package/usepkgs.html

### 4. OOP concepts

+ Object-oriented program (OOP):

#### a. Abstraction

+   Abstraction is achieved by interface and abstract classes => can achieved 100% abstraction using interface.  

=> Abstract method contains only method declaration but not implementation.


#### b. Encapsulation.

+ Prevent the data from being accessing by code outside this shield.

+ Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.

#### c. Inheritance

+ Allow to inherit the features (fields and methods) of another class. We are achieving inheritance by using extends keyword.
+  Inheritance is also known as “is-a” relationship.

+ SuperClass or parentClass: The clas whose features are inherited.
+ SubClass: The class that inherit other class.
+ Reusability: Inheritance supports the concept of “reusability”

``` java
class A{
    void method1(){}

    void method2(){}

}
public class InheritanceExample extends  A {
    void method3(){}
    void method4(){}
}

```

#### d. Polymorphism

=> There is mainly of 2 types:

+ Overloading

+ Overriding


```java

public class PolymorphismExample {
    public int sum(int x, int y){
        return x+y;
    }

    public int sum (int x, int y, int z){
        return  x+y+z;
    }

    public double sum (double x, double y){
        return  x+y;
    }

    public static void main(String[] args) {
        PolymorphismExample s = new PolymorphismExample();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(1.3, 2.4));
    }
}

```


### Java class

+ Class is just a template or blueprint from which objects are created.

+ Class does not occupy memory

+ Class is a group of variables of different data types and group of methods.

+ A class in java can contain:

    + Data member
    + Method
    + Constructor
    + Nested Class
    + Interface



### 5. Memory Management

### 6. Exception handling

## IV. Files and API in Java

## V.Build tools

## VI. Web frameworks

## VII. Testing App
