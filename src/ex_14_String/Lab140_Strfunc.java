package ex_14_String;

public class Lab140_Strfunc {

    public static void main(String[] args) {


        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10));//outof bound exception
        System.out.println(name.concat("Patel"));
        System.out.println(name.contains("om"));
        System.out.println(name.equals("sonal"));
        System.out.println(name.equalsIgnoreCase("SONAL"));


        String name4 = "prajakta.hope@gmail.com";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);


        System.out.println(name.substring(1,3));
        System.out.println(name.startsWith("s"));
        System.out.println(name.endsWith("l"));


        String name3 ="Sonal Harish";
        System.out.println(name3.trim());


        System.out.println(name.compareTo("Sonal")); //gives int value instead of tru and false


        String n = "pramodDutta";
        System.out.println(n.indexOf("d"));//5
        System.out.println(n.lastIndexOf("d"));//6
        System.out.println(n.indexOf("s")); //-1













    }
}
