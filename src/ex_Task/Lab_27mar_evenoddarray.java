package ex_Task;

import java.util.Scanner;

public class Lab_27mar_evenoddarray {


    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");
        int size = s.nextInt();

        int[] a = new int[size];

        System.out.println("Enter the value");

        for(int i=0;i<size;i++){

            a[i]=s.nextInt();

        }

        System.out.println("Array is");

        for(int i=0;i<size;i++){

            System.out.println(a[i]);

        }

        System.out.println("even array");

        for(int i=0;i<size;i++) {

            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

        System.out.println("Odd array");
            for(int i=0;i<size;i++){

                if(a[i]%2!=0){
                    System.out.println(a[i]);
                }

            }

s.close();

    }


}
