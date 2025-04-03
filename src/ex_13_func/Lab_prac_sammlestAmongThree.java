package ex_13_func;

import java.util.Scanner;

public class Lab_prac_sammlestAmongThree {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three nos:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();


        smallest(n1,n2,n3);

    }

    static void smallest(int a, int b, int c){

        if(a<b && a<c){
            System.out.println("n1 is the samllest number"+a);
        } else if (b<a && b<c) {
            System.out.println("n2 is the smallest number"+b);

        }else {
            System.out.println("n3 is the smallest"+c);
        }

        //return(res);
    }

}
