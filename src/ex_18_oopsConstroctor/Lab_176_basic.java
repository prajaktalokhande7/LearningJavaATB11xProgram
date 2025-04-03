package ex_18_oopsConstroctor;

public class Lab_176_basic {

    public static void main(String[] args) {

        Baby b1 = new Baby();


    }


}
//Constructor:
//special method invoked at the time of object creation. purpose is to initilize the datamembers/attributes
//rule: same name as class name, does not return anything..not even void ,
// called only once
//types default, parameterized and copy(copy is nvr used in auto)
// use : when u go out mom asks to eat n go , take somthing along to eat...similarly when we crate a class is created consturotr is automatically called.
// no memory allocated
class Baby{
    //attribute
    String name;

    //behaviour
    void cry(){
        System.out.println("cry");
    }
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }

    //Default constructor
    Baby(){
        System.out.println("I am default constructor");

        //can write a code here eg: fetch data from sql or read from csv file
    }
}

