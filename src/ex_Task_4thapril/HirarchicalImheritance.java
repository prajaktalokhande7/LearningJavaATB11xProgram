package ex_Task_4thapril;

public class HirarchicalImheritance {

    public static void main(String[] args) {

        animal a = new animal();
        dog d = new dog();
        cat c = new cat();

        //int l = d.legs();

        //a.sound();
        d.sound();
         d.legs();
       // System.out.println("dog has"+leg);
        c.sound();
        a.legs();
    }
}

class animal {

    String animal = "dog";
    String animal1 = "cat";
    void sound(){
        System.out.println("makes sound");
    }

    void legs(){
        System.out.println("has 4 legs");
    }

}

class dog extends animal{
    void sound(){
        System.out.println("animal name"+animal);
        System.out.println("barks");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("animal name is "+animal1);
        System.out.println("mews");
    }
}