package ex_17_OOPS;

public class Lab_166_Basic_class {

    public static void main(String[] args) {

        Person amit;
        Person p2; //(class refrence) = new Person();//object

        //Person-- class
        //p2 --Class refrence
        //new person() ---Object


        //p2.name = "veda";
        System.out.println();


        //new Person().name = "not a ref";
    }


    class Person{
        //aatribute\properties\data member\instance variable


        String name;
        String phone;
        String color_eyes;
        int legs;
        double salary;
        byte age;
        double weight;
        boolean isMale;


        //behavioue/funtion/method


        void sleep(){
            System.out.println("I am sleeping");
        }


        String greet(String name){
            return "Hello"+name;
        }

        void talk(){
            System.out.println("i am speaking");
        }

    }
}
