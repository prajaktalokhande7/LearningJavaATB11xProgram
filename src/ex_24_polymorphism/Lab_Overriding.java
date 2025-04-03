package ex_24_polymorphism;

public class Lab_Overriding {
    //runtime polymorphism

    public static void main(String[] args){

        dog d = new dog();
        d.sound();
    }
}
class animal{

    void sound(){
        System.out.println("sound");
    }

}

class dog extends animal{

    void sound(){
        System.out.println("bark");
    }
}