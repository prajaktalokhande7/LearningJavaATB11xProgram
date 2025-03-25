package ex_13_func;

import java.util.Scanner;

public class Lab131_arithmaticoperation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a=0;
        int b=0;
        if(Scanner.hasNextInt()){
             a =s.nextInt();
            b=s.nextInt();
        }else{
            System.out.println("Enter int values only");
            System.exit(0);
        }
        int subres = sub(a,b);
        System.out.println(subres);

        int addres = sum(a,b);
        System.out.println(addres);

        int mulres = mul(a,b);
        System.out.println(mulres);

        int divres = div(a,b);
        System.out.println(divres);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }


    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b){
        if( b==0){
            System.out.println("div by zero");
            System.exit(0);
        }
        return a/b;
    }


}
