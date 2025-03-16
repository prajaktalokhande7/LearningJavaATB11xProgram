package ex_Task;

import java.util.Scanner;

public class Lab_14mar_evenOdd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value for no1");
        int a = s.nextInt();
        if(a%2==0){
            System.out.println("Value is even ");
        }
        else {
            System.out.println("Value is odd");
        }


    }
}
