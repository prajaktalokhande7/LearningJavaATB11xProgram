package ex_Task;

import java.util.Scanner;

public class Lab_21mar_StringPalindrome {

    public static void main(String neha[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.next();
        System.out.println(name);


        int strLen = name.length();

        String rev = "";


        for(int i=strLen-1;i>=0;i--){

            rev = rev + name.charAt(i);


        }
        System.out.println("Reverse of String is:"+rev);



        if(name.equals(rev)){
            System.out.println("String is a palindrome");
        }else {
            System.out.println("String is not a palindrome");
        }





    }


}
