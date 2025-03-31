package ex_13_func;

public class Lab130_withparawithoutreturn {
    public static void main(String[] args) {

        type1();

        String msg = type2();
        System.out.println(msg);

        type3("neha",3,300);
    }

//without parameter without return type
    static void type1(){
        System.out.println("hi");
    }

    //Without para with return type
    static String type2(){
        System.out.println("hi");
        return "how are u";
    }

    // with para without return type

    static void type3(String name, int age, double sal){

        System.out.println("name is"+name+""+"age"+age+"sal"+sal);
    }

    // with para with return

    //static int type4()

}
