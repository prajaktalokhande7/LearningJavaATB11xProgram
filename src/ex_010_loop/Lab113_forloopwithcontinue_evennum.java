package ex_010_loop;

public class Lab113_forloopwithcontinue_evennum {

    public static void main(String[] args) {

        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
                continue;
            }
            System.out.println("odd");
        }
    }
}
