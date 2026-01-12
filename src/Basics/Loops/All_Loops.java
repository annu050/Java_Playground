package Basics.Loops;

public class All_Loops {
    public static void main(String[] args){

        //For loop
        for(int i=1;i<=5;i++){
            System.out.println("i = "+i);
        }

        //while loop
        int j=1;
        while(j<=5){
            System.out.println("j = "+j);
            j++;
        }

        //do-while loop
        int k=1;
        do{
            System.out.println("k= "+k);
            k++;
        }while(k<=5);

        //enhanced for loop(for each loop)
        int[] numbers={10,20,30,40,50};
        for(int num: numbers){
            System.out.println("num= "+num);
        }
    }
}
