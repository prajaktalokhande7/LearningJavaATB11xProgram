package ex_16_array;

import java.util.Scanner;

public class Lab_Prac2_3rdmaxNo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = s.nextInt();


        int[] a = new int[size];

        System.out.println("Enter the values in the  array");
        for(int i=0; i < size; i++){
            a[i] = s.nextInt();
        }

        System.out.println("array is :");
        for(int i=0;i< a.length;i++){
            System.out.println(a[i]);
        }

        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println("max value is :" +max);

        int max2 =0;

        for(int i=0;i<a.length;i++){
            if(a[i]<max && a[i]>max2){
                max2 = a[i];
            }
        }

        System.out.println("max value is :"+max2);

        int max3 =0;

        for(int i=0;i<a.length;i++){
            if(a[i]<max2 && a[i]>max3){
                max3 = a[i];
            }
        }

        System.out.println("max value is"+max3);
    }
}
