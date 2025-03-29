package ex_08_multiarray;

import java.util.Scanner;

public class Lab165_matrixMul_interview {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size");
        int size = s.nextInt();


        for(int i=0;i<size;i++){ ///row
            for(int j=0;j<size;j++){ //col
                System.out.println(i*j);
            }
            System.out.println();
        }

    }
}
