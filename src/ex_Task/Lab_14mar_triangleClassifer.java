package ex_Task;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab_14mar_triangleClassifer {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side 1 value");
        int s1 = s.nextInt();
        System.out.println("Enter the side 2 value");
        int s2 = s.nextInt();
        System.out.println("Enter the side 3 value");
        int s3 = s.nextInt();

        if(s1 <=0 || s2 <=0 ||s3<=0){
            System.out.println("not a triangle");
            System.exit(0);
        }

        if(s1+s2 <=s3 || s2+s3<=s1 || s1+s3<=s2){
            System.out.println("this is not a triangle");
            System.exit(0);
        }

        if(s1==s2 && s1==s3){
            System.out.println("Equilateral triangle");
        } else if (s1==s2 && s1!=s3) {
            System.out.println("isosceles triangle");

        } else if (s1!=s2 && s2!=s3) {
            System.out.println("scalene triangle");

        }
        s.close();
    }
}
