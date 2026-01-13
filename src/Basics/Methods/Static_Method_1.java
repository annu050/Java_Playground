package Basics.Methods;

//Static Method Cannot Access Instance Variables
//The JVM executes the static method first, even before creating class objects.
//So, static methods cannot access instance variables, as no object exists at that point.
public class Static_Method_1 {

    // static variable
    static int a = 40;

    // instance variable
    int b = 50;

    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }

    // Declaration of a static method
    static void staticDisplay()
    {
        System.out.println(a);
    }

    // main method
    public static void main(String[] args)
    {
        Static_Method_1 obj = new Static_Method_1();
        obj.simpleDisplay();

        // Calling static method
        staticDisplay();
    }
}
