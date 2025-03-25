package ex_15_StrBulider_strBuffer;

public class Lab148_sbuufer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" programmin");
        System.out.println(sb);
        sb.delete(5,16);//delete substring
        System.out.println(sb);
        sb.replace(0,4,"c++");
        System.out.println(sb);
    }
}
