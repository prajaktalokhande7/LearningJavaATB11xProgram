package ex_250eg;

import java.util.Scanner;

public class Lab_userInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the name");
        String name = s.nextLine();
        System.out.println("enter the age");
        int age = s.nextInt();
        System.out.println("Name is :"+name+"age is"+age);

    }
}
