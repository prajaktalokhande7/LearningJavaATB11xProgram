package ex_05_Typecasting;

public class Lab60_tycasting_logntoShort {

    public static void main(String[] args) {
        //implicit narrowing not possible
        long ph =9898989899L;
     //   short a = ph; //not allowed
        short b = (short)ph;
        System.out.println(b);
    }
}
