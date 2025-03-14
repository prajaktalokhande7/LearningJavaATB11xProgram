package ex_Task;

import java.util.Scanner;

public class Lab_13mar_TernnaryOperation {

    public static void main(String[] args) {
      //  int a=5;

//        int b = Integer.parseInt(args[10]);
//        System.out.println("enter the marks");

        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        String ans = (m >= 90 && m <= 100) ? "Grade A" : (m >= 80 && m <= 89) ? "Grade B" : (m >= 70 && m <= 79) ? "Grade C" : (m >= 60 && m <= 69) ? "Grade D" : "Fail";
        System.out.println(ans);
    }
}
