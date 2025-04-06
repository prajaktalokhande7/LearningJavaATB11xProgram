package ex_Task_4thapril;

public class SingleInheritance {

    public static void main(String[] args) {

        teacher t = new teacher();
        stud s = new stud();

        t.sub1="history";
        t.teach();
        s.name="qa";
        s.study();
    }
}

class teacher{

    String teacher1="neha";
    String sub1="math";
    String sub2="sci";
    String teacher2="juhi";

    void teach(){
        System.out.println("teach subjects");
    }

    void marks(){
        System.out.println("check paper and give marks");
    }
}

class stud extends teacher{

    String name = "tej";

    void study(){
        System.out.println("tej study"+sub1);
    }

}
