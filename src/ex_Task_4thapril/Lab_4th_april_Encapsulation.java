package ex_Task_4thapril;

public class Lab_4th_april_Encapsulation {

    public static void main(String[] args) {

        ATB a = new ATB("java",10000);

        //String course_name =
       // System.out.println(a.crs);
a.setCrs("java");
        System.out.println("course is"+a.getCrs());
        System.out.println(a.getFees());
    }



}


class ATB{
    private String crs;
   private int fees;






    public ATB(String cr,int fee){
        this.crs= cr;
        this.fees=fee;
       // this.stud=stud;
    }

    public int getFees() {
        return fees;
    }

    public String getCrs() {
       return crs;
  }

  public void setCrs(String crs) {
        this.crs = crs;
    }
}


