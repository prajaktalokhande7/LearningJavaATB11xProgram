package ex_Task_4thapril;

public class multiInheritance {

    public static void main(String[] args) {

        teacher1 t = new teacher1();
        stud1 s = new stud1();
        parent p = new parent();


        s.study();
        p.check();
    }


}

class teacher1{

    String t1="rama";
    String sub="sci";

    void teach(){
        System.out.println(t1+"teaches"+sub);
    }


}

class stud1 extends teacher1{

    String s1 ="rahul";

    void study(){
        System.out.println(s1+"learns"+sub);
    }

    void marks(){
        System.out.println("scores marks");
    }
}

class parent extends stud1{

    String p1 = "dad";

    void check(){

        System.out.println(p1+"checks marks of"+s1+"for sub"+sub);
    }


}
