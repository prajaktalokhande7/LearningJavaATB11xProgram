package ex_14_String;

public class Lab140_Strfunc {

    public static void main(String[] args) {


        String name = "Sonal";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10));//outof bound exception


        //concat
        System.out.println(name.concat("Patel"));


        //contains
        System.out.println(name.contains("om"));

        //equals
        System.out.println(name.equals("sonal"));

        //equalIgnorecase
        System.out.println(name.equalsIgnoreCase("SONAL"));


        //indexof
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        System.out.println(s1.indexOf('m'));

        System.out.println(name.replace('n','N'));




        String name4 = "prajakta.hope@gmail.com";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring
        System.out.println(name.substring(1,3));

        //starts with s
        System.out.println(name.startsWith("s"));

        //ends with l
        System.out.println(name.endsWith("l"));

        //tolowercase
        System.out.println("SONAL".toLowerCase());

        //touppercase
        System.out.println("sonal".toUpperCase());

        //trim
        String name3 ="Sonal Harish";
        System.out.println(name3.trim());

        //compare to
        System.out.println(name.compareTo("Sonal")); //gives int value instead of tru and false

        //String Builder
        StringBuilder sb = new StringBuilder("sonal");
        System.out.println(sb);

        System.out.println(sb.toString());

        String palin = "Niagara. O roar again!";
        String roar = palin.substring(11,15);
        System.out.println(roar);


        String s11="Pramod";
        String s21 = s11.concat("dutta");
        System.out.println(s21);

        String s111 = "hello";
        String s222 = "world";

        String s33 = "ji";
        String result = s111 + s222 + s33;
        System.out.println(result);

        String n = "pramodDutta";
        System.out.println(n.indexOf("d"));//5
        System.out.println(n.lastIndexOf("d"));//6
        System.out.println(n.indexOf("s")); //-1















    }
}
