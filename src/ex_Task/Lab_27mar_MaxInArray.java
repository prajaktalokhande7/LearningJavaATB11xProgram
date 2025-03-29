package ex_Task;

import java.util.Scanner;

public class Lab_27mar_MaxInArray {


    public static void main(String[] args) {

        int max_2 = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = s.nextInt();



        int[]a;


             a= new int[size];


        System.out.println("Enter the values");

        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }

        System.out.println("Array is");
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }


        int max=a[0];


        for(int i=0;i<a.length;i++){
            if(a[i]>max){

                max=a[i];
            }
        }

        System.out.println("Max value in array is"+ max);

        for(int i=0;i<size;i++){
            if(a[i]>max_2 && a[i]<max){
                max_2=a[i];
            }
        }

        System.out.println("2nd largest value is" + max_2);

    }

}
