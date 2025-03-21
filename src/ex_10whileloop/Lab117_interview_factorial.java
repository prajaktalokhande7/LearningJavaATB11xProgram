package ex_10whileloop;

import java.util.Scanner;

public class Lab117_interview_factorial {

    public static void main(String[] args) {

        //factorial

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num =s.nextInt();


        int fact =1;
        if(num<=0){
            System.out.println(fact);
        }else{

            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
        }

        System.out.println("fact is"+fact);


    }

}
