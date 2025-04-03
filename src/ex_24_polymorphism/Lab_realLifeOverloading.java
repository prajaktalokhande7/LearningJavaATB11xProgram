package ex_24_polymorphism;

public class Lab_realLifeOverloading {
    public static void main(String[] args) {
        home h = new home();
        h.task(2);
        h.task(3,5);
    }


}


class home{

    void task(int a){
        System.out.println(a);
    }

    void task(int a, int b){
        System.out.println(b);
    }


    void task(int a, int b,int c){
        System.out.println(c);
    }
}
