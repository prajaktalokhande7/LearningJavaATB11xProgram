package ex_19_Inheritance;

public class Lab_Prac_Vehical {

    public static void main(String[] args) {

        Vehical v = new Vehical();

        v.start();

        car c = new car();

        c.start();


    }

}

class Vehical{

    void start(){
        System.out.println("Vehical Started");
    }

}

class car extends Vehical{

    void start(){
        System.out.println("Car Started");
    }

}
