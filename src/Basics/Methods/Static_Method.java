package Basics.Methods;

//Static Methods belong to a class not to a object, they can be called without creating the object
//Why Use Static Methods?
//To access or modify static variables or perform actions not tied to any instance.

class Test{
    static void hello(){
        System.out.println("Hello");
    }
}
public class Static_Method {
    public static void main(String[] args){
        Test.hello();
    }
}
