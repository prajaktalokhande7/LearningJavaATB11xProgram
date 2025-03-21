package ex_12_doWhil;

public class Lab126_diff {

    public static void main(String[] args) {
        int a=0;
        while(a<0){
            System.out.println(a);
            a++;
        }


        do{
            System.out.println(a);
            a++;
        }while(a<0);
    }
}
