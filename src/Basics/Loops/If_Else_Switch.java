package Basics.Loops;

public class If_Else_Switch {
    public static void main(String[] args){
        int number =10;
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is positive.");
        }

        // switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
