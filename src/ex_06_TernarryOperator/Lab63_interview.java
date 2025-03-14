package ex_06_TernarryOperator;

public class Lab63_interview {
    public static void main(String[] args) {
        //nested tesrnary

        //result = cond ? exp :(

        int no =35;
        String s = no >10 ? "a" : "b";
      //  String b = no >  10 ? "a" : (no >20 ? "yes" : "no<20");
        String b = no >  10 ? (no >20 ? "yes" : "no<20") : "b" ;//ideal way to write
        System.out.println(b);

    }
}
