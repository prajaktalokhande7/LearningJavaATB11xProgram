package ex_13_func;

import java.util.Scanner;

public class Lab_prac_middleCharOfStr {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.next();

        int strLen = name.length();

        int midvalue = strLen/2;


        char mid = name.charAt(midvalue);

        System.out.println(mid);

    }

//    static String  middlechar(int strLen, String name){
//
//        char mid;
//        for(int i=0; i<=strLen; i++){
//
//        }
//    }
}
