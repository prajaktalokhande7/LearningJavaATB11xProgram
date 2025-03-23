package ex_Task;

import java.util.Scanner;

public class Lab_21mar_VowelAndConsonent {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.next();
        System.out.println("Entered name is"+name);

        int strLen = name.length();
        System.out.println(strLen);

        int count =0;
        int count1=0;

        for(int i=0;i<strLen;i++){

            char a =name.charAt(i);
            System.out.println(a);
            if(a=='a' || a=='e'|| a=='i' || a=='o' ||a=='u'){
                count = count+1;
            }else {
                count1 = count1+1;
            }
        }

        System.out.println("vowel count is :"+count);
        System.out.println("Consonent count is"+count1);



    }
}
