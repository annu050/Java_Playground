package Basics.Methods;

//Types of Instance Methods:
//There are two types of Instance methods in Java:
//1. Accessor Methods (Getters)
//2. Mutator Methods (Setters)

class account {

    // private variable-balance
    private int balance = 50;

    // accessor method (getter)
    public int getBalance(){

        return balance;
    }

    // Mutator method (setter)
    public void setBalance(int a){

        // return balance + a;
        balance += a;
    }
}
class Instance_Method{

    public static void main(String[] args){

        account obj = new account();

        // setting new value for balance
        obj.setBalance(50);

        // calling the Mutator (accessor)
        System.out.println("Your Balance : "+ obj.getBalance());

        System.out.println("GFG!");
    }
}
