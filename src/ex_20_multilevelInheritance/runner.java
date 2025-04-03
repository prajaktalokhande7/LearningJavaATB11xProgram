package ex_20_multilevelInheritance;

public class runner {

    public static void main(String[] args) {

        son s1 = new son();
        s1.f();
        s1.s();

        Grandfather gf = new Grandfather();
        gf.g();


        Father f1 = new Father();

    }

}
