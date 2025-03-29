package ex_08_multiarray;

import java.util.Scanner;

public class Lab163_rghttriangle {

    public static void main(String[] args) {


        // n =3

        Scanner s = new Scanner(System.in);
        System.out.println("enter eg:3");
        int n = s.nextInt();


        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");

        }

    }

}
