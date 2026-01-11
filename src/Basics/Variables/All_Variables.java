package Basics.Variables;

public class All_Variables {

    //instance variable belong to each object
    int instanceVar=10;

    static String staticVariable="Hi i am static";

    public void showAllVariables(){
        int localVariable=5;
        System.out.println("Instance variable: "+ instanceVar);
        System.out.println("Static variable: "+ staticVariable);
        System.out.println("Local variable: "+ localVariable);
    }

    public static void main(String[] args){
        All_Variables obj= new All_Variables();
        obj.showAllVariables();

        //trying to access static variable via a class call
        System.out.println("static variable via a class call: "+ All_Variables.staticVariable);
    }

}
