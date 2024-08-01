# **Reference Video** -

https://www.youtube.com/watch?v=BGTx91t8q50

# **code reference**

https://github.com/navinreddy20/Javacode/tree/main

# **Simple Implementation of java**

class Calculator{
public int add(int a,int b){
return a+b;
}
}
public class Hello {
public static void main(String[] args) {
System.out.println("Hello, World!");

        int a=5,b=10;
        Calculator obj=new Calculator();
        System.out.println(obj.add(a,b));
    }

}

# **Method Overloading**

class Calculator{
public int add(int a,int b){
return a+b;
}
public int add(int a,int b,int c){
return a+b+c;
}
public double add(double a,double b){
return a+b;
}
}
public class Hello {
public static void main(String[] args) {
int a=5,b=10,c=5;
double f=9.0,d=8.6;
Calculator obj=new Calculator();
System.out.println(obj.add(a,b));
System.out.println(obj.add(a,b,c));
System.out.println(obj.add(f,d));
}
}

# **Stack and heap**

public class Example {
// Instance variable (stored in heap)
int instanceVariable;

    // Constructor
    public Example(int value) {
        this.instanceVariable = value; // Accesses heap-stored instanceVariable
    }

    // Method with local variable (stored in stack)
    public void display() {
        // Local variable (stored in stack)
        int localVariable = 10;

        // Accesses instance variable from the heap
        System.out.println("Instance Variable: " + instanceVariable);

        // Accesses local variable from the stack
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        Example obj = new Example(5); // 'obj' reference variable is stored on stack, but the object is on heap

        obj.display(); // Calls method, and localVariable is stored in the stack frame of 'display'
    }

}
Heap: Stores the Example object and its instanceVariable.
Stack: Stores localVariable during the execution of the display method and the reference variable obj in the main method.

# **Jagged array**

public class JaggedArrayExample {
public static void main(String[] args) {
int[][] jaggedArray = {
{1, 2},
{3, 4, 5, 6},
{7, 8, 9}
};

        // Accessing and printing elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}

# **For each loop**

int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
System.out.println(numbers[i]);
}

int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
System.out.println(number);
}

# **Static variable**

class Mobile{
String brand;
int price;
String network;
static String name;
public void show() {
System.out.println(brand+" : "+price+" : "+name);
}
}
public class Demo {
public static void main(String[] args)
{
Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=1500;
Mobile.name="SmartPhone"; //Static variables should be called with their class names and not with objects
Mobile obj2=new Mobile();
obj2.brand="Samsung";
obj2.price=1700;
Mobile.name="SmartPhone";
Mobile.name="SmartPhone";
obj1.show();
obj2.show();
}
}

# **Static block**

class StaticBlockExample {
static int staticVariable;
static String staticString;

    // Static block for initialization
    static {
        staticVariable = 10;
        staticString = "Hello, World!";
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
        // Accessing static variables
        System.out.println("Static Variable: " + staticVariable); // Output: Static Variable: 10
        System.out.println("Static String: " + staticString); // Output: Static String: Hello, World!
    }

}

# **Static Method**

class Mobile{
String brand;
int price;
String network;
static String name;
public void show() {
System.out.println(brand+" : "+price+" : "+name);
}
public static void show1(Mobile obj) //passed obj to use non-static variable inside a static method. using object reference
{
// System.out.println("in static method");
//can use a static variable inside a static method but cannot use a non-static variable inside a static method
System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
}
}

public class Demo {
public static void main(String[] args)
{
Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=1500;
Mobile.name="SmartPhone";
Mobile obj2=new Mobile();
obj2.brand="Samsung";
obj2.price=1700;
Mobile.name="SmartPhone";
Mobile.name="SmartPhone";
obj1.show();
obj2.show(); // call non static method with object name
Mobile.show1(obj1); // can call static method with class name, also passing obj1 to use non-static variable inside a static method
}
}

# **Encapsulation**

if we are using public variables and accessing them by using objects then thinking from a real world pov , it is not safe for everything to be accessible.
so make the variables private ; now they are accessible within the same class
NOTE : Every time you create an instance variable, make it private . No one from the outside world should be able to use it.

Now to access the data(private variables) we use getter and setter methods

We bind the data with methods or encapsulate the data with methods. This is encapsulation
Encapsulation is one of the fundamental principles of object-oriented programming (OOP). It refers to the bundling of data (variables) and methods (functions) that operate on the data into a single unit, typically a class, and restricting direct access to some of the object's components. This means that the internal representation of an object is hidden from the outside, and only specific methods are exposed to interact with the object's data.

Benefits of Encapsulation
Control Over Data: By providing controlled access to the fields, you can enforce constraints and ensure that the data remains valid.
Improved Maintainability: Encapsulation makes the code more maintainable by separating the internal implementation from the external interface. Changes to the internal implementation do not affect external code that uses the class.
Increased Flexibility: You can change the internal implementation without changing the external interface. This allows for easier updates and improvements to the code.
Enhanced Security: Encapsulation protects the internal state of an object from unintended or unauthorized access and modification.

# **Constructor**

**default constructor -**

class Human {
private int age;
private String name;

    // Default constructor
    public Human() {
        this.age = 0;
        this.name = "Unknown";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Main {
public static void main(String[] args) {
Human obj = new Human(); // Default constructor is called
System.out.println(obj.getName() + " : " + obj.getAge());
}
}

**parameterized constructor-**

class Human {
private int age;
private String name;

    // Parameterized constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Main {
public static void main(String[] args) {
Human obj = new Human(30, "Reddy"); // Parameterized constructor is called
System.out.println(obj.getName() + " : " + obj.getAge());
}
}

**example of constructor overloading-**
class Human {
private int age;
private String name;

    // Default constructor
    public Human() {
        this(0, "Unknown"); // Calls the parameterized constructor
    }

    // Parameterized constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class Main {
public static void main(String[] args) {
Human obj = new Human(); // Default constructor is called, which calls the parameterized constructor
System.out.println(obj.getName() + " : " + obj.getAge());
}
}

# **This vs Super keyword**

In every constructor , by default there is a super, even if it is not mentioned

super() = means to call the constructor of the super class
this() = execute the constructor of the same class

_implementation of super-_

class Animal {
String color = "white";
public Animal() {
System.out.println("Animal is created");
}
public void eat() {
System.out.println("Animal is eating");
}
}
class Dog extends Animal {
String color = "black";
public Dog() {
super(); // Calls the constructor of Animal class
System.out.println("Dog is created");
}
public void displayColor() {
System.out.println(super.color); // Refers to superclass variable color
}
public void eat() {
super.eat(); // Calls the eat method of Animal class
System.out.println("Dog is eating");
}
}
public class Main {
public static void main(String[] args) {
Dog d = new Dog();
d.displayColor(); // Displays color of Animal class
d.eat(); // Calls the eat method of Dog class, which in turn calls the eat method of Animal class
}
}

output-
Animal is created
Dog is created
white
Animal is eating
Dog is eating

explanation-
When the Dog object d is created, the constructor of the Dog class is called.
The Dog constructor calls the super() method, which invokes the constructor of the Animal class.
The Animal constructor prints "Animal is created".
Control returns to the Dog constructor, which prints "Dog is created".
The displayColor method of the Dog class is called, which prints the color variable from the Animal class (using super.color), so it prints "white".
The eat method of the Dog class is called, which first calls the eat method of the Animal class (using super.eat()), printing "Animal is eating".
After that, the eat method of the Dog class continues and prints "Dog is eating".

_this keyword_

class A
{
public A()
{
super();
System.out.println("in A");
}
public A(int n)
{
super();
System.out.println("in A int");
}
}

class B extends A
{
public B()
{
super();
System.out.println("in B");
}
public B(int n)
{
this(); //call constructor of same class (the above one)
System.out.println("in B int");
}
}
public class Demo {
public static void main(String[] args)
{
// B obj=new B();
B obj=new B(5);
}
}

output-
in A
in B
in B int

explanation-
The main method creates an instance of B using the parameterized constructor: B obj = new B(5);.
The parameterized constructor of B (B(int n)) is called with n = 5.
Inside the B(int n) constructor, the this() statement calls the default constructor of B (B()).
The default constructor of B calls the default constructor of A (super()).
The default constructor of A prints "in A".
Control returns to the default constructor of B, which then prints "in B".
Control returns to the parameterized constructor of B, which then prints "in B int".

another explanation-
When new B(5) is called, the parameterized constructor of B is invoked.
this() within B(int n) calls the default constructor B().
The default constructor B() calls the default constructor A(), which prints "in A".
Then, B() prints "in B".
Control returns to the B(int n) constructor, which finally prints "in B int".

# **Inheritance**

Single
class Animal {
void eat() {
System.out.println("Animal is eating");
}
}
class Dog extends Animal {
void bark() {
System.out.println("Dog is barking");
}
}
public class Main {
public static void main(String[] args) {
Dog d = new Dog();
d.eat(); // Inherited method from Animal class
d.bark(); // Method from Dog class
}
}

Multilevel-
class Animal {
void eat() {
System.out.println("Animal is eating");
}
}
class Dog extends Animal {
void bark() {
System.out.println("Dog is barking");
}
}
class Puppy extends Dog {
void weep() {
System.out.println("Puppy is weeping");
}
}
public class Main {
public static void main(String[] args) {
Puppy p = new Puppy();
p.eat(); // Inherited method from Animal class
p.bark(); // Inherited method from Dog class
p.weep(); // Method from Puppy class
}
}

Multiple-
interface CanRun {
void run();
}
interface CanSwim {
void swim();
}
class Amphibian implements CanRun, CanSwim {
public void run() {
System.out.println("Amphibian is running");
}
public void swim() {
System.out.println("Amphibian is swimming");
}
}
public class Main {
public static void main(String[] args) {
Amphibian a = new Amphibian();
a.run(); // Method from CanRun interface
a.swim(); // Method from CanSwim interface
}
}

# **Method Overriding**

// Superclass
class Calculator {
// Method to be overridden
int add(int a, int b) {
return a + b;
}
}

// Subclass
class AdvancedCalculator extends Calculator {
// Overriding the add method
@Override
int add(int a, int b) {
System.out.println("AdvancedCalculator is adding two numbers:");
return a + b;
}

    // Additional method
    int add(int a, int b, int c) {
        return a + b + c;
    }

}

// Main class
public class Main {
public static void main(String[] args) {
// Creating an instance of Calculator
Calculator calc = new Calculator();
// Creating an instance of AdvancedCalculator
AdvancedCalculator advCalc = new AdvancedCalculator();

        // Using the Calculator instance to add two numbers
        int result1 = calc.add(5, 10);
        System.out.println("Result from Calculator: " + result1);

        // Using the AdvancedCalculator instance to add two numbers
        int result2 = advCalc.add(5, 10);
        System.out.println("Result from AdvancedCalculator: " + result2);

        // Using the AdvancedCalculator instance to add three numbers
        int result3 = advCalc.add(5, 10, 15);
        System.out.println("Result from AdvancedCalculator (three numbers): " + result3);
    }

}

output-
Result from Calculator: 15
AdvancedCalculator is adding two numbers:
Result from AdvancedCalculator: 15
Result from AdvancedCalculator (three numbers): 30

Summary:
Method Overriding: The AdvancedCalculator class overrides the add method from the Calculator class, providing a specialized implementation.
Extended Functionality: The AdvancedCalculator class introduces an additional method to handle adding three integers, showcasing how subclasses can extend the functionality of their superclasses.
Polymorphism: Demonstrates how method calls are resolved at runtime, with the AdvancedCalculator providing its specific implementation when its add method is called.

# **Object Class equals toString hashcode**

class Laptop {
String model;
int price;

    public String toString() {
        return model + " : " + price;
    }

    public boolean equals(Laptop that) { //that is a self made param
        return this.model.equals(that.model) && this.price == that.price;
    }
    //made a equals method to check if the content of the object is same or not becsuse the in buil equlas checks the objects

}

public class Demo {
public static void main(String[] args) {
Laptop obj = new Laptop();
obj.model = "Lenevo Yoga";
obj.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenevo Yoga";
        obj2.price = 1000;

        boolean result = obj.equals(obj2);

        System.out.println(obj.toString()); // This will print "Lenevo Yoga : 1000"
        System.out.println(result);         // This will print "true"
    }

}

# **Interface**

interface A {
int age = 44;
String area = "Mumbai";

    void show();
    void config();

}

class B implements A {
public void show() {
System.out.println("in show");
}

    public void config() {
        System.out.println("in config");
    }

}

public class Demo {
public static void main(String[] args) {
A obj;
obj = new B();

        obj.show();
        obj.config();

        System.out.println(A.area);
    }

}

Summary
Interface A:

Contains two constants: int age and String area. These are implicitly public, static, and final.
Defines two abstract methods: void show() and void config(), which must be implemented by any class that implements this interface.
Class B:

Implements the A interface.
Provides concrete implementations for the show() and config() methods.
Class Demo:

In the main method:
Creates a reference obj of type A and assigns it an instance of B.
Calls show() and config() methods on obj, which execute the implementations provided in class B.
Prints the value of the area constant from the A interface.
Key Points
The area constant in the interface is accessed using A.area and cannot be modified.
The show() and config() methods are implemented by B and are called on the obj reference, demonstrating polymorphism.
The code shows how to use interface constants and methods, and how interface methods can be implemented in a class.

# **enum**

enum Status{
Running, Failed, Pending, Success;
}
public class Demo {
public static void main(String[] args) {
Status s=Status.Pending;
switch(s)
{
case Running:
System.out.println("All Good");
break;
case Failed:
System.out.println("Try Again");
break;
case Pending:
System.out.println("Please Wait");
break;
default:
System.out.println("Done");
break;
}
if(s==Status.Running)
System.out.println("All Good");
else if(s==Status.Failed)
System.out.println("Try Again");
else if ( s==Status.Pending)
System.out.println("Please Wait");
else
System.out.println("Done");
}
}

Below is an example of an enum class in Java, which demonstrates how to define and use an enum with additional fields, methods, and a constructor.
enum Day {
MONDAY("Weekday"),
TUESDAY("Weekday"),
WEDNESDAY("Weekday"),
THURSDAY("Weekday"),
FRIDAY("Weekday"),
SATURDAY;
SUNDAY;

    private String type;

//// Default constructor
Day(){
this.type="Weekend"; //// Default type is Weekend
}

    // Constructor
    Day(String type) {
        this.type = type;
    }

    // Getter method
    public String getType() {
        return this.type;
    }

}
public class EnumExample {
public static void main(String[] args) {
// Iterate through the days
for (Day day : Day.values()) {
System.out.println(day + " is a " + day.getType());
}

        // Using switch case with enum
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Mondays are tough.");
                break;
            case FRIDAY:
                System.out.println("Fridays are great!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best!");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

}

\*\*Explanation
Enum Definition:

The Day enum defines constants for each day of the week.
Each constant is associated with a type ("Weekday" or "Weekend").
A constructor is defined to initialize the type for each constant.
A getter method (getType) is provided to access the type of each day.
Main Class:

The EnumExample class demonstrates how to use the Day enum.
It iterates through all enum constants using Day.values() and prints each day with its type.
It also shows how to use a switch-case statement with the Day enum to print specific messages for different days.
Key Points
Enums can have fields, methods, and constructors to provide additional functionality.
The enum constants can be used in switch-case statements for cleaner and more readable code.
The values() method returns an array of all enum constants, which is useful for iteration.\*\*

# **Custom exception**

You create a custom exception by defining a new class that extends either Exception (for checked exceptions) or RuntimeException (for unchecked exceptions).
Custom Exception: A user-defined exception class extending Exception or RuntimeException.
Purpose: Provides a way to handle specific application errors more effectively.
Usage: Define, throw, and catch custom exceptions to manage application-specific error conditions.

// Define a custom checked exception
class InvalidAgeException extends Exception {
// Constructor that accepts a message
public InvalidAgeException(String message) { //accepting a message, so have to pass message to the run time exception constructor using super
super(message); //This calls the constructor of the superclass (Exception) with the message parameter.Refers to the superclass (Exception in this case)
}
}

public class CustomExceptionExample {

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            // Throwing the custom exception with a message
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        else if (age < 18) {
            // Throwing the custom exception with a message
            throw new InvalidAgeException("Age must be 18 or older: " + age);
        }
        System.out.println("Age is valid: " + age);
    }
    public static void main(String[] args) {
        try {
            // Testing with valid age
            validateAge(25);

            // Testing with invalid age
            validateAge(-5);
        }
        catch (InvalidAgeException e) {
            // Handling the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

}

output-
Age is valid: 25
Exception caught: Age cannot be negative: -5
Program continues after exception handling.

Explanation:
Custom Exception Definition (InvalidAgeException):
Class Definition: Extends Exception to create a checked exception.
Constructor: Takes a String message and passes it to the super constructor of Exception.

Usage in validateAge Method:
Throwing Exception: Checks if the age is invalid and throws InvalidAgeException with an appropriate message.
Handling Exception: In the main method, the validateAge method is called, and any InvalidAgeException is caught and handled.
