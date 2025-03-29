package ex_08_multiarray;

import java.util.Scanner;

public class Lab164_reverseRightTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter eg:3");
        int n = s.nextInt();


        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }



    }
}
