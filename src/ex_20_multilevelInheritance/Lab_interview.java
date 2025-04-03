package ex_20_multilevelInheritance;

public class Lab_interview {
    public static void main(String[] args) {

       // son s1 = new Grandfather(); //not possible


        //Concept--Dynamic dispatch
        Grandfather g1 = new son(); //when ur born gf is present
        Grandfather g2 = new Father();
        Father f1 =new son();

        // this is used in WebDriver driver = new ChromeDriver();

        //if same function in all of them
        g1.home(); // g1 will call with object so it is son , not by refrence which is gf
        f1.home(); //son home is called
        g2.home(); //father home is called

        //purpose of dynamic dispatch : whoever obj is created that is called



        son amit = new son();
        amit.s();
        System.out.println(amit.a);



    }
}
