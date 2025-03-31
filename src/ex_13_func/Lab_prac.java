package ex_13_func;

import java.util.Scanner;

public class Lab_prac {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Eneter value of a");
        int a = s.nextInt();
        System.out.println("Enter value of b");
        int b = s.nextInt();

        int result = sum(a,b);
        int result1 = sub(a,b);


        System.out.println("ans is"+result);
        System.out.println("sub is"+result1);


    }

    public static int sum(int a, int b){

        int sum=a+b;
        return (sum);

    }

    public static int sub(int a, int b){

        int sub=a-b;
        return(sub);

    }

}
