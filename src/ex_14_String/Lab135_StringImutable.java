package ex_14_String;

public class Lab135_StringImutable {

    public static void main(String[] args) {

        String name = "promod";//str constant pool
        name.toUpperCase();
        System.out.println(name);//o/p will be pramod
       name=  name.toUpperCase();
        System.out.println(name);//o/p will be "PRAMOD"

        //str constant now has 2 values

    }
}
