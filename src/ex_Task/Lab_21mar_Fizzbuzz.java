package ex_Task;

public class Lab_21mar_Fizzbuzz {

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){

            if(i%3==0 && i%5==0){
                System.out.println("Fizzbuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");

            } else if (i%5==0) {
                System.out.println("buzz");

            }
            else {
                System.out.println(i);
            }

        }


    }

}
