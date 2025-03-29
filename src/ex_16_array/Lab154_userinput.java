package ex_16_array;

import java.util.Scanner;

public class Lab154_userinput {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();


        int[] test = new int[size];
        for(int i=0;i<test.length;i++){
            test[i]=s.nextInt();  ///interger values
        }

        for(int i=0;i<test.length;i++){
            System.out.println(test[i]);
        }
    }
}
