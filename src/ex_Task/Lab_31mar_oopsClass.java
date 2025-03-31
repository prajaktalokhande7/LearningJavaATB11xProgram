package ex_Task;

public class Lab_31mar_oopsClass {

    public static void main(String[] args) {
        Person p = new Person();

    }

}

class Person{

    String name;
    int age;
    String city;
    int pin;
    String Occupation;
    Double Salary;
    float Height;
    float weight;
    int ph;
    String Qualification;


    void wakes_up(){
        System.out.println("Wakes up early morning");
    }


    String travel(String city){

        String place = "Pune";

        System.out.println("travels to :"+place);

        return(place);
    }

    String job(){
        String loc= "Netwin";
        System.out.println("works at"+loc);
        return(loc);
    }


    static void details(String name, int age, double sal){

        System.out.println("name is"+name+""+"age"+age+"sal"+sal);
    }
}
