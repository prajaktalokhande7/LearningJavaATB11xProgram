package ex_Task_4thapril;

public class encapsulationString {

    public static void main(String[] args) {
        Atb a = new Atb("ram",10000,"java");
        Atb[] rec = new Atb[4];

        rec[0]=new Atb("siya",90,"test");
        rec[1]=new Atb("karan",8666,"c");
        rec[2]= new Atb("riya",344,"pytjon");
        rec[3]= new Atb("chiya",989787,"data sci");

        for(int i=0;i<4;i++){
            System.out.println(rec[i]);
        }
    }
}
class Atb{
    String stud;
    int fee;
    String crs;

    Atb(String name,int fees,String course){
        this.stud=name;
        this.fee=fees;
        this.crs=course;
    }

    public String toString(){
       return "student name"+stud+"fees is"+fee+"course is"+crs;
    }
}