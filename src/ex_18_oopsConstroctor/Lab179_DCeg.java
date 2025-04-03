package ex_18_oopsConstroctor;

public class Lab179_DCeg {
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();
        //default value is given by constructor..till we dont provide some data
        System.out.println(c1.name);
    }


}

class car{
    String name;
    String model;
    int year;

    car(){
        name = "unkown car";
    }
}
