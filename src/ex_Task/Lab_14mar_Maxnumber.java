package ex_Task;

import java.util.Scanner;

public class Lab_14mar_Maxnumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter no1 :");
        int a = s.nextInt();
        System.out.println("Enter no 2 :");
        int b = s.nextInt();
//        int a =5;
//        int b=6;
        String ans = a>b? "a is greater" : "b is greater";
        System.out.println(ans);
    }
}
