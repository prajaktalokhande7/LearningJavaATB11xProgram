package ex_05_Typecasting;

public class Lab58_TypeCasting_Narrowing {

    public static void main(String[] args) {
        int a =10;
       // byte b = a; //Invalid
        // implicit casting not allowed in arrowing

        byte c = (byte)a; // this ia allowed but data loss will occur
        System.out.println(c);
    }
}
