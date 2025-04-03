package ex_18_oopsConstroctor;

public class Lab180_parameterizedConst {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.name);
        System.out.println(c2.name);
        //default values are same for both c1 and c2


        //Create diff values for diffrent object
        Car c3 = new Car("Model 3","tesla",2015);
        Car c4 = new Car("Scoripo","mahindra",1990);

        System.out.println(c3.name);

    }

}

class Car{

    String name;
    String Modal;
    int year;


    Car(){
        Modal="tyu";
        name="yuyiuh";
        year=897;
        System.out.println("DC");
    }

    Car(String Modal_oc,String name_oc, int year_oc){
        this.name= name_oc;
        this.year =year_oc;
        this.Modal=Modal_oc;
    }

    //refrence variable that refers to current obj in the

}
