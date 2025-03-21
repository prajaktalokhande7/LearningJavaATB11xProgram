package ex_Task;

import java.util.Scanner;

public class Lab_20mar_fabonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int num= s.nextInt();
        int ans;
        int n=num;
        int first=0;
        int second=1;

        System.out.println("series"+first+ "  " +second);
        for(int i=2;i<=num;i++){

            int next = first + second;
            System.out.println(" "+next);
            first=second;
            second=next;
        }

        s.close();





    }
}
