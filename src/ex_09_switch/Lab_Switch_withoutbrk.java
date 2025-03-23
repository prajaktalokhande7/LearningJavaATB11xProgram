package ex_09_switch;

import java.util.Scanner;

public class Lab_Switch_withoutbrk {


        public static void main(String[] args) {


            Scanner s= new Scanner(System.in);
            System.out.println("enter the number");
            int num = s.nextInt();

            switch (num){

                case 1 :
                    System.out.println("Today is monday");

                case 2 :
                    System.out.println("Today is Tuesday");

                case 3 :
                    System.out.println("Today is Wednesday");

                case 4 :
                    System.out.println("Today is Thursday");

                case 5 :
                    System.out.println("Today is Friday");

                case 6 :
                    System.out.println("Today is Saturday");

                case 7 :
                    System.out.println("Today is Sunday");

            }



        }
    }





