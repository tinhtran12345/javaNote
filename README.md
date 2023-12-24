## I. Data structure là gì?

- Data structure chi ra cách tổ chức data trong memory
- Có 2 loại data structure

    - Primitive data structure: VD: int, char, float, double, ..., Primitive data structure có thể giữ single value. 
    - Non-primitive data structure: Được chia thành 2 loại:

        - Linear data structure: Data được sắp xếp một cách tuần tự. VD: Array, LinkList, Queues, Stacks.(Note: một phần tử chỉ kết nối với một phẩn tử trong cùng một kiểu dữ liệu) 
        - Non-linear data structure: Một phần tử có thể connect với n phẩn tử (elements). VD: trees, graphs (Note: Các phẩn tử được sắp xếp một cách ngẫu nhiên)

#### Note: Compile time vs run time?

- Link tham khảo: https://www.javatpoint.com/compile-time-vs-runtime



- Data structure được phân thành 2 loại:

    - Static data structure: là cấu trúc dữ liệu mà size của nó được cấp tại compile time. Mà maximum size được cố định
    - Dynamic data structure: Là cấu trúc dữ liệu mà size được cấp tại run time. Vì vậy maximum size của nó là flexible.

    
## II. Một số kiểu data structure phổ biến

### 1. Array

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
public int sum (int a, int b){

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
    public static void main (String[] args){
        InstanceMethodExample object = new InstanceMethodExample();
        System.out.println("This sum is :" + object.sum(12, 14));
    }
    int s;
    public int sum(int a, int b){
        s = a+b;
        return s;
    }
}

```

        - Accessor method: using to read variables: such as getId, getUsers,...It returns the values of private field 
        - Mutator method: using to read and modify variables the value: such as setUsername, setRolls,... It does not return anything

- Abstract Method: no has method body and always declare abstract class 

```java
abstract class  People{
    abstract void  disPlayName();
}

public class Man extends People{
    void  disPlayName(String name){
        System.out.println('Name of men is: '+ name);
        
    }
    
    public static void main(String[] args){
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

#### Note: `new` keyword is used to allocate memory in runtime (Heap memory area)

- Instance Variable: a variable is created inside class but outside method. It does not get memory in compile time, but get memory in run time when a object or instance is created 

- Method: likely function

- 3 way to initialize object

  - Initialization through reference
  - Initialization through method
  - Initialization through constructor
  
### 3. Interface and relationship between class and interface



### 4. OOP concepts


### 5. Exception handling

## IV. Files and API in Java


## V.Build tools


## VI. Web frameworks


## VII. Testing App
