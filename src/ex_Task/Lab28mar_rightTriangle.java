package ex_Task;

import java.util.Scanner;

public class Lab28mar_rightTriangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter eg:3");
        int n = s.nextInt();

        for(int i=0; i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  *  ");
            }
            System.out.println("");

        }


    }

}
