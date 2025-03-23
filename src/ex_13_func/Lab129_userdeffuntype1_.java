package ex_13_func;

public class Lab129_userdeffuntype1_ {
    public static void main(String[] args) {
        int n1= sum_of_2_nos(3,4);
        int n2= sum_of_2_nos(13,14);
        System.out.println(n1);
        System.out.println(n2);
    }

    static int sum_of_2_nos(int a, int b){
        return(a+b);
    }
}
