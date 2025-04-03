package ex_18_oopsConstroctor;

public class Lab181_egParaConst {

    public static void main(String[] args) {

        Person p1 = new Person("amit","pune",23);

        Person p2 = new Person("neha",7467);
        System.out.println(p2.add);

        p1.eat();
        p2.eat();



    }

}


class Person{

    String name;
    String add;
    long ph;



    void eat(){
        System.out.println(this.name);
    }
    Person(){

    }

    Person(String name_arg, String add_arg, long ph_arg){
        this.name = name_arg;
        this.add = add_arg;
        this.ph = ph_arg;
    }


    Person(String name_arg, long ph_arg){
        this.name = name_arg;
      //  this.add = add_arg;
        this.ph = ph_arg;
    }
}
