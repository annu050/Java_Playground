package Basics.Methods;

abstract class Anusha{
    abstract void check(String name);
}
//Abstract methods have no body and must be overridden in a subclass.
// They are called using an object of the subclass.
public class Abstract_Method extends Anusha{

    @Override
    void check(String name){
        System.out.println("name: "+ name);
    }

    public static void main(String[] args){
        Abstract_Method obj=new Abstract_Method();
        obj.check("Anusha Tiwari");
    }
}
