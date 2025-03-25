package ex_14_String;

public class Lab_interview1 {

    public static void main(String[] args) {

        String s1 = "Hi";
 String s4 = "Hi";
//    String s10 = "Hello";
//

        //ans is 1
        //duplicate not allowe


        String s2 =new String("Hi");
        String s9 =new String("hi");

        //check the refrence in the Heap loc, str constnt pool and Object Area (OA)
        System.out.println(s1 == s2);
        System.out.println(s2 == s9);
        System.out.println(s1 == s4);

        s1.equals(s2); //true value are same
        s1.equals(s9); ///no case is diffrent
        s1.equalsIgnoreCase(s9);//true

    }

}
