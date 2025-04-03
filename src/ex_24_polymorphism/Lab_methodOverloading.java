package ex_24_polymorphism;

public class Lab_methodOverloading {

    public static void main(String[] args) {
        MathOperatio m = new MathOperatio();
        int r1 = m.add(3,4);
        int r2 = m.add(3,4,5);
        double r3 = m.add(3,2);
    }
}


class MathOperatio{

    //same class has a method with diff argument

    int add(int a, int b){
        return a+b;
    }

    int add(int a , int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

}
